package CompositePattern;

public abstract class Entry {
	//�̸��� ��´�
	public abstract String getName();
	
	//ũ�⸦ ��´�
	public abstract int getSize();
	
	//����� ǥ���Ѵ�
	public void printList() {
		printList(" ");
	}
	
	//prefix�� �տ� �ٿ��� ����� ǥ���Ѵ�.
	protected abstract void printList(String prefix);
	
	//���ڿ� ǥ��
	@Override
	public String toString() {
		return getName() + " (" + getSize() + ")";
	}

}
