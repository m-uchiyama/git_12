package cardgame;

public class Main {
	
	public static void main(String[] args) {
		
		//52枚カード生成
		Cards cards = new Cards();
		//プレイヤー生成
		Player player = new Player();
		
		//審判選択
		int rf = player.selectReferee();
		if(rf == 1) {//厳しい審判の場合
			Referee hardReferee = new HardReferee(cards);//審判が52枚のカードを見れるようにする
			Game game = new Game(hardReferee, player);//どの審判とプレイヤーがゲームに参加するのか
			game.start();
		}else {//優しい審判の場合
			Referee easyReferee = new EasyReferee(cards);
			Game game = new Game(easyReferee, player);
			game.start();
		}
	}
}
