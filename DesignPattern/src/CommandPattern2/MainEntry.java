package CommandPattern2;

public class MainEntry {

	public static void main(String[] args) {
		/*
		 * Command clearCmd = new ClearCommand(); clearCmd.run();
		 * 
		 * Command yellowColorCmd = new ColorCommand(ColorCommand.Color.YELLOW);
		 * yellowColorCmd.run();
		 * 
		 * Command moveCmd = new MoveCommand(10, 1); moveCmd.run();
		 * 
		 * Command printCmd = new PrintCommand("안녕하세요! 디자인 패턴"); printCmd.run();
		 * 
		 * Command moveCmd2 = new MoveCommand(15, 5); moveCmd2.run();
		 * 
		 * printCmd.run();
		 * 
		 * Command moveCmd3 = new MoveCommand(25, 8); moveCmd3.run();
		 * 
		 * Command greenColorCmd = new ColorCommand(ColorCommand.Color.GREEN);
		 * greenColorCmd.run();
		 * 
		 * printCmd.run();
		 */
		
		CommandGroup cmdGroup = new CommandGroup();
		
		 Command clearCmd = new ClearCommand(); 
		 cmdGroup.add(clearCmd);
		 
		 Command yellowColorCmd = new ColorCommand(ColorCommand.Color.YELLOW);
		 cmdGroup.add(yellowColorCmd);
		 
		 Command moveCmd = new MoveCommand(10, 1); 
		 cmdGroup.add(moveCmd);
		 
		 Command printCmd = new PrintCommand("안녕하세요! 디자인 패턴");
		 cmdGroup.add(printCmd);
		 
		 Command moveCmd2 = new MoveCommand(15, 5);
		 cmdGroup.add(moveCmd2);
		 
		 cmdGroup.add(printCmd);
		 
		 Command moveCmd3 = new MoveCommand(25, 8); 
		 cmdGroup.add(moveCmd3);
		 
		 Command greenColorCmd = new ColorCommand(ColorCommand.Color.GREEN);
		 cmdGroup.add(greenColorCmd);
		 
	 	 cmdGroup.add(printCmd);		
	 	 
	 	 cmdGroup.run();
	}
}
