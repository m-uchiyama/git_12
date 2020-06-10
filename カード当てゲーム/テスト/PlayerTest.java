package cardgame;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.junit.Test;

import cardgame.Player;

public class PlayerTest {
	
		@Test
		public void Test1() {
		Player p = new Player();

			//入力
			int [] card = p.input();
			System.out.println(card[0] );
			System.out.println(card[1] );

			//出力
			int[] expected = {3,0};

			//テストの実行
			int[] actual = card;

			assertThat(actual, is(expected));
		
	}
		
		@Test(expected = Exception.class)
		public void Test2(){
			//入力値　数：3,スート：4
			Player player = new Player();
			int[] card = player.input();
			fail("例外が起きなかった");
		}
		
		
		@Test(expected = Exception.class)
		public void Test3(){
			//入力値　数：15,スート：2
			Player player = new Player();
			int[] card = player.input();
			fail("例外が起きなかった");
		}
		
		
		@Test(expected = Exception.class)
		public void Test4(){
			//入力値　数：15,スート：4
			Player player = new Player();
			int[] card = player.input();
			fail("例外が起きなかった");
		}
}
