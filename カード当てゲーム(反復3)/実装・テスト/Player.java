package cardgameDX;

import java.util.Scanner;

public class Player {
	
	public Player(){}
	
	public int[] input() {
		int number;
		int suit;
		while(true){
			try {
			     System.out.println("数とスートを入力してください");
			     System.out.println("---");
			     System.out.println("* 入力例 : 数[半角スペース] スート");
			     System.out.println("【スートの入力】　0:スペード,1:ハート,2:ダイヤ,3:クラブ");
			     System.out.println("---");
			
			     Scanner scanner = new Scanner(System.in);
			     //int型でスキャン
			     number = scanner.nextInt();
			     suit = scanner.nextInt();
			     scanner.nextLine();
			     //正しい値か判定
			     if((number < 1 || number > 13) || (suit < 0 || suit > 3)) {
			    	 throw new Exception();
			     }
			     break;
		    }catch (Exception e) {
		    	//int型でない場合、範囲外の数値の場合
		    	System.out.println("数は1~13、スートは0~3の数字をつ入力してください");
		    	continue;
		    }
		}
			int[] card = new int[2];
			card[0] = number;
			card[1] = suit;
			return card;
}

	
	public int selectReferee() {
		
		int referee;
		
		//1が入力されたら厳しい審判を生成する
		//2が入力されたら優しい審判を生成する
		//それ以外が入力された場合はエラーを返す
		
		while(true) {
			try {
				System.out.println("審判を選んでください");
				System.out.println("---");
				System.out.println("* 入力例 ： 1:厳しい審判,2:優しい審判");
				Scanner scanner = new Scanner(System.in);
			     //int型でスキャン
			     referee = scanner.nextInt();
			     scanner.nextLine();
			     //正しい値か判断
			     if(referee < 1 || referee > 2) {
			    	 throw new Exception();
			     }
			     break;
			}catch (Exception e) {
				//int型でない場合、範囲外の数値の場合
				System.out.println("1か2を入力してください");
				continue;
			}
		}
		return referee;
	}
	
	public int selectMode() {
		
		int mode;
		
		//1が入力されたらGameのstart1()が実行される
		//2が入力されたらGameのstart1()が実行される
		//それ以外が入力された場合はエラーを返す
		
		while(true) {
			try {
				System.out.println("対戦モードを選択してください");
				System.out.println("---");
				System.out.println("* 入力例 ： 1:一人モード,2:2人対戦モード");
				Scanner scanner = new Scanner(System.in);
			     //int型でスキャン
			     mode = scanner.nextInt();
			     scanner.nextLine();
			     //正しい値か判断
			     if(mode < 1 || mode > 2) {
			    	 throw new Exception();
			     }
			     break;
			}catch (Exception e) {
				//int型でない場合、範囲外の数値の場合
				System.out.println("1か2を入力してください");
				continue;
			}
		}
		return mode;
	}
	
	public String inputBetting() {
		System.out.print("このゲームにかけるものを入力してください：");
		
		Scanner scanner = new Scanner(System.in);
		String kake = scanner.nextLine();
		
		return kake;
	}
	
	public String inputName() {
		System.out.print("あなたの名前を入力してください：");
		
		Scanner scanner = new Scanner(System.in);
		String name = scanner.nextLine();
		
		return name;
	}
}	

