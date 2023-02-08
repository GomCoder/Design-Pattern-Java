package ChainOfResponsibility;

public abstract class Support {
	private String name; //�� Ʈ���� �ذ��� �̸�
	private Support next; //���ѱ� ��
	
	public Support(String name) {
		this.name = name;
		this.next = null;
	}
	
	//���ѱ� ���� �����Ѵ�
	public Support setNext(Support next) {
		this.next = next;
		return next;
	}
	
	//Ʈ���� �ذ� ������ �����Ѵ�.
	public void support(Trouble trouble) {
		if(resolve(trouble)) {
			done(trouble);
		} else if(next != null) {
			next.support(trouble);
		} else {
			fail(trouble);
		}
	}
	
	//Ʈ���� �ذ����� ���ڿ� ǥ��
	@Override
	public String toString() {
		return "[" + name + "]";
	}
	
	//�ذ��Ϸ��� �Ѵ�.
	protected abstract boolean resolve(Trouble trouble);
	
	//�ذ��ߴ�
	protected void done(Trouble trouble) {
		System.out.println(trouble + " is resolve by " + this + ".");
	}
	
	//�ذ���� �ʾҴ�
	protected void fail(Trouble trouble) {
		System.out.println(trouble + " cannot be resolved.");
	}	
}
