package union;

public class Main {
	public static void main(String[] args) {
		Player firstPlayer = new Player();
		Player secondPlayer = new Player();
		Game sanmokunarabe = new Game(firstPlayer,secondPlayer);
		sanmokunarabe.startGame();
	}
}
