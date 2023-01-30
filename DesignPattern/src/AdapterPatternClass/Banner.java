package AdapterPatternClass;

//������ Ŭ����
public class Banner {
	private String string;
	
	public Banner(String string) {
		this.string = string;
	}
	
	//���ڿ��� ��ȣ�� ���� ǥ��
	public void showWithParen() {
		System.out.println("(" + string + ")");
	}
	
	//���ڿ� �յڿ� *�� �ٿ� ǥ��
	public void showWithAster() {
		System.out.println("*" + string + "*");
	}
}
