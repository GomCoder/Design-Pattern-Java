package ChainOfResponsibility;

public class NoSupport extends Support{
	public NoSupport(String name) {
		super(name);
	}
	
	@Override
	protected boolean resolve(Trouble trouble) {
		return false; //�ڽ��� �ƹ��͵� �ذ����� �ʴ´�.
	}
}