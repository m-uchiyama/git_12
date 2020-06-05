package union;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.junit.Test;

public class Cell_WinLine_Test {
		   
		    @Test
		    public void Test1() {
		    	//横にマークがそろう場合
		    	WinLine line = new WinLine();
		        Cell cell1 = new Cell(0,0);
		        Cell cell2 = new Cell(1,0);
		        Cell cell3 = new Cell(2,0);
		        cell1.setMark("〇");
		        cell2.setMark("〇");
		        cell3.setMark("〇");
		        line.addCell(cell1);
		        line.addCell(cell2);
		        line.addCell(cell3);
		        boolean actual = line.checkLine();
		        assertThat(actual,is(true));   
		    }
		    
		    @Test
		    public void Test2() {
		    	//縦にマークがそろう場合
		    	WinLine line = new WinLine();
		        Cell cell4 = new Cell(0,0);
		        Cell cell5 = new Cell(0,1);
		        Cell cell6 = new Cell(0,2);
		        cell4.setMark("〇");
		        cell5.setMark("〇");
		        cell6.setMark("〇");
		        line.addCell(cell4);
		        line.addCell(cell5);
		        line.addCell(cell6);
		        boolean actual = line.checkLine();
		        assertThat(actual,is(true));   
		    }
		    
		    @Test
		    public void Test3() {
		    	//ななめにマークがそろう場合
		    	WinLine line = new WinLine();
		        Cell cell7 = new Cell(0,0);
		        Cell cell8 = new Cell(1,1);
		        Cell cell9 = new Cell(2,2);
		        cell7.setMark("〇");
		        cell8.setMark("〇");
		        cell9.setMark("〇");
		        line.addCell(cell7);
		        line.addCell(cell8);
		        line.addCell(cell9);
		        boolean actual = line.checkLine();
		        assertThat(actual,is(true));   
		    }
		    
		    @Test
		    public void Test4() {
		    	//マークがそろわない場合
		    	WinLine line = new WinLine();
		        Cell cell10 = new Cell(0,0);
		        Cell cell11 = new Cell(0,1);
		        Cell cell12 = new Cell(0,2);
		        cell10.setMark("〇");
		        cell11.setMark("×");
		        cell12.setMark("〇");
		        line.addCell(cell10);
		        line.addCell(cell11);
		        line.addCell(cell12);
		        boolean actual = line.checkLine();
		        assertThat(actual,is(false));   
		    }
		

}
