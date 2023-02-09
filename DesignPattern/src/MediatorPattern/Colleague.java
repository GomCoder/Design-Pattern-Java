package MediatorPattern;

public interface Colleague {
	//Mediator를 설정한다.
	public abstract void setMediator(Mediator mediator);
	
	//Meidator에서 활성/비활성을 지시한다.
	public abstract void setColleagueEnable(boolean enabled);
}
