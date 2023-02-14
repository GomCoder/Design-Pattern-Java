package ProxyPattern;

public class PrinterProxy implements Printable{
	private String name; //�̸�
	private Printer real; //'����'
	
	//������
	public PrinterProxy() {
		this.name = "No name";
		this.real = null;
	}
	
	//������(�̸� ����)
	public PrinterProxy(String name) {
		this.name = name;
		this.real = null;
	}

	@Override
	public synchronized void setPrinterName(String name) {
		if(real != null) {
			//'����'���Ե� �����Ѵ�.
			real.setPrinterName(name);
		}
		this.name = name;
	}

	//�̸� ���
	@Override
	public String getPrinterName() {
		return name;
	}

	//ǥ��
	@Override
	public void print(String string) {
		realize();
		real.print(string);
	}
	
	//���� ����
	private synchronized void realize() {
		if(real == null) {
			real = new Printer(name);
		}
	}
}
