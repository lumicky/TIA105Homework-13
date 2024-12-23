package work4;
//請設計一隻程式,會亂數產生一個0~9的數字,然後可以玩猜數字遊戲,
//猜錯會顯示錯誤訊息,猜對則顯示正確訊息,如圖示結果:
//(提示:Scanner,亂數方法,無窮迴圈)
//(進階功能:產生0~100亂數,每次猜就會提示你是大於還是小於正確答案)
import java.util.Scanner;
public class work42 {
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
		
		
		
	}	
	

}
