package StatePattern2;

public class SitDownState extends State{

	public SitDownState(Player player) {
		super(player);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void standUp() {
		player.setState(new StandUpState(player));
		player.talk("�Ͼ��...");
	}

	@Override
	public void sitDown() {
		player.talk("�㳪�ڴ�..");
	}

	@Override
	public void walk() {
		player.setState(new StandUpState(player));
		player.talk("�ɾƼ� ��� �ɾ�? �ϴ� ����...");
	}

	@Override
	public void run() {
		player.setState(new StandUpState(player));
		player.talk("�ɾƼ� ��� �پ�... �ϴ� ����...");		
	}

	@Override
	public String getDescription() {
		return "�ɾ�����";
	}
}
