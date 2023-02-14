package ProxyPattern;

public class Printer implements Printable{
	private String name; //�̸�
	
	//������
	public Printer() {
		hevayJob("Printer �ν��Ͻ� ���� �� ...");
	}
	
	//������(�̸� ����)
	public Printer(String name) {
		this.name = name;
		hevayJob("Printer �ν��Ͻ� (" + name + ") ������... ");
	}

	//�̸� ����
	@Override
	public void setPrinterName(String name) {
		this.name = name;
	}
	
	//�̸� ���
	@Override
	public String getPrinterName() {
		return name;
	}
	
	//�̸� �ٿ��� ǥ��
	@Override
	public void print(String string) {
		System.out.println("=== " + name + " ===");
		System.out.println(string);
	}
	
	//���ſ� �۾��̶�� ����
	private void hevayJob(String msg) {
		System.out.print(msg);
		
		for(int i = 0; i < 5; i++) {
			try {
				Thread.sleep(1000);
			} catch(InterruptedException e) {
				
			}
			System.out.print(".");
		}
		System.out.println("�Ϸ�");
	}
}
