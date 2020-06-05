package union;

import java.util.ArrayList;

public class Game {
	
	private Player currentPlayer; //現プレイヤー
	private Player firstPlayer;	//先攻プレイヤー
	private Player secondPlayer; //後攻プレイヤー
	private Board board;
	private ArrayList<Turn> recordTurn = new ArrayList<Turn>(); //ターン履歴
	
	//コンストラクタ
	public Game(Player firstPlayer,Player secondPlayer) {
		this.firstPlayer = firstPlayer;
		this.secondPlayer = secondPlayer;
		currentPlayer = this.firstPlayer;
		this.board = new Board();
	}
	
	//ゲーム開始
	public void startGame() {
		boolean judge = false;
		while(true) {
			//showBoard
			board.showBoard();
			
			//Turn生成
			Turn turn = new Turn();
			
			//盤にマークを置けるまで繰り返す
			judge = false;
			while(judge==false){
				//inputCell
				int[] x_y = new int[2];
				x_y = currentPlayer.inputCell();
				//Turnに情報を渡す
				if(currentPlayer.equals(firstPlayer)) {
					judge = turn.checkSetting("〇", x_y[0], x_y[1],board);
				}else {
					judge = turn.checkSetting("✕", x_y[0], x_y[1],board);
				}
			}
			
			//ターン履歴保存
			recordTurn.add(turn);
			
			//勝敗が決まるか盤が埋まるかの確認
			if(board.checkWinner() == true) {
				break;
			}
			if(board.checkFull() == true) {
				break;
			}
			
			//プレイヤー交代
			changePlayer();
		}
		//最後に盤表示
		board.showBoard();
		
		//勝敗結果&ターン履歴表示
		showHistory();
	}
	
	//プレイヤー交代用メソッド
	public void changePlayer() {
		if(recordTurn.size() % 2 == 1) {
			currentPlayer = secondPlayer;
		}else {
			currentPlayer = firstPlayer;
		}
	}
	
	//勝敗結果&ターン履歴表示用メソッド
	public void showHistory() {
		if(board.checkWinner()) {
			if(recordTurn.size() % 2 == 1) {
				System.out.println("勝者：先攻");
			}else {
				System.out.println("勝者：後攻");
			}
		}else {
			System.out.println("引き分け");
		}
		System.out.println("");
		System.out.println("<ターン履歴>");
		//1ターン表示用メソッドをターン分繰り返す
		for(int i =0; i < recordTurn.size(); i++) {
			Turn turn = recordTurn.get(i);
			if(i % 2 == 0) {
				System.out.print("先攻：");
				turn.showTurn();
				System.out.println("");
			}else {
				System.out.print("後攻：");
				turn.showTurn();
				System.out.println("");
			}
		}
	}
}
