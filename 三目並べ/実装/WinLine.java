package union;

import java.util.ArrayList;

public class WinLine {
	
	ArrayList<Cell> cells;
	
	public WinLine() {
		cells = new ArrayList<Cell>();
	}
	
	//3つマークが揃っているかの確認
	public boolean checkLine() {
		boolean judge = true;
		String mark1 = cells.get(0).getMark();
		String mark2;
		//1マス目にマークがない場合
		if(mark1 == " ") {
			judge = false;
			return judge;
		}else {
			//2マス目以降の確認
			for(int i=1;i<=cells.size()-1;i++ ) {
				mark2 = cells.get(i).getMark();
				if(mark1 != mark2) {
					judge = false;
					break;
				}
			}
			return judge;
		}
	}
	//リストに追加
	public void addCell(Cell cell) {
		cells.add(cell);
		
	}
}
