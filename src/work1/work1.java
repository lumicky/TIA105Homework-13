package work1;
public class work1 {
	public static void main(String[] args) {
////		第一題:計算12、6這兩個數值的和與積
////		回答:兩數和為18，兩數積為72
		int num1 = 12;
		int num2 = 6;
		int plus = num1+num2;
		System.out.println(plus); //兩數和為18
		int multiplication = num1*num2;
		System.out.println(multiplication); //兩數積為72
//		
////		第二題:計算200顆蛋共是幾打幾顆?(一打為12顆)
////		回答:共有16打蛋，剩下8顆蛋
		int eggs = 200;
		int dozen = 12;
		int basket = eggs/dozen;
		System.out.println(basket); //共有16打蛋
		int remain = eggs-(dozen*basket);
		System.out.println(remain); //剩下8顆蛋
		
//		第三題:算出256559秒為多少天?多少小時?多少分鐘?多少秒?
//		回答:兩天，23小時，15分鐘，59秒 
		int days = 256559/(60*60*24);
		System.out.println(days);   
		int hours = (256559/(60*60))-(days*24);
		System.out.println(hours);  
		int mins = (256559/(60))-(days*24*60)-(hours*60);
		System.out.println(mins);   
		int sec = (256559)-(days*24*60*60)-(hours*60*60)-(mins*60);
		System.out.println(sec);    
		
//		更精簡的算法
		int totalTime = 256559;
		int days2 = totalTime/(60*60*24);
		int hours2 = (totalTime%(60*60*24))/(60*60);
		int mins2 = (totalTime%(60*60))/(60);
		int sec2 = totalTime%60;
		System.out.println(days2);
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
