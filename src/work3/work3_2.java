package work3;
//請設計一隻程式,會亂數產生一個0~9的數字,然後可以玩猜數字遊戲,
import java.util.Scanner;

public class work3_2 {
	public static void main(String[] args) {
		Scanner number = new Scanner(System.in);
		int r = (int)(Math.random()*10);
		int input;
		for(int i=1;i<=10;i++){
			input = number.nextInt();
			if(input != r) {
				System.out.print("猜錯了");
			}else {
				System.out.print("答對了!答案就是"+input);
			}
		}
		
		number.close();
		
	}	

}
