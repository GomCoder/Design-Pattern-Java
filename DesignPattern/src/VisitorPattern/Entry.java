package VisitorPattern;

public abstract class Entry implements Element{
	public abstract String getName(); //�̸��� ��´�.
	public abstract int getSize(); //ũ�⸦ ��´�.
	
	@Override
	public String toString() {
		return getName() + " (" + getSize() + ")";
	}
}
