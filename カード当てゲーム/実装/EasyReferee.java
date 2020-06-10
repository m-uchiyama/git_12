package cardgame;

public class EasyReferee extends Referee{
	
	public EasyReferee(Cards cards) {
		initialize(cards);
	}

	public boolean showJudge(Card card) {
		Card answer = getAnsCard();
		
		//デバッグ用
		System.out.println(answer.getNumber());
		System.out.println(answer.getSuit());
		
		boolean judge = true;
		System.out.print("数：");
		if(card.getNumber() == answer.getNumber()){
			System.out.print("一致");
		}else {
			if(card.getNumber() < answer.getNumber()){
				System.out.print("もっと大きい");
			}else{
				System.out.print("もっと小さい");
			}
			judge = false;
		}
		System.out.println();

		System.out.print("スート：");
		if(card.getSuit() == answer.getSuit()){
			System.out.print("一致");
		}else {
			if( isSameColor(card.getSuit(), answer.getSuit()) ){
				System.out.print("惜しい");
			}else{
				System.out.print("不一致");
			}
			judge = false;
		}
		System.out.println();

		if(judge){
			System.out.println("カードは一致しました");
		}else{
			System.out.println("カードは一致していません");
		}
		return judge;
	}
	//同じ色(スペード&クローバー、ハート&ダイア)か判定
	private boolean isSameColor(Suit s1, Suit s2){
		boolean isSame = false;
		switch(s1){
		case SPADE:
		case CLOVER:
			if((s2 == Suit.SPADE) || (s2 == Suit.CLOVER)){
				isSame = true;
			}
			break;
		case HEART:
		case DIA:
			if((s2 == Suit.HEART) || (s2 == Suit.DIA)){
				isSame = true;
			}
			break;
		default:
			// 到達しないはず
			throw new IllegalStateException();
		}
		return isSame;
	}

	public boolean checkDraw(int number,Suit suit) {
		Cards cards = getCards();
		return cards.checkCard(number,suit);
	}

	public void recieveCard(int number,Suit suit,Card c) {
		c.setCard(number,suit);
	}
}
