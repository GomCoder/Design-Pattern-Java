package DecoratorPattern2;

public class MainEntry {

	public static void main(String[] args) {
		Strings strings = new Strings();
		
		strings.add("Hello~");
		strings.add("My Name is Kim");
		strings.add("I am a Developer");
		strings.add("Design-Pattern is powerful tool.");
		
		strings.print();
	}
}
