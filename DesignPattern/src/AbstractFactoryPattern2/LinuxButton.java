package AbstractFactoryPattern2;

public class LinuxButton extends Button{

	public LinuxButton(String caption) {
		super(caption);
	}

	@Override
	public void render() {
		System.out.println(
				"Linux ������ API�� �̿��� "
				+ this.caption
				+ " ��ư�� �׸��ϴ�.");
	}
}
