package TemplateMethodPattern;

public class Main {

	public static void main(String[] args) {
		//'H'�� ���� CharDisplay �ν��Ͻ��� �ϳ� �����.
		AbstractDisplay d1 = new CharDisplay('H');
		
		//"Hello, World."�� ���� StringDisplay �ν��Ͻ��� �ϳ� �����.
		AbstractDisplay d2 = new StringDisplay("Hello, World.");
		
		
		//d1, d2 ��� ���� AbstractDisplay�� ���� Ŭ������ �ν��Ͻ��̹Ƿ� ����� display �޼��带 ȣ���� �� �ִ�.
		//���� ������ CharDisplay�� StringDisplay Ŭ�������� ��������.
		d1.display();
		d2.display();		
	}
}
