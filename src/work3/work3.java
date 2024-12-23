package work3;
//請分別建立x, y, z三個3x3的int陣列，然後把x和y陣列的加總存放到z陣列裡，
//再將結果顯示於螢幕上
//• x和y陣列中的數字：
//• 請用亂數產生介於0～30之間的整數
//• 亂數之取得可參考java.lang.Math的靜態方法random()
//• public static double random()。傳回亂數值其範圍為0.0～1.0
public class work3 {
	public static void main(String[] args) {
//		1.建立3個3*3的二維陣列
		int x [][] = new int[3][3];
		int y [][] = new int[3][3];
		int z [][] = new int[3][3];
//		2.將隨機亂數填入到x、y陣列
		for(int i=0 ; i<=2 ; i++) {
			for(int j=0 ; j<=2 ; j++) {
				x[i][j] = (int)(Math.random()*31);
				y[i][j] = (int)(Math.random()*31);
			}
		}
//		3.將x,y對應位置的元素加總後置入到z陣列對應位置
		for(int i=0 ; i<=2 ; i++) {
			for(int j=0 ; j<=2 ; j++) {
				z[i][j] = x[i][j]+y[i][j];
			}
		}
		
//		4.三個陣列元素列印出來
		for(int i=0 ; i<=2 ; i++) {
			for(int j=0 ; j<=2 ; j++) {
				System.out.print(x[i][j]+"\t");
			}
			System.out.println();
		}
		System.out.println("-----------------------");
		for(int i=0 ; i<=2 ; i++) {
			for(int j=0 ; j<=2 ; j++) {
				System.out.print(y[i][j]+"\t");
			}
			System.out.println();
		}
		System.out.println("-----------------------");
		for(int i=0 ; i<=2 ; i++) {
			for(int j=0 ; j<=2 ; j++) {
				System.out.print(z[i][j]+"\t");
			}
			System.out.println();
		}
		System.out.println("-----------------------");
		
		
	}
	

}
