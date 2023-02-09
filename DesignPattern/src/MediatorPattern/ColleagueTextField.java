package MediatorPattern;

import java.awt.Color;
import java.awt.TextField;
import java.awt.event.TextEvent;
import java.awt.event.TextListener;

public class ColleagueTextField extends TextField implements TextListener, Colleague{
	private Mediator mediator;
	
	public ColleagueTextField(String text, int columns) {
		super(text, columns);
	}
	
	//Mediator�� �����Ѵ�.
	@Override
	public void setMediator(Mediator mediator) {
		this.mediator = mediator;
	}

	//Mediator���� Ȱ��/��Ȱ���� �����Ѵ�.
	@Override
	public void setColleagueEnable(boolean enabled) {
		setEnabled(enabled);
		//Ȱ��/��Ȱ���� �°� ������ �����Ѵ�.
		setBackground(enabled? Color.white : Color.lightGray);
	}

	@Override
	public void textValueChanged(TextEvent e) {
		//���ڿ��� �ٲ�� Mediator�� �˸���.
		mediator.colleagueChanged();
	}

}
