package Observer;

import java.util.Random;

public class RandomNumberGenerator extends NumberGenerator{
	private Random random = new Random(); //���� ������
	private int number; //���� ��
	
	//���� ����Ѵ�.
	@Override
	public int getNumber() {
		return number;
	}
	
	//���� �����Ѵ�.
	@Override
	public void execute() {
		for(int i = 0; i < 20; i++) {
			number = random.nextInt(50);
			notifyObservers();
		}
	}

}
