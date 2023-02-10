package StatePattern2;

public class WalkState extends State{

	public WalkState(Player player) {
		super(player);
	}

	@Override
	public void standUp() {
		player.setSpeed(0);
		player.talk("����...");
		player.setState(new StandUpState(player));
	}

	@Override
	public void sitDown() {
		player.setSpeed(0);
		player.talk("�ȴٰ� ������ �Ѿ��� �� �־��.");
		player.setState(new SitDownState(player));
	}

	@Override
	public void walk() {
		player.talk("�� �ȴ� �� ��������...");
	}

	@Override
	public void run() {
		player.setSpeed(20);
		player.talk("�ȴٰ� �ٸ� ���� ���� �� �� ����!");
		player.setState(new RunState(player));
	}

	@Override
	public String getDescription() {
		return "�ȴ� ��";
	}

}
