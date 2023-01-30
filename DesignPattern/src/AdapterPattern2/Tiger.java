package AdapterPattern2;

//변경할 수 없는 클래스
public class Tiger {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	void roar() {
		System.out.println("growl");
	}
}
