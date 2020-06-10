package cardgame;

import org.junit.Test;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class Card_Player_Referee {
	
	@Test
	public void test1_1() {
		
		Player player = new Player();
		int[] plin = player.input();
		Suit s = Suit.SPADE;
		if(plin[1] == 0) {
			s = Suit.SPADE;
		}else if(plin[1] == 1) {
			s = Suit.HEART;
		}else if(plin[1] == 2) {
			s = Suit.DIA;
		}else if(plin[1] == 3) {
			s = Suit.CLOVER;
		}
		
		CardsStub cards = new CardsStub();
		HardReferee hard = new HardReferee(cards);
		Card card = new Card(plin[0],s);
		card.setCard(plin[0],s);
		boolean actual = hard.showJudge(card);
		
		boolean expected = true;
		
		assertThat(actual,is(expected));
		
	}
	
	@Test
	public void test1_2() {
		
		Player player = new Player();
		int[] plin = player.input();
		Suit s = Suit.SPADE;
		if(plin[1] == 0) {
			s = Suit.SPADE;
		}else if(plin[1] == 1) {
			s = Suit.HEART;
		}else if(plin[1] == 2) {
			s = Suit.DIA;
		}else if(plin[1] == 3) {
			s = Suit.CLOVER;
		}
		
		CardsStub cards = new CardsStub();
		HardReferee hard = new HardReferee(cards);
		Card card = new Card(plin[0],s);
		card.setCard(plin[0],s);
		boolean actual = hard.showJudge(card);
		
		boolean expected = true;
		
		assertThat(actual,is(expected));
		
	}
	
	@Test
	public void test1_3() {
		
		Player player = new Player();
		int[] plin = player.input();
		Suit s = Suit.SPADE;
		if(plin[1] == 0) {
			s = Suit.SPADE;
		}else if(plin[1] == 1) {
			s = Suit.HEART;
		}else if(plin[1] == 2) {
			s = Suit.DIA;
		}else if(plin[1] == 3) {
			s = Suit.CLOVER;
		}
		
		CardsStub cards = new CardsStub();
		HardReferee hard = new HardReferee(cards);
		Card card = new Card(plin[0],s);
		card.setCard(plin[0],s);
		boolean actual = hard.showJudge(card);
		
		boolean expected = true;
		
		assertThat(actual,is(expected));
		
	}
	
	@Test
	public void test1_4() {
		
		Player player = new Player();
		int[] plin = player.input();
		Suit s = Suit.SPADE;
		if(plin[1] == 0) {
			s = Suit.SPADE;
		}else if(plin[1] == 1) {
			s = Suit.HEART;
		}else if(plin[1] == 2) {
			s = Suit.DIA;
		}else if(plin[1] == 3) {
			s = Suit.CLOVER;
		}
		
		CardsStub cards = new CardsStub();
		HardReferee hard = new HardReferee(cards);
		Card card = new Card(plin[0],s);
		card.setCard(plin[0],s);
		boolean actual = hard.showJudge(card);
		
		boolean expected = true;
		
		assertThat(actual,is(expected));
		
	}
	
	@Test
	public void test2_1() {
		
		Player player = new Player();
		int[] plin = player.input();
		Suit s = Suit.SPADE;
		if(plin[1] == 0) {
			s = Suit.SPADE;
		}else if(plin[1] == 1) {
			s = Suit.HEART;
		}else if(plin[1] == 2) {
			s = Suit.DIA;
		}else if(plin[1] == 3) {
			s = Suit.CLOVER;
		}
		
		CardsStub cards = new CardsStub();
		EasyReferee hard = new EasyReferee(cards);
		Card card = new Card(plin[0],s);
		card.setCard(plin[0],s);
		boolean actual = hard.showJudge(card);
		
		boolean expected = true;
		
		assertThat(actual,is(expected));
		
	}
	
	@Test
	public void test2_2() {
		
		Player player = new Player();
		int[] plin = player.input();
		Suit s = Suit.SPADE;
		if(plin[1] == 0) {
			s = Suit.SPADE;
		}else if(plin[1] == 1) {
			s = Suit.HEART;
		}else if(plin[1] == 2) {
			s = Suit.DIA;
		}else if(plin[1] == 3) {
			s = Suit.CLOVER;
		}
		
		CardsStub cards = new CardsStub();
		EasyReferee hard = new EasyReferee(cards);
		Card card = new Card(plin[0],s);
		card.setCard(plin[0],s);
		boolean actual = hard.showJudge(card);
		
		boolean expected = true;
		
		assertThat(actual,is(expected));
		
	}
	
	@Test
	public void test2_3() {
		
		Player player = new Player();
		int[] plin = player.input();
		Suit s = Suit.SPADE;
		if(plin[1] == 0) {
			s = Suit.SPADE;
		}else if(plin[1] == 1) {
			s = Suit.HEART;
		}else if(plin[1] == 2) {
			s = Suit.DIA;
		}else if(plin[1] == 3) {
			s = Suit.CLOVER;
		}
		
		CardsStub cards = new CardsStub();
		EasyReferee hard = new EasyReferee(cards);
		Card card = new Card(plin[0],s);
		card.setCard(plin[0],s);
		boolean actual = hard.showJudge(card);
		
		boolean expected = true;
		
		assertThat(actual,is(expected));
		
	}
	
	@Test
	public void test2_4() {
		
		Player player = new Player();
		int[] plin = player.input();
		Suit s = Suit.SPADE;
		if(plin[1] == 0) {
			s = Suit.SPADE;
		}else if(plin[1] == 1) {
			s = Suit.HEART;
		}else if(plin[1] == 2) {
			s = Suit.DIA;
		}else if(plin[1] == 3) {
			s = Suit.CLOVER;
		}
		
		CardsStub cards = new CardsStub();
		EasyReferee hard = new EasyReferee(cards);
		Card card = new Card(plin[0],s);
		card.setCard(plin[0],s);
		boolean actual = hard.showJudge(card);
		
		boolean expected = true;
		
		assertThat(actual,is(expected));
		
	}
	
	@Test
	public void test2_5() {
		
		Player player = new Player();
		int[] plin = player.input();
		Suit s = Suit.SPADE;
		if(plin[1] == 0) {
			s = Suit.SPADE;
		}else if(plin[1] == 1) {
			s = Suit.HEART;
		}else if(plin[1] == 2) {
			s = Suit.DIA;
		}else if(plin[1] == 3) {
			s = Suit.CLOVER;
		}
		
		CardsStub cards = new CardsStub();
		EasyReferee hard = new EasyReferee(cards);
		Card card = new Card(plin[0],s);
		card.setCard(plin[0],s);
		boolean actual = hard.showJudge(card);
		
		boolean expected = true;
		
		assertThat(actual,is(expected));
		
	}
	
	@Test
	public void test2_6() {
		
		Player player = new Player();
		int[] plin = player.input();
		Suit s = Suit.SPADE;
		if(plin[1] == 0) {
			s = Suit.SPADE;
		}else if(plin[1] == 1) {
			s = Suit.HEART;
		}else if(plin[1] == 2) {
			s = Suit.DIA;
		}else if(plin[1] == 3) {
			s = Suit.CLOVER;
		}
		
		CardsStub cards = new CardsStub();
		EasyReferee hard = new EasyReferee(cards);
		Card card = new Card(plin[0],s);
		card.setCard(plin[0],s);
		boolean actual = hard.showJudge(card);
		
		boolean expected = true;
		
		assertThat(actual,is(expected));
		
	}
	
	@Test
	public void test2_7() {
		
		Player player = new Player();
		int[] plin = player.input();
		Suit s = Suit.SPADE;
		if(plin[1] == 0) {
			s = Suit.SPADE;
		}else if(plin[1] == 1) {
			s = Suit.HEART;
		}else if(plin[1] == 2) {
			s = Suit.DIA;
		}else if(plin[1] == 3) {
			s = Suit.CLOVER;
		}
		
		CardsStub cards = new CardsStub();
		EasyReferee hard = new EasyReferee(cards);
		Card card = new Card(plin[0],s);
		card.setCard(plin[0],s);
		boolean actual = hard.showJudge(card);
		
		boolean expected = true;
		
		assertThat(actual,is(expected));
		
	}
}
