package work6;

import java.util.Scanner;
//提醒自己這題的幾個重要概念:
//1.如果要一直算到有正確答案，可以結合迴圈、布林值設定。while不會限制次數
//2.throw new CalException可以放在任何地方，包含執行區或者方法區
//3.Scanner可以有不同的輸入型別，輸入進來後還可以再用別的方法轉成別的型別
//4.字串與數字之間的轉換>>Integer.parseInt();，字串轉數字int!!!
//>>基本上就是輸入的值拿去做運算，錯誤就報錯誤的訊息。
//  不過礙於程式運作的邏輯，要小心思考每個throw new CalException的放置位置。

public class CalTest {
	public static void main(String[] args) {
		Calculator calculator = new Calculator();
		Scanner input = new Scanner(System.in);
		boolean again = true;
//		用迴圈讓錯誤的可以重投來過，正確的就可以停止
		while(again) {
			try {
//				將x的值先輸成String，並檢查是否為數值，再轉回int進行運算
				System.out.println("請輸入X的值");
				String strx = input.next();
				if(!isNumber(strx)) {
					throw new CalException("輸入格式不正確");
				}
				int x = Integer.parseInt(strx);
//				將y的值先輸成String，並檢查是否為數值，再轉回int進行運算
				System.out.println("請輸入Y的值");
				String stry = input.next();
				if(!isNumber(stry)) {
					throw new CalException("輸入格式不正確");
				}
				int y = Integer.parseInt(stry);
				System.out.println(calculator.powerXY(x,y));
//				如果算數正常，就可以停止迴圈
				again = false;
			} catch (Exception e) {
				// TODO Auto-generated catch block
				System.out.println(e.getMessage());
//				e.printStackTrace(); 這個是點出詳細錯誤路徑的報錯
//				如果算數有不合宜的狀況，將要繼續迴圈
				again = true;
			}
		}
		input.close();
		
	}
	
	public static boolean isNumber(String str) {
		try {
			Integer.parseInt(str);
			return true;
		}catch(NumberFormatException e){
			return false;
		}
		
	}

}
