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
	
	//Colleague�� �����ϰ� ��ġ�� �Ŀ� ǥ���Ѵ�.
	public LoginFrame(String title) {
		super(title);
		
		//������ �����Ѵ�.
		setBackground(Color.lightGray);
		
		//���̾ƿ� �Ŵ����� ����� 4X2 �׸��带�����.
		setLayout(new GridLayout(4, 2));
		
		//Colleague�� �����Ѵ�.
		createColleagues();
		
		//��ġ�Ѵ�.
		add(checkGuest);
		add(checkLogin);
		add(new Label("Username: "));
		add(textUser);
		add(new Label("Password: "));
		add(textPass);
		add(buttonOk);
		add(buttonCancel);
		
		//Ȱ��/��Ȱ�� �ʱ� ������ �Ѵ�.
		colleagueChanged();
		
		//ǥ���Ѵ�.
		pack();
		setVisible(true);
	}
	
	//Colleague�� �����Ѵ�.
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
		
		
		//Mediator�� �����Ѵ�
		checkGuest.setMediator(this);
		checkLogin.setMediator(this);
		textUser.setMediator(this);
		textPass.setMediator(this);
		buttonOk.setMediator(this);
		buttonCancel.setMediator(this);
		
		//Listener ����
		checkGuest.addItemListener(checkGuest);
		checkLogin.addItemListener(checkLogin);
		textUser.addTextListener(textUser);
		textPass.addTextListener(textPass);
		buttonOk.addActionListener(this);
		buttonCancel.addActionListener(this);
	}
	
	//Colleague�� ���°� �ٲ�� ȣ��ȴ�.
	@Override
	public void colleagueChanged() {
		if(checkGuest.getState()) {
			//�Խ�Ʈ �α���
			textUser.setColleagueEnable(false);
			textPass.setColleagueEnable(false);
			buttonOk.setColleagueEnable(true);
		} else {
			//����� �α���
			textUser.setColleagueEnable(true);
			userpassChanged();
		}
	}
	
	//textUser �Ǵ� textPass�� ������ �ִٸ� �� Colleague�� Ȱ��/��Ȱ���� ����
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
