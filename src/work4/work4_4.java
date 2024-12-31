package work4;

//阿文上班時忘了帶錢包,想要向同事借錢,和他交情比較好的同事共有 5 個,
//其員工編號與身上現金列表如下:
//請設計一個程式,可以讓小華輸入欲借的金額後,便會顯示哪些員工編號的同事
//有錢可借他;並且統計有錢可借的總人數:
//例如輸入 1000 就顯示「有錢可借的員工編號: 25 19 27 共 3 人!」
//(提示:Scanner,二維陣列)
import java.util.Scanner;

public class work4_4 {
	public static void main(String[] args) {
//		要先想怎麼將上述的資料轉換成程式語言，因為排序剛好一樣>>二維陣列
//		然後要import Scanner輸入值，需要迴圈跟判斷式做篩選，最後計算出符合的選項
		int count = 0;
		int colleague[][] = { { 25, 32, 8, 19, 27 }, { 2500, 800, 500, 1000, 1200 } };
		System.out.println("請輸入欲借的金額:");
		Scanner input = new Scanner(System.in);
		int money = input.nextInt();
		for (int j = 0; j < 5; j++) {
			if (money <= colleague[1][j]) {
				System.out.println(colleague[0][j] + "號同事可以借錢");
				count += 1;
			} else if (money > 2500) {
				System.out.println("沒人能借你錢了QQ");
				break;
			}
		}
		System.out.println("共有" + count + "人能借你錢");
		input.close();
	}

}
