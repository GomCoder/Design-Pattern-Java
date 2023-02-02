package StrategyPattern;

public enum Hand {
	//����, ����, ���� ��Ÿ���� �� ���� enum ���
	ROCK("����", 0),
	SCISSORS("����", 1),
	PAPER("��", 2);
	
	//enum�� ���� �ʵ�
	private String name; //���� ���� �� ���� �̸�
	private int handValue; //���� ���� �� ���� ��
		
	//���� ������ ����� ��� ���� �迭
	private static Hand[] hands = {
		ROCK, SCISSORS, PAPER	
	};
	
	//������
	private Hand(String name, int handValue) {
		this.name = name;
		this.handValue = handValue;
	}
	
	//���� ������ enum ����� �����´�.
	public static Hand getHand(int handValue) {
		return hands[handValue];
	}
		
	//this�� h���� ���� �� true
	public boolean isStrongerThan(Hand h) {
		return fight(h) == 1;
	}
	
	//this�� h���� ���� �� true
	public boolean isWeakerThan(Hand h) {
		return fight(h) == -1;
	}
	
	//���ºδ� 0, this�� �̱�� 1, h�� �̱�� -1
	private int fight(Hand h) {
		if(this == h) {
			return 0;
		} else if((this.handValue + 1) % 3 == h.handValue) {
			return 1;
		} else {
			return -1;
		}
	}
	
	//����, ����, ���� ���ڿ� ǥ��
	@Override
	public String toString() {
		return name;
	}
}
