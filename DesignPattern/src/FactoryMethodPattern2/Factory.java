package FactoryMethodPattern2;

public abstract class Factory {
	//Item을 생성하기 위한 절차
	public Item create(String name) {
		boolean bCreatable = this.isCreatable(name);
		
		if(bCreatable) {
			Item item = this.createItem(name);
			postProcessItem(name);
			return item;
		}
		
		return null;
	}
		
	protected abstract boolean isCreatable(String name);
	protected abstract void postProcessItem(String name);
	protected abstract Item createItem(String name);
}
