package CommandPattern2;

public class PrintCommand implements Command{
	public String content;
	
	public PrintCommand(String content) {
		this.content = content;
	}

	@Override
	public void run() {
		System.out.print(content);
	}	
}
