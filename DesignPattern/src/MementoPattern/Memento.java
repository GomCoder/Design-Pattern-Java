package MementoPattern;

import java.util.ArrayList;
import java.util.List;

public class Memento {
	private int money; //������
	private List<String> fruits; // ����
	
	//�������� ��´�(narrow interface)
	public int getMoney() {
		return money;
	}
	
	//������(wide interface)
	Memento(int money) {
		this.money = money;
		this.fruits = new ArrayList<>();
	}
	
	//������ �߰��Ѵ�(wide interface)
	void addFruit(String friut) {
		fruits.add(friut);
	}
	
	//������ ��´�(wide inteface)
	List<String> getFruits() {
		return new ArrayList<>(fruits);
	}
}
