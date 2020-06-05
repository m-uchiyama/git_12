package unit;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class CellTest {
	Cell cell;

	@Test
	public void testGetMark_1_1() {
		Cell cell = new Cell(1, 1);
		cell.setMark("〇");
		String expected = "〇";
		String actual = cell.getMark();

		assertThat(actual, is(expected));
	}

	@Test
	public void testGetMark_1_2() {
		Cell cell = new Cell(1, 1);
		cell.setMark("×");
		String expected = "×";
		String actual = cell.getMark();

		assertThat(actual, is(expected));
	}

	@Test
	public void testGetMark_1_3() {
		Cell cell = new Cell(1, 1);
		cell.setMark(" ");
		String expected = " ";
		String actual = cell.getMark();

		assertThat(actual, is(expected));
	}
}