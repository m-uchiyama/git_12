package cardgameDX;

public class Card {
	private int number;
	private Suit suit;
	private boolean status = true;
	public static int MAX =13;
	public static int MIN =1;
	
	//コンストラクタ
	public Card(int number,Suit suit){
		this.number = number;
		this.suit = suit;
	}
	
	//数とスートをセット
	public void setCard(int number, Suit suit) {
		this.number = number;
		this.suit = suit;
		this.status = false;
	}
	
	//状態取得
	public boolean getStatus() {
		return this.status;
	}
	//数取得
	public int getNumber() {
		return number;
	}
	//スート取得
	public Suit getSuit() {
		return suit;
	}
}
