package StatePattern;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SafeFrame extends Frame implements ActionListener, Context{
	private TextField textClock = new TextField(60); //현재 시간 표시
	private TextArea textScreen = new TextArea(10, 60); //경비 센터 출력
	private Button buttonUse = new Button("금고 사용"); //금고 사용 버튼
	private Button buttonAlram = new Button("비상벨"); //비상벨 버튼
	private Button buttonPhone = new Button("일반 통화"); //일반 통화 버튼
	private Button buttonExit = new Button("종료"); //종료 버튼
	
	private State state = DayState.getInstance(); //현재 상태
	
	//생성자
	public SafeFrame(String title) {
		super(title);
		setBackground(Color.lightGray);
		setLayout(new BorderLayout());
		
		//textClock 배치
		add(textClock, BorderLayout.NORTH);
		textClock.setEditable(false);
		//textScreen 배치
		add(textScreen, BorderLayout.CENTER);
		textScreen.setEditable(false);
		//패널에 버튼 저장
		Panel panel = new Panel();
		panel.add(buttonUse);
		panel.add(buttonAlram);
		panel.add(buttonPhone);
		panel.add(buttonExit);
		//그 패널을 배치
		add(panel, BorderLayout.SOUTH);
		//표시
		pack();
		setVisible(true);
		//리스너 설정
		buttonUse.addActionListener(this);
		buttonAlram.addActionListener(this);
		buttonPhone.addActionListener(this);
		buttonExit.addActionListener(this);
	}

	@Override
	public void setClock(int hour) {
		String clockString = String.format("현재 시간은 %02d:00", hour);
		System.out.println(clockString);
		textClock.setText(clockString);
		state.doClock(this, hour);
	}

	@Override
	public void changeState(State state) {
		System.out.println(this.state + "에서" + state + "으로 상태가 변화했습니다.");
		this.state = state;
	}

	@Override
	public void callSecurityCenter(String msg) {
		textScreen.append("call! " + msg + "\n");
	}

	@Override
	public void recordLog(String msg) {
		textScreen.append("record ... " + msg + "\n");
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println(e.toString());
		
		if(e.getSource() == buttonUse) {
			state.doUse(this);
		} else if(e.getSource() == buttonAlram) {
			state.doAlram(this);
		} else if(e.getSource() == buttonPhone) {
			state.doPhone(this);
		} else if(e.getSource() == buttonExit) {
			System.exit(0);
		} else {
			System.out.println("?");
		}
	}
}
