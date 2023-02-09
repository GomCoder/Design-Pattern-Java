package MediatorPattern;

import java.awt.CheckboxGroup;
import java.awt.Color;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginFrame extends Frame implements ActionListener, Mediator{
	private ColleagueCheckbox checkGuest;
	private ColleagueCheckbox checkLogin;
	private ColleagueTextField textUser;
	private ColleagueTextField textPass;
	private ColleagueButton buttonOk;
	private ColleagueButton buttonCancel;
	
	//Colleague를 생성하고 배치한 후에 표시한다.
	public LoginFrame(String title) {
		super(title);
		
		//배경색을 설정한다.
		setBackground(Color.lightGray);
		
		//레이아웃 매니저를 사용해 4X2 그리드를만든다.
		setLayout(new GridLayout(4, 2));
		
		//Colleague를 생성한다.
		createColleagues();
		
		//배치한다.
		add(checkGuest);
		add(checkLogin);
		add(new Label("Username: "));
		add(textUser);
		add(new Label("Password: "));
		add(textPass);
		add(buttonOk);
		add(buttonCancel);
		
		//활성/비활성 초기 설정을 한다.
		colleagueChanged();
		
		//표시한다.
		pack();
		setVisible(true);
	}
	
	//Colleague를 생성한다.
	@Override
	public void createColleagues() {
		//CheckBox
		CheckboxGroup g = new CheckboxGroup();
		checkGuest = new ColleagueCheckbox("Guest", g, true);
		checkLogin = new ColleagueCheckbox("Login", g, false);
		
		//TextField
		textUser = new ColleagueTextField("", 10);
		textPass = new ColleagueTextField("", 10);
		textPass.setEchoChar('*');
		
		//Button
		buttonOk = new ColleagueButton("OK");
		buttonCancel = new ColleagueButton("Cancel");
		
		
		//Mediator를 설정한다
		checkGuest.setMediator(this);
		checkLogin.setMediator(this);
		textUser.setMediator(this);
		textPass.setMediator(this);
		buttonOk.setMediator(this);
		buttonCancel.setMediator(this);
		
		//Listener 설정
		checkGuest.addItemListener(checkGuest);
		checkLogin.addItemListener(checkLogin);
		textUser.addTextListener(textUser);
		textPass.addTextListener(textPass);
		buttonOk.addActionListener(this);
		buttonCancel.addActionListener(this);
	}
	
	//Colleague의 상태가 바뀌면 호출된다.
	@Override
	public void colleagueChanged() {
		if(checkGuest.getState()) {
			//게스트 로그인
			textUser.setColleagueEnable(false);
			textPass.setColleagueEnable(false);
			buttonOk.setColleagueEnable(true);
		} else {
			//사용자 로그인
			textUser.setColleagueEnable(true);
			userpassChanged();
		}
	}
	
	//textUser 또는 textPass의 변경이 있다면 각 Colleague의 활성/비활성을 판정
	private void userpassChanged() {
		if(textUser.getText().length() > 0) {
			textPass.setColleagueEnable(true);
			if(textPass.getText().length() > 0) {
				buttonOk.setColleagueEnable(true);
			} else {
				buttonOk.setColleagueEnable(false);
			}
		} else {
			textPass.setColleagueEnable(false);
			buttonOk.setColleagueEnable(false);
		}
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println(e.toString());
		System.exit(0);
	}
}
