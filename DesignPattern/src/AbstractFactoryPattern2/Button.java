package AbstractFactoryPattern2;

public abstract class Button {
	protected String caption;
	
	public Button(String caption) {
		this.caption = caption;
	}
	
	public void clickEvent() {
		System.out.println(caption + " ��ư�� Ŭ���߽��ϴ�.");
	}
	
	public abstract void render();
}
