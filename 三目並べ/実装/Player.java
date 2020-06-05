package union;

import java.util.Scanner;

public class Player {
	
	public Player(){}
	//座標入力
	public int[] inputCell() {
		int x, y;
		
		while(true){
			try {
				System.out.println("列と行を半角スペースで区切って入力してください(例:2列目の3行目 ⇒ 2 3)");
				Scanner scanner = new Scanner(System.in);
				//int型でスキャン
				x = scanner.nextInt();
				y = scanner.nextInt();
				scanner.nextLine();
				//盤内か判定
				if((x < 1 || 3 < x) || (y < 1 || 3 < y)){
					throw new Exception();
				}
				break;
			}catch (Exception e) {
				//int型でない場合、盤内でない場合
				System.out.println("1~3の数字を2つ入力してください");
				continue;
			}
		}
		int [] Cell = new int[2];
		//-1は配列用変換
		Cell[0] = x-1;
		Cell[1] = y-1;
		return Cell;
	}
	
}
