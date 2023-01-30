package AdapterPattern2;

import java.util.ArrayList;

public class User {

	public static void main(String[] args) {
		ArrayList<Animal> animals = new ArrayList<>();
		
		animals.add(new Dog("����"));
		animals.add(new Cat("������"));
		animals.add(new Cat("����"));	
		
		animals.add(new TigerAdapter("Ÿ�̿�"));//TigerAdpater�� ���
		
		animals.forEach(animal -> {
			animal.sound();
		});
		
	}
}
