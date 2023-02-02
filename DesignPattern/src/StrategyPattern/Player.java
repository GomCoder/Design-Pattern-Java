package StrategyPattern;

public class Player {
	private String name;
	private Strategy strategy;
	private int winCount;
	private int loseCount;
	private int gameCount;
	
	//�̸��� ������ �޾Ƽ� �÷��̾ �����.
	public Player(String name, Strategy strategy) {
		this.name = name;
		this.strategy = strategy;
	}	
	
	//������ ���� ���� ���� �����Ѵ�.
	public Hand nextHand() {
		return strategy.nextHand();
	}
	
	//�¸�
	public void win() {
		strategy.study(true);
		winCount++;
		gameCount++;
	}
	
	//�й�
	public void lose() {
		strategy.study(false);
		loseCount++;
		gameCount++;
	}
	
	//���º�
	public void even() {
		gameCount++;
	}
	
	@Override
	public String toString() {
		return "["
				+ name + ":"
				+ gameCount + " games, "
				+ winCount + " win, "
				+ loseCount + " lose"
				+ "]";
	}
}
