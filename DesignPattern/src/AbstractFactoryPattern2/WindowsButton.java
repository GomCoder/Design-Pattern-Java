package AbstractFactoryPattern2;

public class WindowsButton extends Button{

	public WindowsButton(String caption) {
		super(caption);
	}

	@Override
	public void render() {
		System.out.println(
				"Windows ������ API�� �̿��� "
				+ this.caption
				+ " ��ư�� �׸��ϴ�.");
	}	
}
