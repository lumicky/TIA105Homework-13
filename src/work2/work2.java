package work2;
public class work2 {
	public static void main(String[] args) {
//		請設計一隻Java程式,計算1~1000的偶數和 (2+4+6+8+...+1000)	
//		答案為:250500
//		int sum = 0;
//		int num;
//		for (num = 1; num <= 1000; num++) {
//			if (num % 2 == 0) {
//	     	sum += num;
//			}
//		}
//		System.out.println(sum);
		
//		請設計一隻Java程式,計算1~10的連乘積 (1*2*3*...*10) (用for迴圈)
//		答案為:3628800
//		int sum2 = 1;
//		int num2 = 1;
//		for(num2=1 ; num2<=10 ; num2++) {
//			sum2=sum2*num2;
//		}
//		System.out.print(sum2);
		
//		請設計一隻Java程式,計算1~10的連乘積 (1*2*3*...*10) (用while迴圈)	
//		真有趣，如果用while，因為在迴圈裡面才+1，如果設定還是num3<=10，就會多乘到11
//		int sum3 = 1;
//		int num3 = 1;
//		while(num3<=9) {
//			num3++;
//			sum3=sum3*num3;
//		}
//		System.out.println(sum3);
		
//		請設計一隻Java程式,輸出結果為以下:
//		1 4 9 16 25 36 49 64 81 100
//		int count;
//		int num4 = 0;
//		for(count=1 ; count<=19 ; count+=2) {
//			num4+=count;
//			System.out.print(num4);
//			System.out.print(" ");
//		}
		
//		阿文很熱衷大樂透 (1 ~ 49),但他不喜歡有4的數字,不論是個位數或是十位數。
//		請設計一隻程式，輸出結果為阿文可以選擇的數字有哪些? 總共有幾個?
		int count2 = 0;
		int i;
		for (i = 1; i <= 49; i++) {
			if (i % 10 != 4 && i != 4) {
				System.out.print(i + " ");
				count2++;
			}
		}
		System.out.print("總共有" + count2 + "個");
		
//		
		
		
		
		
		
		
		
		
	}
}
