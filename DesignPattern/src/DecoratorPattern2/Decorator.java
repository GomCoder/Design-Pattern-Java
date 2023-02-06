package DecoratorPattern2;

public abstract class Decorator extends Item{
	protected Item item; //장식할 대상
	
	public Decorator(Item item) {
		this.item = item;
	}	
}
