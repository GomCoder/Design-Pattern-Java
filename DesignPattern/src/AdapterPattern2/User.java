package AdapterPattern2;

import java.util.ArrayList;

public class User {

	public static void main(String[] args) {
		ArrayList<Animal> animals = new ArrayList<>();
		
		animals.add(new Dog("´óÀÌ"));
		animals.add(new Cat("¼ØÅÐÀÌ"));
		animals.add(new Cat("ÃòÃò"));	
		
		animals.add(new TigerAdapter("Å¸ÀÌ¿Â"));//TigerAdpater¸¦ »ç¿ë
		
		animals.forEach(animal -> {
			animal.sound();
		});
		
	}
}
