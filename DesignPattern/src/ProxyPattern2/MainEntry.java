package ProxyPattern2;

public class MainEntry {

	public static void main(String[] args) {
		//Display display = new ScreenDisplay();
		Display display = new BufferDisplay(5);
	
		
		display.print("�ȳ��ϼ���.");
		display.print("����Ʈ���� ���踦 ���� ������ ������");
		display.print("�����ϱ� ������ �κе� ������...");
		display.print("�����ϰ� ���߿� ������ �ϸ�");
		display.print("ū �Ը��� ����Ʈ���� ���߿� ū ������ �˴ϴ�.");
		display.print("���� ���������� ��� Ȯ�忡�� �ſ� ū ������ �˴ϴ�.");
		
		((BufferDisplay)display).flush();
	}
}
