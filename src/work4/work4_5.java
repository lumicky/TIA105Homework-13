package work4;

//請設計由鍵盤輸入三個整數,分別代表西元yyyy年,mm月,dd日,
//執行後會顯示是該年的第幾天
//例:輸入 1984 9 8 三個號碼後,程式會顯示「輸入的日期為該年第252天」
//(提示1:Scanner,陣列)
//(提示2:需將閏年條件加入)
//(提示3:擋下錯誤輸入:例如月份輸入為2,則日期不該超過29)
import java.util.Scanner;

public class work4_5 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
//		月份跟天數:直接用陣列裝進去，因為二月來要算，先空著
//		好好笑我本來打算用判斷式決定月份的天數，但效率實在太差了!!
		int[][] time = { 
				{ 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12 }, 
				{ 31, 0, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 } 
		};
		System.out.print("請輸入西元:");
		int year = input.nextInt();
		System.out.print("請輸入月份:");
		int month = input.nextInt();
		System.out.print("請輸入日期:");
		int day = input.nextInt();
		int february;
		int timeCount = 0;


//		(1)算閏年:若年可被4整除就是，但若可被100整除，同時也要可以被400整除才行!!
		if (year % 100 == 0) {
			if (year % 400 == 0) {
				february = 29;
			} else {
				february = 28;
			}
		} else {
			if (year % 4 == 0) {
				february = 29;
			} else {
				february = 28;
			}
		}
//		(2)加上二月的部分:因為牽涉到閏年，所以分開算
		time[1][1]=february;
		
//		此處為檔下錯誤的區域
//		================================
		if (year <= 0) {
			System.out.println("年份輸入錯誤");
			input.close();
			return;
		}
		if (month < 1 || month > 12) {
			System.out.println("月份輸入錯誤");
			input.close();
			return;
		}
		if (day < 1 || day > time[1][month - 1]) {
			System.out.print("日期輸入錯誤!!");
			input.close();
			return;
		}
		
//		(3)算月份:將每個月份用迴圈累加起來
		for (int i = 0; i < (month - 1); i++) {
			timeCount += time[1][i];
		}
		
//		(4)天數:直接用累加的方式加上去
		timeCount += day;
		System.out.println("當天為該年的第" + timeCount + "天");
		
		input.close();

	}

}
