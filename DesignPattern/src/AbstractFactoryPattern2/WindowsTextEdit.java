package AbstractFactoryPattern2;

public class WindowsTextEdit extends TextEdit{

	public WindowsTextEdit(String value) {
		super(value);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void render() {
		System.out.println(
				"Windows ������ API�� �̿��� "
				+ this.value
				+ " ���� ����"
				+ " �ؽ�Ʈ ����Ʈ�� �׸��ϴ�.");
		
	}

}
