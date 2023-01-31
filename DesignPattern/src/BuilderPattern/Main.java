package BuilderPattern;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Main {

	public static void main(String[] args) {
		if(args.length != 1) {
			usage();
			System.exit(0);
		}
		
		if(args[0].equals("text")) {
			TextBuilder textBuilder = new TextBuilder();
			Director director = new Director(textBuilder);
			director.construct();
			
			String result = textBuilder.getTextResult();
			
			System.out.println(result);
		} else if(args[0].equals("html")) {
			HTMLBuilder htmlBuilder = new HTMLBuilder();
			Director director = new Director(htmlBuilder);
			director.construct();
			
			String filename = htmlBuilder.getHTMLResult();
			
			System.out.println("HTML����" + filename + "�� �ۼ��Ǿ����ϴ�.");
		} else {
			usage();
			System.exit(0);
		}
	}
	
	
	//��� ����� ǥ���Ѵ�
	private static void usage() {
		System.out.println("Usage: java Main text	�ؽ�Ʈ ���� �ۼ�");
		System.out.println("Uasge: java Main html 	HTML ���Ϸ� ���� �ۼ�");
	}

}
