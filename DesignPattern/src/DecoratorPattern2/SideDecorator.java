package DecoratorPattern2;

public class SideDecorator extends Decorator{
	private Character ch;
	
	public SideDecorator(Item item, Character ch) {
		super(item);
		this.ch = ch;
	}

	@Override
	public int getLinesCount() {
		return item.getLinesCount();
	}

	@Override
	public int getMaxLength() {
		return item.getLinesCount() + 2;
	}

	@Override
	public int getLength(int index) {
		return item.getLinesCount() + 2;
	}

	@Override
	public String getString(int index) {
		return ch + item.getString(index) + ch;
	}
	
	
}
