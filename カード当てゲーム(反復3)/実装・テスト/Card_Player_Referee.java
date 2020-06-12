package test;

import org.junit.Test;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class Card_Player_Referee {
	
	@Test
	public void test1_1() {
		Player player = new Player();
		int[] plin1 = player.input();
		Suit s1 = Suit.SPADE;
		if(plin1[1] == 0) {
			s1 = Suit.SPADE;
		}else if(plin1[1] == 1) {
			s1 = Suit.HEART;
		}else if(plin1[1] == 2) {
			s1 = Suit.DIA;
		}else if(plin1[1] == 3) {
			s1 = Suit.CLOVER;
		}
		
		int[] plin2 = player.input();
		Suit s2 = Suit.SPADE;
		if(plin2[1] == 0) {
			s2 = Suit.SPADE;
		}else if(plin2[1] == 1) {
			s2 = Suit.HEART;
		}else if(plin2[1] == 2) {
			s2 = Suit.DIA;
		}else if(plin2[1] == 3) {
			s2 = Suit.CLOVER;
		}
		
		CardsStub cards = new CardsStub();
		HardReferee hard = new HardReferee(cards);
		Card card1 = new Card(plin1[0],s1);
		card1.setCard(plin1[0],s1);
		Card card2 = new Card(plin2[0],s2);
		card2.setCard(plin2[0],s2);
		
		int actual = hard.showJudge(card1,card2);
		int expected = 2;
		
		assertThat(actual,is(expected));
	}
	
	@Test
	public void test1_2() {
		
		Player player = new Player();
		int[] plin1 = player.input();
		Suit s1 = Suit.SPADE;
		if(plin1[1] == 0) {
			s1 = Suit.SPADE;
		}else if(plin1[1] == 1) {
			s1 = Suit.HEART;
		}else if(plin1[1] == 2) {
			s1 = Suit.DIA;
		}else if(plin1[1] == 3) {
			s1 = Suit.CLOVER;
		}
		
		int[] plin2 = player.input();
		Suit s2 = Suit.SPADE;
		if(plin2[1] == 0) {
			s2 = Suit.SPADE;
		}else if(plin2[1] == 1) {
			s2 = Suit.HEART;
		}else if(plin2[1] == 2) {
			s2 = Suit.DIA;
		}else if(plin2[1] == 3) {
			s2 = Suit.CLOVER;
		}
		
		CardsStub cards = new CardsStub();
		HardReferee hard = new HardReferee(cards);
		Card card1 = new Card(plin1[0],s1);
		card1.setCard(plin1[0],s1);
		Card card2 = new Card(plin2[0],s2);
		card2.setCard(plin2[0],s2);
		
		int actual = hard.showJudge(card1,card2);
		int expected = 3;
		
		assertThat(actual,is(expected));
		
	}
	
	@Test
	public void test2_1() {
		
		Player player = new Player();
		int[] plin1 = player.input();
		Suit s1 = Suit.SPADE;
		if(plin1[1] == 0) {
			s1 = Suit.SPADE;
		}else if(plin1[1] == 1) {
			s1 = Suit.HEART;
		}else if(plin1[1] == 2) {
			s1 = Suit.DIA;
		}else if(plin1[1] == 3) {
			s1 = Suit.CLOVER;
		}
		
		int[] plin2 = player.input();
		Suit s2 = Suit.SPADE;
		if(plin2[1] == 0) {
			s2 = Suit.SPADE;
		}else if(plin2[1] == 1) {
			s2 = Suit.HEART;
		}else if(plin2[1] == 2) {
			s2 = Suit.DIA;
		}else if(plin2[1] == 3) {
			s2 = Suit.CLOVER;
		}
		
		CardsStub cards = new CardsStub();
		EasyReferee easy = new EasyReferee(cards);
		Card card1 = new Card(plin1[0],s1);
		card1.setCard(plin1[0],s1);
		Card card2 = new Card(plin2[0],s2);
		card2.setCard(plin2[0],s2);
		
		int actual = easy.showJudge(card1,card2);
		int expected = 2;
		
		assertThat(actual,is(expected));
		
	}
	
	@Test
	public void test2_2() {
		
		Player player = new Player();
		int[] plin1 = player.input();
		Suit s1 = Suit.SPADE;
		if(plin1[1] == 0) {
			s1 = Suit.SPADE;
		}else if(plin1[1] == 1) {
			s1 = Suit.HEART;
		}else if(plin1[1] == 2) {
			s1 = Suit.DIA;
		}else if(plin1[1] == 3) {
			s1 = Suit.CLOVER;
		}
		
		int[] plin2 = player.input();
		Suit s2 = Suit.SPADE;
		if(plin2[1] == 0) {
			s2 = Suit.SPADE;
		}else if(plin2[1] == 1) {
			s2 = Suit.HEART;
		}else if(plin2[1] == 2) {
			s2 = Suit.DIA;
		}else if(plin2[1] == 3) {
			s2 = Suit.CLOVER;
		}
		
		CardsStub cards = new CardsStub();
		EasyReferee easy = new EasyReferee(cards);
		Card card1 = new Card(plin1[0],s1);
		card1.setCard(plin1[0],s1);
		Card card2 = new Card(plin2[0],s2);
		card2.setCard(plin2[0],s2);
		
		int actual = easy.showJudge(card1,card2);
		int expected = 3;
		
		assertThat(actual,is(expected));
		
	}
	
	@Test
	public void test2_3() {
		
		Player player = new Player();
		int[] plin1 = player.input();
		Suit s1 = Suit.SPADE;
		if(plin1[1] == 0) {
			s1 = Suit.SPADE;
		}else if(plin1[1] == 1) {
			s1 = Suit.HEART;
		}else if(plin1[1] == 2) {
			s1 = Suit.DIA;
		}else if(plin1[1] == 3) {
			s1 = Suit.CLOVER;
		}
		
		int[] plin2 = player.input();
		Suit s2 = Suit.SPADE;
		if(plin2[1] == 0) {
			s2 = Suit.SPADE;
		}else if(plin2[1] == 1) {
			s2 = Suit.HEART;
		}else if(plin2[1] == 2) {
			s2 = Suit.DIA;
		}else if(plin2[1] == 3) {
			s2 = Suit.CLOVER;
		}
		
		CardsStub cards = new CardsStub();
		EasyReferee easy = new EasyReferee(cards);
		Card card1 = new Card(plin1[0],s1);
		card1.setCard(plin1[0],s1);
		Card card2 = new Card(plin2[0],s2);
		card2.setCard(plin2[0],s2);
		
		int actual = easy.showJudge(card1,card2);
		int expected = 3;
		
		assertThat(actual,is(expected));
		
	}
	
	@Test
	public void test2_4() {
		
		Player player = new Player();
		int[] plin1 = player.input();
		Suit s1 = Suit.SPADE;
		if(plin1[1] == 0) {
			s1 = Suit.SPADE;
		}else if(plin1[1] == 1) {
			s1 = Suit.HEART;
		}else if(plin1[1] == 2) {
			s1 = Suit.DIA;
		}else if(plin1[1] == 3) {
			s1 = Suit.CLOVER;
		}
		
		int[] plin2 = player.input();
		Suit s2 = Suit.SPADE;
		if(plin2[1] == 0) {
			s2 = Suit.SPADE;
		}else if(plin2[1] == 1) {
			s2 = Suit.HEART;
		}else if(plin2[1] == 2) {
			s2 = Suit.DIA;
		}else if(plin2[1] == 3) {
			s2 = Suit.CLOVER;
		}
		
		CardsStub cards = new CardsStub();
		EasyReferee easy = new EasyReferee(cards);
		Card card1 = new Card(plin1[0],s1);
		card1.setCard(plin1[0],s1);
		Card card2 = new Card(plin2[0],s2);
		card2.setCard(plin2[0],s2);
		
		int actual = easy.showJudge(card1,card2);
		int expected = 3;
		
		assertThat(actual,is(expected));
		
	}
	
	@Test
	public void test3_1() {
		
		Player player = new Player();
		int[] plin1 = player.input();
		Suit s1 = Suit.SPADE;
		if(plin1[1] == 0) {
			s1 = Suit.SPADE;
		}else if(plin1[1] == 1) {
			s1 = Suit.HEART;
		}else if(plin1[1] == 2) {
			s1 = Suit.DIA;
		}else if(plin1[1] == 3) {
			s1 = Suit.CLOVER;
		}
		
		int[] plin2 = player.input();
		Suit s2 = Suit.SPADE;
		if(plin2[1] == 0) {
			s2 = Suit.SPADE;
		}else if(plin2[1] == 1) {
			s2 = Suit.HEART;
		}else if(plin2[1] == 2) {
			s2 = Suit.DIA;
		}else if(plin2[1] == 3) {
			s2 = Suit.CLOVER;
		}
		
		CardsStub cards = new CardsStub();
		HardReferee hard = new HardReferee(cards);
		Card card1 = new Card(plin1[0],s1);
		card1.setCard(plin1[0],s1);
		Card card2 = new Card(plin2[0],s2);
		card2.setCard(plin2[0],s2);
		
		int actual = hard.showJudge(card1,card2);
		int expected = 1;
		
		assertThat(actual,is(expected));
		
	}
	
	@Test
	public void test3_2() {
		
		Player player = new Player();
		int[] plin1 = player.input();
		Suit s1 = Suit.SPADE;
		if(plin1[1] == 0) {
			s1 = Suit.SPADE;
		}else if(plin1[1] == 1) {
			s1 = Suit.HEART;
		}else if(plin1[1] == 2) {
			s1 = Suit.DIA;
		}else if(plin1[1] == 3) {
			s1 = Suit.CLOVER;
		}
		
		int[] plin2 = player.input();
		Suit s2 = Suit.SPADE;
		if(plin2[1] == 0) {
			s2 = Suit.SPADE;
		}else if(plin2[1] == 1) {
			s2 = Suit.HEART;
		}else if(plin2[1] == 2) {
			s2 = Suit.DIA;
		}else if(plin2[1] == 3) {
			s2 = Suit.CLOVER;
		}
		
		CardsStub cards = new CardsStub();
		EasyReferee easy = new EasyReferee(cards);
		Card card1 = new Card(plin1[0],s1);
		card1.setCard(plin1[0],s1);
		Card card2 = new Card(plin2[0],s2);
		card2.setCard(plin2[0],s2);
		
		int actual = easy.showJudge(card1,card2);
		int expected = 1;
		
		assertThat(actual,is(expected));
		
	}
	
	@Test
	public void test4_1() {
		
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
	public void test4_2() {
		
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
		
		boolean expected = false;
		
		assertThat(actual,is(expected));
		
	}
	
	@Test
	public void test4_3() {
		
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
		
		boolean expected = false;
		
		assertThat(actual,is(expected));
		
	}
	
	@Test
	public void test4_4() {
		
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
		
		boolean expected = false;
		
		assertThat(actual,is(expected));
		
	}
	
	@Test
	public void test5_1() {
		
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
		EasyReferee easy = new EasyReferee(cards);
		Card card = new Card(plin[0],s);
		card.setCard(plin[0],s);
		boolean actual = easy.showJudge(card);
		
		boolean expected = true;
		
		assertThat(actual,is(expected));
		
	}
	
	@Test
	public void test5_2() {
		
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
		EasyReferee easy = new EasyReferee(cards);
		Card card = new Card(plin[0],s);
		card.setCard(plin[0],s);
		boolean actual = easy.showJudge(card);
		
		boolean expected = false;
		
		assertThat(actual,is(expected));
		
	}
	
	@Test
	public void test5_3() {
		
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
		EasyReferee easy = new EasyReferee(cards);
		Card card = new Card(plin[0],s);
		card.setCard(plin[0],s);
		boolean actual = easy.showJudge(card);
		
		boolean expected = false;
		
		assertThat(actual,is(expected));
		
	}
	@Test
	public void test5_4() {
		
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
		EasyReferee easy = new EasyReferee(cards);
		Card card = new Card(plin[0],s);
		card.setCard(plin[0],s);
		boolean actual = easy.showJudge(card);
		
		boolean expected = false;
		
		assertThat(actual,is(expected));
		
	}
}
