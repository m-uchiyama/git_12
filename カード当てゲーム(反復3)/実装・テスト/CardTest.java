package cardgame;

import static org.junit.Assert.*;

import org.junit.Test;
import static org.hamcrest.CoreMatchers.*;

public class CardTest {
	
	@Test
	public void TEST1_1() {
		//事前準備
		Card card = new Card(1,Suit.SPADE);
		card.setCard(1,Suit.SPADE);
		int expected_number = 1;
		Suit expected_suit = Suit.SPADE;
		
		//実行
		int actualNumber = card.getNumber();
		Suit actualSuit = card.getSuit();
		
		//結果
		assertThat(actualNumber, is(expected_number));
		assertThat(actualSuit, is(expected_suit));
	}

}
