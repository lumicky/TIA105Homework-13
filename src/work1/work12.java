package work1;

public class work12 {
	public static void main(String[] args) {

		
//		請定義一個常數為3.1415(圓周率),並計算半徑為5的圓面積與圓周長
//		回答:圓周長31.415000000000003，圓面積78.53750000000001
		double num = 3.1415;
		int radius = 5;
//		//圓周長計算
		double perimeter = radius*2*num;
		System.out.println(perimeter);
		//圓面積計算
		double area = radius*radius*num;
		System.out.println(area);
//		
//		某人在銀行存入150萬,銀行利率為2%,如果每年利息都繼續存入銀行,
//		請用程式計算10年後,本金加利息共有多少錢 
//		複利公式本金 × (1 + 年利率) ^ 期間
		double begin = 1500000;
		double interestRate = 0.02;
		int time = 10;
		double interest = (1+interestRate); 
		double totalInterest = Math.pow(interest, time); //乘10的次方
		System.out.println(totalInterest);
		double total = begin*totalInterest; //最後乘上本金
		System.out.println(total);
//		
//		請寫一隻程式,利用System.out.println()印出以下三個運算式結果:
//		5 + 5
//		5 + ‘5’
//		5 + “5”
//		並請用註解各別說明答案的產生原因
		int number1 = 5;
		char number2 = '5';
		System.out.println(number1+number1); //相加的結果=10
		System.out.println(number1+number2); //字元經過轉譯後會變成unicode的字
		                                     //剛好'5'>53，5+53=58
		System.out.println(number1+"5");     //變成字串相加=55
		System.out.println(number2); 
	
		
	}
}
