package work2;
//請設計一隻Java程式,輸出結果為以下:

//A
//BB
//CCC
//DDDD
//EEEEE
//FFFFFF

public class work23 {
	public static void main(String[] args) {
//		最一開始很圖法煉鋼的作法
//		int count = 0;
//		for (; count < 1; count++) {
//			System.out.print("A");
//		}
//		System.out.println();
//		for (; count < 3; count++) {
//			System.out.print("B");
//		}
//		System.out.println();
//		for (; count < 6; count++) {
//			System.out.print("C");
//		}
//		System.out.println();
//		for (; count < 10; count++) {
//			System.out.print("D");
//		}
//		System.out.println();
//		for (; count < 15; count++) {
//			System.out.print("E");
//		}
//		System.out.println();
//		for (; count < 21; count++) {
//			System.out.print("F");
//		}
//		System.out.println();
		
		
		
//		用字元去處理
		int count2=0;
		for(char letter='A' ; letter<='F' ; letter++) {
			for(int i=0 ; i<=count2 ; i++) {
				System.out.print(letter);
			}
			System.out.println();
			count2++;
		}
		
		
		
		
	}

}
