package AdapterPatternClass;

//필요로하는 인터페이스
public interface Print {
	//문자열을 괄호로 묶어 약하게 표시
	public abstract void printWeak();
	//문자열을 *로 강조하여 표시
	public abstract void printStrong();
}
