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
			
			System.out.println("HTML파일" + filename + "이 작성되었습니다.");
		} else {
			usage();
			System.exit(0);
		}
	}
	
	
	//사용 방법을 표시한다
	private static void usage() {
		System.out.println("Usage: java Main text	텍스트 문서 작성");
		System.out.println("Uasge: java Main html 	HTML 파일로 문서 작성");
	}

}
