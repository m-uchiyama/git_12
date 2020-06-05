package union;

public class Turn {
	
	private Cell cell;
	
	public Turn() {}
	public void setCell(Cell cell) {
		this.cell = cell;
	}
	//置けるかどうか確認して、置けるのであればtrueを返しセットする。置けなければfalseを返す。
	public boolean checkSetting(String mark, int x, int y,Board board) {
		if(board.checkCell(y, x) == true) {
			Cell cell;
			cell = board.getCell(y, x);
			this.setCell(cell);
			cell.setMark(mark);
			return true;
		}else {
			System.out.println("既に置かれています");
			return false;
		}
	}
	//1ターン表示用メソッド
	public void showTurn() {
		System.out.print("("+(this.cell.getY() + 1)+","+(this.cell.getX() + 1)+")"+" "+this.cell.getMark());
	}

}
