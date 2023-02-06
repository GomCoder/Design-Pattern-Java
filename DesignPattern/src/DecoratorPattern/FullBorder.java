package DecoratorPattern;

public class FullBorder extends Border{
	public FullBorder(Display display) {
		super(display);
	}

	@Override
	public int getColumn() {
		//���� ���� ���빰 ���ʿ� �¿� ��� ���ڸ�ŭ ���� ��
		return 1 + display.getColumn() + 1;
	}

	@Override
	public int getRows() {
		//����� ���빰�� ����� ���� ��� ���ڸ�ŭ ���� ��
		return 1 + display.getRows() + 1;
	}

	@Override
	public String getRowText(int row) {
		if(row == 0) {
			return "+" + makeLine('-', display.getColumn()) + "+"; //��� �׵θ�
		} else if (row == display.getRows() + 1) {
			return "+" + makeLine('-', display.getColumn()) + "+"; //�ϴ� �׵θ�
		} else {
			return "|" + display.getRowText(row - 1) + "|"; //��Ÿ
		}
	}
	
	//���� ch�� count �� ��ŭ ������ ���ڿ��� �����
	private String makeLine(char ch, int count) {
		StringBuilder line = new StringBuilder();
		
		for(int i = 0; i < count; i++) {
			line.append(ch);
		}
		return line.toString();
	}	
}
