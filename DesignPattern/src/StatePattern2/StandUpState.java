package StatePattern2;

public class StandUpState extends State{

	public StandUpState(Player player) {
		super(player);
	}

	@Override
	public void standUp() {
		player.talk("���� �����ϲ���?");
	}

	@Override
	public void sitDown() {
		player.setState(new SitDownState(player));
		player.talk("�����ϱ� ���ϰ� �����ϴ�.");
	}

	@Override
	public void walk() {
		player.setSpeed(5);
		player.setState(new WalkState(player));
		player.talk("�ȱ�� �� 2�� �����ϱ��̴�...");
	}

	@Override
	public void run() {
		player.setSpeed(10);
		player.setState(new RunState(player));
		player.talk("���ڱ� �ڴ�!");
	}

	@Override
	public String getDescription() {
		return "���ڸ��� �� ����";
	}
}
