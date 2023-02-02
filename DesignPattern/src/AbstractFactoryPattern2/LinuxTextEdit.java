package AbstractFactoryPattern2;

public class LinuxTextEdit extends TextEdit{

	public LinuxTextEdit(String value) {
		super(value);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void render() {
		System.out.println(
				"Linux 렌더링 API를 이용해 "
				+ this.value
				+ " 값을 가진"
				+ " 텍스트 에디트을 그립니다.");
	}

}
