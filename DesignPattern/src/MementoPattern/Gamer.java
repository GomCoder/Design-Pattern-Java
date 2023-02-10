package MementoPattern;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Gamer { 
	private int money; //소지금
	private List<String> fruits = new ArrayList<>(); //과일
	private Random random = new Random(); //난수 생성기
	
	//과일 이름 표
	private static String[] fruitsName = {
			"사과", "포도", "바나나", "오렌지",
	};
	
	//생성자
	public Gamer(int money) {
		this.money = money;
	}
	
	//현재 소지금을 얻는다
	public int getMoney() {
		return money;
	}
	
	//내기한다 ... 게임 진행
	public void bet() {
		//주사위를 던진다.
		int dice = random.nextInt(6) + 1;
		
		if(dice == 1) { 
			money += 100;
			System.out.println("소지금이 증가했습니다.");
		} else if(dice == 2) {
			money /=2;
			System.out.println("소지금이 절반으로 줄었습니다.");
		} else if(dice == 6) {
			String f = getFruit();
			System.out.println("과일(" + f + ")을 받았습니다.");
			fruits.add(f);
		} else {
			System.out.println("변동 사항이 없습니다.");
		}
	}
	
	//스냅샷을 찍는다.
	public Memento creatMemento() {
		Memento m = new Memento(money);
		
		for(String f: fruits) {
			if(f.startsWith("맛있는 ")) {
				m.addFruit(f);
			}
		}
		return m;
	}
	
	//복원한다.
	public void restoreMemento(Memento memento) {
		this.money = memento.getMoney();
		this.fruits = memento.getFruits();
	}
	
	@Override
	public String toString() {
		return "[money = " + money +", fruits = " + fruits + "]";
	}
	
	//과일 하나 얻는다.
	private String getFruit() {
		String f = fruitsName[random.nextInt(fruitsName.length)];
		
		if(random.nextBoolean()) {
			return "맛있는 " + f;
		} else {
			return f;
		}
	}
	

}
