package StatePattern2;

public class WalkState extends State{

	public WalkState(Player player) {
		super(player);
	}

	@Override
	public void standUp() {
		player.setSpeed(0);
		player.talk("¸ØÃç...");
		player.setState(new StandUpState(player));
	}

	@Override
	public void sitDown() {
		player.setSpeed(0);
		player.talk("°È´Ù°¡ ¾ÉÀ¸¸é ³Ñ¾îÁú ¼ö ÀÖ¾î¿ä.");
		player.setState(new SitDownState(player));
	}

	@Override
	public void walk() {
		player.talk("³­ °È´Â °É ÁÁ¾ÆÇÏÁö...");
	}

	@Override
	public void run() {
		player.setSpeed(20);
		player.talk("°È´Ù°¡ ¶Ù¸é ¿­¶ó »¡¸® ¶Û ¼ö ÀÖÁö!");
		player.setState(new RunState(player));
	}

	@Override
	public String getDescription() {
		return "°È´Â Áß";
	}

}
