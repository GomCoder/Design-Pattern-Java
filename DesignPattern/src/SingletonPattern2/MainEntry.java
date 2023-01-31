package SingletonPattern2;

public class MainEntry {

	public static void main(String[] args) {
		//King king = new King();//error: The constructor King() is not visible
		King king = King.getInstance();
		
		king.say();
		
		King king2 = King.getInstance();
		
		if(king == king2) {
			System.out.println("Same object");
		} else {
			System.out.println("Different object");
		}		
	}
}
