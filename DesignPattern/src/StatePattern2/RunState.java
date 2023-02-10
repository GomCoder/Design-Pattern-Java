package StatePattern2;

public class RunState extends State{

	public RunState(Player player) {
		super(player);
		
	}

	@Override
	public void standUp() {
		player.setSpeed(0);
		player.talk("�ٴٰ� ���ڱ� ���� ���� ���� ������...");
		player.setState(new StandUpState(player));
	}

	@Override
	public void sitDown() {
		player.setSpeed(0);
		player.talk("�ٴٰ� �������? ");
		player.setState(new StandUpState(player));		
	}

	@Override
	public void walk() {
		player.setSpeed(8);
		player.talk("�ӵ��� ���ϰԿ�!");
		player.setState(new WalkState(player));	
		
	}

	@Override
	public void run() {
		player.setSpeed(player.getSpeed()+2);
		player.talk("�� ���� �ٶ�� �����?");
		player.setState(new RunState(player));	
		
	}

	@Override
	public String getDescription() {
		return "�ٴ� ��";
	}

}
