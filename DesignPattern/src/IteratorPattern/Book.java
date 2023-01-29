package IteratorPattern;

//책의 이름을 나타내는 클래스
//역할: 책의 이름을 getName() 메소드로 얻는 것
public class Book {
	private String name; //책의 이름
	
	public Book(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
}
