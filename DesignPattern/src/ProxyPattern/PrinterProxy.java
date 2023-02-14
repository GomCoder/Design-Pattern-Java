package ProxyPattern;

public class PrinterProxy implements Printable{
	private String name; //이름
	private Printer real; //'본인'
	
	//생성자
	public PrinterProxy() {
		this.name = "No name";
		this.real = null;
	}
	
	//생성자(이름 지정)
	public PrinterProxy(String name) {
		this.name = name;
		this.real = null;
	}

	@Override
	public synchronized void setPrinterName(String name) {
		if(real != null) {
			//'본인'에게도 설정한다.
			real.setPrinterName(name);
		}
		this.name = name;
	}

	//이름 취득
	@Override
	public String getPrinterName() {
		return name;
	}

	//표시
	@Override
	public void print(String string) {
		realize();
		real.print(string);
	}
	
	//본인 생성
	private synchronized void realize() {
		if(real == null) {
			real = new Printer(name);
		}
	}
}
