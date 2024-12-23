package work4;

//阿文很喜歡簽大樂透(1~49),但他是個善變的人,上次討厭數字是4,
//但這次他想要依心情決定討厭哪個數字,請您設計一隻程式,
//讓阿文可以輸入他不想要的數字(1~9),畫面會顯示他可以選擇的號碼與總數,如圖:
//(提示:Scanner)
//(進階挑戰:輸入不要的數字後,直接亂數印出6個號碼且不得重複)
import java.util.Scanner;

public class work43 {
	public static void main(String[] args) {
		Scanner num = new Scanner(System.in);
		int number = num.nextInt();
		for (int i = 1; i <= 49; i++) {
			if (i != number && i % 10 != number) {
				System.out.println(i);
			}
		}

	}

}
