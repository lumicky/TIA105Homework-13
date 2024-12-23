package work4;

//請設計一隻程式,使用者輸入三個數字後,輸出結果會為正三角形、等腰
//三角形、其它三角形或不是三角形,如圖示結果:
//(提示:Scanner,三角形成立條件,判斷式if else)
//(進階功能:加入直角三角形的判斷)

//平方的API，Math.pow(3,3);

//      要先使用API方便輸入值
import java.util.Scanner;

public class work41 {
	static public void main(String[] args) {
		System.out.println("請輸出三個正整數");
//		將API物件化後，使用方法並將方法的回傳值存到三個變數當中(a.b.c)
		Scanner input = new Scanner(System.in);
		int a = input.nextInt();
		int b = input.nextInt();
		int c = input.nextInt();
//		開始用判斷式來判斷邊長之間的關係，來區分是哪種三角形
		if (a == b && b == c && c == a) {
			System.out.println("正三角形");
		} else if (rightTriangle(a, b, c)) {
			System.out.println("直角三角形");
		}else if (a == b || a == c || c == b) {
			System.out.println("等腰三角形");
		} else if (a != 0 && b != 0 && c != 0) {
			System.out.println("其他三角形");
		}  else {
			System.out.println("不是三角形");
		}

	}
	
//	直角三角形題目:
//	判斷公式為a2 + b2 = c2，可以用平方的API計算，但因為放在判斷式太攏長
//	需要自己額外創一個方法!再回傳布林值給判斷式跑流程
//	方法有兩個可以使用的(1)用判斷式return布林值 (2)直接return布林值(利用||邏輯運算子)
//	**小心方法要創在main方法之外!!我直接忘記==

//	public static boolean rightTriangle(int a, int b, int c) {
//		if (Math.pow(a, 2) + Math.pow(b, 2) == Math.pow(c, 2)) {
//			return true;
//		} else if (Math.pow(a, 2) + Math.pow(c, 2) == Math.pow(b, 2)) {
//			return true;
//		} else if (Math.pow(b, 2) + Math.pow(c, 2) == Math.pow(a, 2)) {
//			return true;
//		} else {
//			return false;
//		}
//     }
	
	public static boolean rightTriangle(int a,int b,int c) {
		return Math.pow(a, 2) + Math.pow(b, 2) == Math.pow(c, 2)||
			   Math.pow(a, 2) + Math.pow(c, 2) == Math.pow(b, 2)||
			   Math.pow(b, 2) + Math.pow(c, 2) == Math.pow(a, 2);
	}
		
		
	

	
}
