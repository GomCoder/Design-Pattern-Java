package MediatorPattern;

public interface Mediator {
	//Colleague�� �����Ѵ�.
	public abstract void createColleagues();
	
	//Colleague�� ���°� ��ȭ���� �� ȣ��ȴ�.
	public abstract void colleagueChanged();
}
