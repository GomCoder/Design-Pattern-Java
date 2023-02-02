package AbstractFactoryPattern2;

public class WindowsCheckBox extends CheckBox{

	public WindowsCheckBox(boolean bChecked) {
		super(bChecked);
	}

	@Override
	public void render() {
		System.out.println(
				"Windows ������ API�� �̿��� "
				+ (this.bChecked ? "üũ��" : "üũ �ȵ�")
				+ " üũ �ڽ��� �׸��ϴ�.");
	}	
}
