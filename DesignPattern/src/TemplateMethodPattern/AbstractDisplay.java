package TemplateMethodPattern;

public abstract class AbstractDisplay {
	//open, print, close�� ���� Ŭ������ ������ �ñ�� �߻� Ŭ����
	public abstract void open();
	public abstract void print();
	public abstract void close();
	
	//display�� AbstractDisplay���� �����ϴ� �޼���
	public final void display() {
		open();
		
		for(int i = 0; i < 5; i++) {
			print();
		}
		
		close();
	}
}
