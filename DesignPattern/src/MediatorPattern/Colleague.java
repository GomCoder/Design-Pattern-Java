package MediatorPattern;

public interface Colleague {
	//Mediator�� �����Ѵ�.
	public abstract void setMediator(Mediator mediator);
	
	//Meidator���� Ȱ��/��Ȱ���� �����Ѵ�.
	public abstract void setColleagueEnable(boolean enabled);
}
