package cardgame;

public abstract class Referee {
	private Cards cards;
	private Card answer;
	
	//初期化
	protected final void initialize(Cards cards){
		this.cards = cards;
		answer = cards.drawCard();
	}
	//カードの山のゲッター
	protected Cards getCards() {
		return cards;
	}
	//当たりカードのゲッター
	protected Card getAnsCard(){
		return answer;
	}
	//判定&結果表示
	public abstract boolean showJudge(Card card);
	//カードを指定できるか判定
	public abstract boolean checkDraw(int number,Suit suit);
	//カードを渡す
	public abstract void recieveCard(int number,Suit suit,Card card);

}
