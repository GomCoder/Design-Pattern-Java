package DecoratorPattern;

public abstract class Display {
	public abstract int getColumn(); //���� ���� ���� ��´�
	public abstract int getRows(); //���� ����� ��´�
	public abstract String getRowText(int row); //row��° ���ڿ��� ��´�.
	
	//��� ���� ǥ���Ѵ�.
	public void show() {
		for(int i = 0; i < getRows(); i++) {
			System.out.println(getRowText(i));
		}
	}
}
