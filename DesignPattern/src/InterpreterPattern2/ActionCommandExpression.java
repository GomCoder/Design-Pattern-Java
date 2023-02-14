package InterpreterPattern2;

public class ActionCommandExpression extends CommandExpression{

	public ActionCommandExpression(String keyword) {
		super(keyword);
	}

	@Override
	public boolean parse(Context context) {
		if(!checkValidKeyword(keyword)) {
			return false;
		}
		
		if(context.readNextKeyword() == null) {
			return false;
		}
		return true;		
	}
	
	public static boolean checkValidKeyword(String keyword) {
		boolean bkeywordOk = keyword.equals("FRONT") || 
							 keyword.equals("BACK") || 
				   	  	 	 keyword.equals("RIGHT") || 
				 			 keyword.equals("LEFT");
		
		return bkeywordOk;
	}
		

	@Override
	public boolean run() {
		System.out.println("cmd: " + keyword);
		return true;
	}
	
	@Override
	public String toString() {
		return keyword;
	}
}
