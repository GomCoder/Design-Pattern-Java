package BuilderPattern2;

import java.util.Random;

public class MaInEtry {

	public static void main(String[] args) {
		Car car1 = new Car("V7", true, "Black", true, false);
		
		CarBuilder builder = new CarBuilder() //Method Chaining
				.setAEB(false)
				//.setAirbag(false)
				.setCameraSensor(true)
				.setColor("White")
				.setEngine("V9");
				//.build();
				
		Random random = new Random();
		
		Car car2 = builder
				.setAirbag(random.nextInt(2) == 0) //50%의 확률로 에어백 장착 결정
				.build();
		
		System.out.println(car1);
		System.out.println(car2);		
	}
}
