package MementoPattern;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Gamer { 
	private int money; //������
	private List<String> fruits = new ArrayList<>(); //����
	private Random random = new Random(); //���� ������
	
	//���� �̸� ǥ
	private static String[] fruitsName = {
			"���", "����", "�ٳ���", "������",
	};
	
	//������
	public Gamer(int money) {
		this.money = money;
	}
	
	//���� �������� ��´�
	public int getMoney() {
		return money;
	}
	
	//�����Ѵ� ... ���� ����
	public void bet() {
		//�ֻ����� ������.
		int dice = random.nextInt(6) + 1;
		
		if(dice == 1) { 
			money += 100;
			System.out.println("�������� �����߽��ϴ�.");
		} else if(dice == 2) {
			money /=2;
			System.out.println("�������� �������� �پ����ϴ�.");
		} else if(dice == 6) {
			String f = getFruit();
			System.out.println("����(" + f + ")�� �޾ҽ��ϴ�.");
			fruits.add(f);
		} else {
			System.out.println("���� ������ �����ϴ�.");
		}
	}
	
	//�������� ��´�.
	public Memento creatMemento() {
		Memento m = new Memento(money);
		
		for(String f: fruits) {
			if(f.startsWith("���ִ� ")) {
				m.addFruit(f);
			}
		}
		return m;
	}
	
	//�����Ѵ�.
	public void restoreMemento(Memento memento) {
		this.money = memento.getMoney();
		this.fruits = memento.getFruits();
	}
	
	@Override
	public String toString() {
		return "[money = " + money +", fruits = " + fruits + "]";
	}
	
	//���� �ϳ� ��´�.
	private String getFruit() {
		String f = fruitsName[random.nextInt(fruitsName.length)];
		
		if(random.nextBoolean()) {
			return "���ִ� " + f;
		} else {
			return f;
		}
	}
	

}
