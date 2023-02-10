package FlyweightPattern;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class BigChar {
	//문자의 이름
	private char charName;
	
	//큰 문자를 표현하는 문자열
	private String fontData;
	
	//생성자
	public BigChar(char charName) {
		this.charName = charName;
		try {
			String fileName = "big" + charName + ".txt";
			StringBuilder sb = new StringBuilder();
			
			for(String line: Files.readAllLines(Path.of(fileName))) {
				sb.append(line);
				sb.append("\n");
			}
			this.fontData = charName + "?";			
			
		} catch(IOException e) {
			this.fontData = charName + "?";
		}
	}
	
	//큰 문자를 표시한다
	public void print() {
		System.out.println(fontData);
	}

}
