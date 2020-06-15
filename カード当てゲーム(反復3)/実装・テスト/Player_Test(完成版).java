package cardgameDX;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.junit.Test;

import cardgameDX.Player;

public class Player_Test {
	
		
		@Test
		public void Test1_1() {
		//入力
			Player p1 = new Player();
		    String actual = p1.inputBetting();
		
		//出力
		    String expected = "ジュース";
		
		//テストの実行
		    assertThat(actual, is(expected));
		}
		
		
		@Test(expected = Exception.class) 
		public void Test1_2() {
			//賭けるものに何も入力しない(null)
			Player player = new Player();
			String kake = player.inputBetting();
			fail("例外が起きなかった");
		}
		
		@Test(expected = Exception.class) 
		public void Test1_3() {
			//スペース(空白)のみを入力した場合
			Player player = new Player();
			String kake = player.inputBetting();
			fail("例外が起きなかった");
		}
		
		@Test(expected = Exception.class) 
		public void Test1_4() {
			//2文字目をスペースにした
			Player player = new Player();
			String kake = player.inputBetting();
			fail("例外が起きなかった");
		}
		
		@Test
		public void Test2_1() {
		//入力
			Player p1 = new Player();
		    String actual = p1.inputName();
		
		//出力
		    String expected = "プレイヤー1";
		
		//テストの実行
		    assertThat(actual, is(expected));
		}
		
		
		@Test(expected = Exception.class) 
		public void Test2_2() {
			//何も入力しなかった場合
			Player player = new Player();
			String name = player.inputName();
			fail("例外が起きなかった");
		}
		
		
		@Test(expected = Exception.class) 
		public void Test2_3() {
			//スペースのみを入力した場合
			Player player = new Player();
			String name = player.inputName();
			fail("例外が起きなかった");
		}
		
		
		@Test(expected = Exception.class) 
		public void Test2_4() {
			//2文字目にスペースを入力した場合
			Player player = new Player();
			String name = player.inputName();
			fail("例外が起きなかった");
		}
		
		
		@Test(expected = Exception.class) 
		public void Test3_1() {
			//対戦モードを選ぶ :入力値　1
			Player player = new Player();
			int mode = player.selectMode();
			fail("例外が起きなかった");
		}
		
		
		@Test(expected = Exception.class) 
		public void Test3_2() {
			//対戦モードを選ぶ :入力値　2
			Player player = new Player();
			int mode = player.selectMode();
			fail("例外が起きなかった");
		}
		
		
		@Test(expected = Exception.class) 
		public void Test3_3() {
			//範囲外の数値を入力する :入力値　3
			Player player = new Player();
			int mode = player.selectMode();
			fail("例外が起きなかった");
		}
		
		
		@Test
		public void Test4_1() {
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
		public void Test4_2(){
			//入力値　数：3,スート：4
			Player player = new Player();
			int[] card = player.input();
			fail("例外が起きなかった");
		}
		
		
		@Test(expected = Exception.class)
		public void Test4_3(){
			//入力値　数：15,スート：2
			Player player = new Player();
			int[] card = player.input();
			fail("例外が起きなかった");
		}
		
		
		@Test(expected = Exception.class)
		public void Test4_4(){
			//入力値　数：15,スート：4
			Player player = new Player();
			int[] card = player.input();
			fail("例外が起きなかった");
		}
		
		
		@Test(expected = Exception.class) 
		public void Test5_1() {
			//優しい審判を選ぶ :入力値　1
			Player player = new Player();
			int referee = player.selectReferee();
			fail("例外が起きなかった");
		}
		
		
		@Test(expected = Exception.class) 
		public void Test5_2() {
			//優しい審判を選ぶ :入力値　2
			Player player = new Player();
			int referee = player.selectReferee();
			fail("例外が起きなかった");
		}
		
		
		@Test(expected = Exception.class) 
		public void Test5_3() {
			//範囲外の数値を入力する :入力値　3
			Player player = new Player();
			int referee = player.selectReferee();
			fail("例外が起きなかった");
		}
}

