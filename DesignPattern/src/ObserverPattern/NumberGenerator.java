package ObserverPattern;

import java.util.ArrayList;
import java.util.List;

public abstract class NumberGenerator {
	//Observer�� �����Ѵ�.
	private List<Observer> observers = new ArrayList<>();
	
	//Observer�� �߰��Ѵ�.
	public void addObserver(Observer observer) {
		observers.add(observer);
	}
	
	//Observer�� �����Ѵ�.
	public void deleteObserver(Observer observer) {
		observers.remove(observer);
	}
	
	//Observer�� �����Ѵ�.
	public void notifyObservers() {
		for(Observer o: observers) {
			o.update(this);
		}
	}
	
	//���� ����Ѵ�.
	public abstract int getNumber();
	
	//���� �����Ѵ�.
	public abstract void execute();

}
