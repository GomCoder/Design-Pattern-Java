package ObserverPattern2;

public class MainEntry {

	public static void main(String[] args) {
		DiceGame diceGame = new FairDiceGame();
		
		Player player1 = new EvenBettingPlayer("Â¦±Ã´óÀÌ");
		Player player2 = new OddBettingPlayer("È¦¾Æºñ");
		Player player3 = new OddBettingPlayer("È¦ÂßÀÌ");
		
		diceGame.addPlayer(player1);
		diceGame.addPlayer(player2);
		diceGame.addPlayer(player3);
		
		for(int i = 0; i < 5; i++) {
			diceGame.play();
			System.out.println();
		}		
	}
}
