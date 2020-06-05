package union;

import java.util.ArrayList;

public class Board {
	
	public int size = 3;
	private Cell[][] cells = new Cell[size][size];
	private ArrayList<WinLine> lines = new ArrayList<WinLine>();
	
	//コンストラクタ
	public Board() {
		for(int x = 0; x < size; x++) {
			for(int y = 0; y < size; y++) {
				Cell cell = new Cell(x, y);
				cells[x][y] = cell;
			}
		}
		createLine();
	}
	
	//8ライン作成
	public void createLine() {
		//横ライン
		for(int x=0;x<size;x++) {
			WinLine yokoline = new WinLine();
			for(int y=0;y<size;y++) {
				yokoline.addCell(cells[x][y]);
			}
			lines.add(yokoline);
		}
		//縦ライン
		for(int y=0;y<size;y++) {
			WinLine tateline = new WinLine();
			for(int x=0;x<size;x++) {
				tateline.addCell(cells[x][y]);
			}
			lines.add(tateline);
		}
		//斜め1ライン
		WinLine naname1line = new WinLine();
		for(int i=0;i<size;i++) {
			naname1line.addCell(cells[i][i]);
		}
		lines.add(naname1line);
		//斜め2ライン
		int y=size-1;
		WinLine naname2line = new WinLine();
		for(int x=0;x<size;x++) {
			naname2line.addCell(cells[x][y]);
			y--;	
		}
		lines.add(naname2line);
	}
	
	public Cell getCell(int x, int y) {
		return cells[x][y];
	}
	
	//盤面表示
	public void showBoard() {
		System.out.println("＿＿＿＿＿");
		System.out.println("|"+cells[0][0].getMark()+"|"+cells[0][1].getMark()+"|"+cells[0][2].getMark()+"|");
		System.out.println("＿＿＿＿＿");
		System.out.println("|"+cells[1][0].getMark()+"|"+cells[1][1].getMark()+"|"+cells[1][2].getMark()+"|");
		System.out.println("＿＿＿＿＿");
		System.out.println("|"+cells[2][0].getMark()+"|"+cells[2][1].getMark()+"|"+cells[2][2].getMark()+"|");
		System.out.println("＿＿＿＿＿");
	}
	
	//既にマークが置かれているかの確認
	public boolean checkCell(int x,int y) {
		if(cells[x][y].getMark() == " ") {
			return true;
		}else {
			return false;
		}
	}
	
	//勝敗つくか判定
	public boolean checkWinner() {
		boolean judge = true;
		for(WinLine line : lines) {
			judge = line.checkLine();
			if(judge == true) {
				break;
			}
		}
		return judge;
	}
	
	//盤が埋まっているかの確認
	public boolean checkFull() {
		for(int x=0;x<size;x++) {
			for(int y=0;y<size;y++) {
				if(cells[x][y].getMark() == " ") {
					return false;
				}
			}
		}
		return true;
	}
}

