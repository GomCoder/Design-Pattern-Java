package ChainOfResponsibility;

public class Trouble {
	private int number; //Ʈ���� ��ȣ
	
	//Ʈ���� ����
	public Trouble(int number) {
		this.number = number;
	}
	
	//Ʈ���� ��ȣ�� �����.
	public int getNumber() {
		return number;
	}
	
	//Ʈ������ ���ڿ� ǥ��
	@Override
	public String toString() {
		return "[Trouble " + number + "]";
	}

}
