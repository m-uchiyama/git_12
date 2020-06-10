package cardgame;

public class HardReferee extends Referee{
	
	public HardReferee(Cards cards) {
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
		} else {
			System.out.print("不一致");
			judge = false;
		}
		System.out.println();

		System.out.print("スート：");
		if(card.getSuit() == answer.getSuit()){
			System.out.print("一致");
		} else {
			System.out.print("不一致");
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

	public boolean checkDraw(int number,Suit suit) {
		Cards cards = getCards();
		return cards.checkCard(number,suit);
	}

	public void recieveCard(int number,Suit suit,Card c) {
		c.setCard(number,suit);
	}
}
