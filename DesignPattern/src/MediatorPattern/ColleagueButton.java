package MediatorPattern;

import java.awt.Button;

public class ColleagueButton extends Button implements Colleague{
	private Mediator mediator;
	
	public ColleagueButton(String caption) {
		super(caption);
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
	}
	
	
	
}
