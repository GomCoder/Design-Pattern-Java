package TemplateMethodPattern;

public class CharDisplay extends AbstractDisplay{
	
	private char ch; //ǥ���ؾ��� ����

	public CharDisplay(char ch) {
		this.ch = ch;
	}

	@Override
	public void open() {
		//���� ���ڿ� "<<"�� ǥ���Ѵ�.
		System.out.print("<<");
	}

	@Override
	public void print() {
		//�ʵ忡 ������ �� ���ڸ� 1ȸ ǥ���Ѵ�.
		System.out.print(ch);
		
	}

	@Override
	public void close() {
		// ���� ���ڿ� ">>"�� ǥ���Ѵ�.
		System.out.println(">>");
	}
	

}
