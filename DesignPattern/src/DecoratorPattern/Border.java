package DecoratorPattern;

public abstract class Border extends Display{
	protected Display display; //�� ��ĵ��� ���δ� '���빰'
	
	protected Border(Display display) { //�ν��Ͻ� ������ '���빰'�� �μ��� ����
		this.display = display;
	}
}
