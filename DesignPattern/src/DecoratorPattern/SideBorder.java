package DecoratorPattern;

public class SideBorder extends Border{
	private char borderChar; //��� ����
	
	//���빰�� ���� Display�� ��� ���ڸ� ����
	public SideBorder(Display display, char ch) {
		super(display);
		this.borderChar = ch;
	}

	@Override
	public int getColumn() {
		//���� ���� ���빰�� ���ʿ� ��� ���ڸ�ŭ ���� ��
		return 1 + display.getColumn() + 1;
	}

	@Override
	public int getRows() {
		//����� ���빰�� ����� ����
		return display.getRows();
	}

	@Override
	public String getRowText(int row) {
		//���� ���� ������ ���빰�� ���� �� ���ʿ� ��� ���ڸ� ���� �� 
		return borderChar + display.getRowText(row) + borderChar;
	}
	
	

}
