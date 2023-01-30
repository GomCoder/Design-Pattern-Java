package AdapterPatternClass;

//Adapter의 역할: 상속하는 경우
public class PrintBanner extends Banner implements Print{

	public PrintBanner(String string) {
		super(string);
		
	}

	@Override
	public void printWeak() {
		showWithParen();
		
	}

	@Override
	public void printStrong() {
		showWithAster();
	}

}
