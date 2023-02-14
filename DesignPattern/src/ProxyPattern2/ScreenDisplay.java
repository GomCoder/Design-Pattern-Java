package ProxyPattern2;

public class ScreenDisplay implements Display{

	@Override
	public void print(String content) {
		try {
			Thread.sleep(500); //����� ���� �غ� �۾�
		} catch(InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println(content);
	}
}
