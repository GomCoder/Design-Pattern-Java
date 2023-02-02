package AbstractFactoryPattern2;

public class LinuxCheckBox extends CheckBox{

	public LinuxCheckBox(boolean bChecked) {
		super(bChecked);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void render() {
		System.out.println(
				"Linux 렌더링 API를 이용해 "
				+ (this.bChecked ? "체크된" : "체크 안된")
				+ " 체크 박스을 그립니다.");
		
	}
}
