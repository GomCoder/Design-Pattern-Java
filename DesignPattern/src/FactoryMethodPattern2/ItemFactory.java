package FactoryMethodPattern2;

import java.util.HashMap;

public class ItemFactory extends Factory{
	
	private class ItemData {
		int maxCount; //최대 생성 갯수
		int currentCount; //현재 생성된 갯수
		
		ItemData(int maxCount) {
			this.maxCount = maxCount;
		}
	}
	
	private HashMap<String, ItemData> repository;
	
	public ItemFactory(){
		repository = new HashMap<String, ItemData>();
		
		repository.put("sword", new ItemData(3));
		repository.put("shield", new ItemData(2));
		repository.put("bow", new ItemData(1));		
	}

	
	
	@Override
	protected boolean isCreatable(String name) { //아이템의 생성이 가능한지 체크
		
		ItemData itemData = repository.get(name);
		
		//해당되는 아이템이 없다면 -> false(알 수 없는 아이템)
		if(itemData == null) {
			System.out.println(name + "은 알 수 없는 아이템입니다.");
			return false;
		}
		
		//해당 아이템의 currentCount가 maxCount이상이라면 -> false(품절)
		if(itemData.currentCount >= itemData.maxCount) {
			System.out.println(name + "은 품절 아이템입니다.");
			return false;
		}
		
		return true;		
	}

	@Override
	protected Item createItem(String name) { //해당되는 아이템을 생성하는 구체적인 내용

		Item item = null;
		
		if(name == "sword") {
			item = new Sword();
		}
		
		if(name == "shield") {
			item = new Shield();
		}
		
		if(name == "bow") {
			item = new Bow();
		}
		
		return item;
	}
	
	@Override
	protected void postProcessItem(String name) { //해당 아이템이 생성되면 currentCount 값을 +1 증가
		ItemData itemData = repository.get(name);
		
		if(itemData != null) {
			itemData.currentCount++;
		}
	}

	
}
