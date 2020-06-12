package cardgameDX;

public class Game {
	
	private Referee referee;
	private Player player;
	private String bettingPL1 = " ";
	private String bettingPL2 = " ";
	private String name1 = " ";
	private String name2 = " ";
	private int judge = 4;
	//コンストラクタ
	public Game(Referee referee, Player player) {
		this.referee = referee;
		this.player = player;
	}
	
	//1人用ゲーム開始
	public void start1() {
		
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
			judge1 = referee.showJudge1(c);
			if(judge1 == true) {//判定があたりならゲーム終了
				break;
			}
		}
	}
	
	//2人対戦用ゲーム開始
	public void start2() {
		
		System.out.println("1人目");
		name1 = player.inputName();
		System.out.println("2人目");
		name2 = player.inputName();
		
		System.out.println("1人目");
		bettingPL1 = player.inputBetting();
		System.out.println("2人目");
		bettingPL2 = player.inputBetting();
		
		while(judge == 4) {
			
			/*
			 * 数とスートを入力
			 */
			System.out.print("1人目入力：");
			int[] card1 = new int[2];
			card1 = player.input();
			//数字で入力されたスートをSuit型に変換
			Suit s1 = Suit.SPADE;
			if(card1[1] == 0) {
				s1 = Suit.SPADE;
			}else if(card1[1] == 1) {
				s1 = Suit.HEART;
			}else if(card1[1] == 2) {
				s1 = Suit.DIA;
			}else if(card1[1] == 3) {
				s1 = Suit.CLOVER;
			}
			
			System.out.print("2人目入力：");
			int[] card2 = new int[2];
			card2 = player.input();
			//数字で入力されたスートをSuit型に変換
			Suit s2 = Suit.SPADE;
			if(card2[1] == 0) {
				s2 = Suit.SPADE;
			}else if(card2[1] == 1) {
				s2 = Suit.HEART;
			}else if(card2[1] == 2) {
				s2 = Suit.DIA;
			}else if(card2[1] == 3) {
				s2 = Suit.CLOVER;
			}
			
			//入力された数とスートからなるカード
			Card c1,c2;
			c1 = new Card(card1[0],s1);
			c2 = new Card(card1[0],s1);
			
			referee.recieveCard(card1[0],s1,c1);
			referee.recieveCard(card2[0],s2,c2);
			
			//判定&結果表示
			judge = referee.showJudge2(c1,c2);
			if(judge == 1) {
				break;
			}else if(judge == 2) {
				break;
			}else if(judge == 3) {
				break;
			}else if(judge == 4) {
				System.out.println("2人共はずれ！もういっかい！");
			}
		}
		showResult(judge);
	}
	
	public void showResult(int judge) {
		if(judge == 1) {
			System.out.println("引き分けです");
			System.out.println(name1+"は"+name2+"に"+bettingPL1+"を、"+name2+"は"+name1+"に"+bettingPL2+"を絶対あげてね！");
		}else if(judge == 2) {
			System.out.println("勝者："+name1);
			System.out.println(name2+"は"+name1+"に"+bettingPL2+"を絶対あげてね！");
		}else if(judge == 3) {
			System.out.println("勝者："+name2);
			System.out.println(name1+"は"+name2+"に"+bettingPL1+"を絶対あげてね！");
		}
	}

}
