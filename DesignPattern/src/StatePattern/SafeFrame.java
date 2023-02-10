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
	private TextField textClock = new TextField(60); //���� �ð� ǥ��
	private TextArea textScreen = new TextArea(10, 60); //��� ���� ���
	private Button buttonUse = new Button("�ݰ� ���"); //�ݰ� ��� ��ư
	private Button buttonAlram = new Button("���"); //��� ��ư
	private Button buttonPhone = new Button("�Ϲ� ��ȭ"); //�Ϲ� ��ȭ ��ư
	private Button buttonExit = new Button("����"); //���� ��ư
	
	private State state = DayState.getInstance(); //���� ����
	
	//������
	public SafeFrame(String title) {
		super(title);
		setBackground(Color.lightGray);
		setLayout(new BorderLayout());
		
		//textClock ��ġ
		add(textClock, BorderLayout.NORTH);
		textClock.setEditable(false);
		//textScreen ��ġ
		add(textScreen, BorderLayout.CENTER);
		textScreen.setEditable(false);
		//�гο� ��ư ����
		Panel panel = new Panel();
		panel.add(buttonUse);
		panel.add(buttonAlram);
		panel.add(buttonPhone);
		panel.add(buttonExit);
		//�� �г��� ��ġ
		add(panel, BorderLayout.SOUTH);
		//ǥ��
		pack();
		setVisible(true);
		//������ ����
		buttonUse.addActionListener(this);
		buttonAlram.addActionListener(this);
		buttonPhone.addActionListener(this);
		buttonExit.addActionListener(this);
	}

	@Override
	public void setClock(int hour) {
		String clockString = String.format("���� �ð��� %02d:00", hour);
		System.out.println(clockString);
		textClock.setText(clockString);
		state.doClock(this, hour);
	}

	@Override
	public void changeState(State state) {
		System.out.println(this.state + "����" + state + "���� ���°� ��ȭ�߽��ϴ�.");
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
