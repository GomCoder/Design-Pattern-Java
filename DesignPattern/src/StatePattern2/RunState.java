package StatePattern2;

public class RunState extends State{

	public RunState(Player player) {
		super(player);
		
	}

	@Override
	public void standUp() {
		player.setSpeed(0);
		player.talk("¶Ù´Ù°¡ °©ÀÚ±â ¼­¸é ¹«¸­ ¿¬°ñ ³ª°¡¿ä...");
		player.setState(new StandUpState(player));
	}

	@Override
	public void sitDown() {
		player.setSpeed(0);
		player.talk("¶Ù´Ù°¡ ¾ÉÀ¸¶ó°í? ");
		player.setState(new StandUpState(player));		
	}

	@Override
	public void walk() {
		player.setSpeed(8);
		player.talk("¼Óµµ¸¦ ÁÙÀÏ°Ô¿ä!");
		player.setState(new WalkState(player));	
		
	}

	@Override
	public void run() {
		player.setSpeed(player.getSpeed()+2);
		player.talk("´õ »¡¸® ¶Ù¶ó´Â ¾ê±âÁö?");
		player.setState(new RunState(player));	
		
	}

	@Override
	public String getDescription() {
		return "¶Ù´Â Áß";
	}

}
