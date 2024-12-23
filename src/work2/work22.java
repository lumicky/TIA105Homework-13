package work2;
//請設計一隻Java程式,輸出結果為以下:
//1 2 3 4 5 6 7 8 9 10
//1 2 3 4 5 6 7 8 9
//1 2 3 4 5 6 7 8
//1 2 3 4 5 6 7
//1 2 3 4 5 6
//1 2 3 4 5
//1 2 3 4
//1 2 3
//1 2
//1
public class work22 {
	public static void main(String[] args) {
		
//		for(int i=1 ; i<=5 ; i++) {
//			for(int j=1 ; j<=i ; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		
		for(int count=0 ; count<=10 ; count++) {
			for(int num=1 ; num<=(10-count) ; num++) {
				System.out.print(num+" ");
			}
		System.out.println();
		}
		
		
		
		
		
		
		
		
		
		
	}	
}
