package MementoPattern;

public class Main {

	public static void main(String[] args) {
		Gamer gamer = new Gamer(100); //���� �������� 100
		Memento memento = gamer.creatMemento(); //���� ��ä�� �����صд�
		
		//���� ����
		for(int i = 0; i < 100; i++) {
			System.out.println("====" + i); //Ƚ�� ǥ��
			System.out.println("����: " + gamer); //���� ���ΰ��� ���� ǥ��
			
			//������ �����Ѵ�.
			gamer.bet();
			
			System.out.println("�������� " + gamer.getMoney() + "���� �Ǿ����ϴ�.");
			
			//Memento ��� ��� ����
			if(gamer.getMoney() > memento.getMoney()) {
				System.out.println("*���� �þ����� ���� ���¸� ��������!");
				memento = gamer.creatMemento();
			} else if(gamer.getMoney() < memento.getMoney() / 2) {
				System.out.println("*���� �پ����� ���� ���¸� ��������!");
				gamer.restoreMemento(memento);
			}
			
			//��� ���
			try {
				Thread.sleep(1000);
			} catch(InterruptedException e) {
			}
			
			System.out.println();
		}
	}
}
