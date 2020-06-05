package 三目並べ;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;

public class Turn_Board_test {

	Board b;

	@Before
	public void setup() {
		b = new Board();
	}

	@Test
	public void check_1() {
		// 事前準備
		Turn turn = new Turn();
		Cell cell;
		cell = b.getCell(1, 2);

		// 実行
		boolean act = turn.checkSetting("〇", 1, 2, b);
		// 検証
		assertThat(act, is(true));
	}

	@Test
	public void check_2() {
		// 事前準備
		Turn turn = new Turn();
		Cell cell;
		cell = b.getCell(1, 2);
		cell.setMark("〇");

		// 実行
		boolean act = turn.checkSetting("〇", 1, 2, b);
		// 検証
		assertThat(act, is(false));
	}

}
