package ObserverPattern2;

public class MainEntry {

	public static void main(String[] args) {
		DiceGame diceGame = new FairDiceGame();
		
		Player player1 = new EvenBettingPlayer("¦�ô���");
		Player player2 = new OddBettingPlayer("Ȧ�ƺ�");
		Player player3 = new OddBettingPlayer("Ȧ����");
		
		diceGame.addPlayer(player1);
		diceGame.addPlayer(player2);
		diceGame.addPlayer(player3);
		
		for(int i = 0; i < 5; i++) {
			diceGame.play();
			System.out.println();
		}		
	}
}
