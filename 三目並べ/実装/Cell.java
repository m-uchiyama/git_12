package union;

public class Cell {
	
	private String mark = " ";
	private int x, y;
	//コンストラクタ
	public Cell(int x,int y) {
		this.x = x;
		this.y = y;
	}
	
	//マスにマークをセット
	public void setMark(String mark) {
		this.mark = mark;
	}
	
	//マスのx座標取得
	public int getX() {
		return this.x;
	}
	//マスのy座標取得
	public int getY() {
		return this.y;
	}
	
	//マスに入ってるマークを取得
	public String getMark() {
		return mark;
	}
}
