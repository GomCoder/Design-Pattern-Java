package InterpreterPattern2;

public interface Expression {
	boolean parse(Context context);
	boolean run();
}
