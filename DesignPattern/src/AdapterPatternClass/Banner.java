package AdapterPatternClass;

//제공된 클래스
public class Banner {
	private String string;
	
	public Banner(String string) {
		this.string = string;
	}
	
	//문자열을 괄호로 묶어 표시
	public void showWithParen() {
		System.out.println("(" + string + ")");
	}
	
	//문자열 앞뒤에 *를 붙여 표시
	public void showWithAster() {
		System.out.println("*" + string + "*");
	}
}
