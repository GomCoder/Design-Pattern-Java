package FactoryMethodPattern2;

import java.util.HashMap;

public class ItemFactory extends Factory{
	
	private class ItemData {
		int maxCount; //�ִ� ���� ����
		int currentCount; //���� ������ ����
		
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
	protected boolean isCreatable(String name) { //�������� ������ �������� üũ
		
		ItemData itemData = repository.get(name);
		
		//�ش�Ǵ� �������� ���ٸ� -> false(�� �� ���� ������)
		if(itemData == null) {
			System.out.println(name + "�� �� �� ���� �������Դϴ�.");
			return false;
		}
		
		//�ش� �������� currentCount�� maxCount�̻��̶�� -> false(ǰ��)
		if(itemData.currentCount >= itemData.maxCount) {
			System.out.println(name + "�� ǰ�� �������Դϴ�.");
			return false;
		}
		
		return true;		
	}

	@Override
	protected Item createItem(String name) { //�ش�Ǵ� �������� �����ϴ� ��ü���� ����

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
	protected void postProcessItem(String name) { //�ش� �������� �����Ǹ� currentCount ���� +1 ����
		ItemData itemData = repository.get(name);
		
		if(itemData != null) {
			itemData.currentCount++;
		}
	}

	
}
