package work5;

//請設計一個方法為randAvg(),從10個 0~100(含100)的整數亂數中
//取平均值並印出這10個亂數與平均值,如圖:
public class work5_2 {
	
	public static void main(String[] args) {
		int count=0;
		System.out.println("本次亂數的結果:");
		for(int i=1 ; i<=10 ; i++) {
			int random = (int)(Math.random()*100);
			System.out.print(random+" ");
			count+=random;
		}
		ranAvg(count);
		System.out.println();
		System.out.println("本次亂數平均數值:"+ranAvg(count));
		
	}
	
	public static double ranAvg(int x) {
		return x/10.0;
	}

}
