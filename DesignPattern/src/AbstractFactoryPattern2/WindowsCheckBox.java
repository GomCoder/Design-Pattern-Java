package AbstractFactoryPattern2;

public class WindowsCheckBox extends CheckBox{

	public WindowsCheckBox(boolean bChecked) {
		super(bChecked);
	}

	@Override
	public void render() {
		System.out.println(
				"Windows 렌더링 API를 이용해 "
				+ (this.bChecked ? "체크된" : "체크 안된")
				+ " 체크 박스을 그립니다.");
	}	
}
