package AbstractFactoryPattern2;

public class LinuxCheckBox extends CheckBox{

	public LinuxCheckBox(boolean bChecked) {
		super(bChecked);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void render() {
		System.out.println(
				"Linux ������ API�� �̿��� "
				+ (this.bChecked ? "üũ��" : "üũ �ȵ�")
				+ " üũ �ڽ��� �׸��ϴ�.");
		
	}
}
