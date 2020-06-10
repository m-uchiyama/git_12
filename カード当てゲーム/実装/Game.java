package cardgame;

public class Game {
	
	private Referee referee;
	private Player player;
	
	//コンストラクタ
	public Game(Referee referee, Player player) {
		this.referee = referee;
		this.player = player;
	}
	//ゲームを開始させるメソッド
	public void start() {
		
		boolean judge1 = false;
		while(judge1 == false) {
			//数とスートを入力
			int[] card = new int[2];
			card = player.input();
			//数字で入力されたスートをSuit型に変換
			Suit s = Suit.SPADE;
			if(card[1] == 0) {
				s = Suit.SPADE;
			}else if(card[1] == 1) {
				s = Suit.HEART;
			}else if(card[1] == 2) {
				s = Suit.DIA;
			}else if(card[1] == 3) {
				s = Suit.CLOVER;
			}
			
			//入力された数とスートからなるカード
			Card c;
			c = new Card(card[0],s);
			
			//すでに指定されていないか確認
			boolean judge2 = false;
			while(judge2 == false) {
				judge2 = referee.checkDraw(card[0],s);
				
				if(judge2 == true) {//指定されていなければカードを指定
					referee.recieveCard(card[0], s, c);
				}else {
					System.out.println("既に指定しています。再度数とスートを入力してください。");
					card = player.input();
				}
			}
			
			//判定&結果表示
			judge1 = referee.showJudge(c);
			if(judge1 == true) {//判定があたりならゲーム終了
				break;
			}
		}
	}

}
