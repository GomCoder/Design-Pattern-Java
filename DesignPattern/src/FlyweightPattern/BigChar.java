package FlyweightPattern;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class BigChar {
	//������ �̸�
	private char charName;
	
	//ū ���ڸ� ǥ���ϴ� ���ڿ�
	private String fontData;
	
	//������
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
	
	//ū ���ڸ� ǥ���Ѵ�
	public void print() {
		System.out.println(fontData);
	}

}
