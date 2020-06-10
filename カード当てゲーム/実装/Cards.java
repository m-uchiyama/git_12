package cardgame;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Cards {
	
	private static int CARDS = 52;
	private List<Card> card;
	
	//コンストラクタ
	public Cards(){
		card = new LinkedList<Card>();
		Suit[] suits = {Suit.SPADE, Suit.HEART, Suit.DIA, Suit.CLOVER};
		for(int i = 0 ; i < CARDS; i++) {
			// カードの生成と山への登録(スペード1~13、ハート1~13、ダイア1~13、クローバー1~13)
			int number = 1 + (i % Card.MAX);
			Suit suit = suits[(i / Card.MAX)];
			card.add(new Card(number, suit));
		}
		//シャッフル
		Collections.shuffle(card);
	}
	
	//既に指定されているかどうかの判定メソッド
	public boolean checkCard(int number, Suit suit) {
		int i;
		boolean judge = true;
		for(i=0;i<CARDS;i++) {
			if((card.get(i).getNumber() == number) && (card.get(i).getSuit() == suit)) {
				break;
			}
		}
		judge = card.get(i).getStatus();
		if(judge == false) {
			judge = false;
		}
		return judge;
	}
	
	//当たりカードを知るメソッド
	public Card drawCard(){
		return card.get(0);
	}
}
