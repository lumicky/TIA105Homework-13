package practice;

public class practice_1 {
	public static void main(String[] args) {
//	1.建立3個3*3的二維陣列
	int x [][] = new int[3][3];
	int y [][] = new int[3][3];
	int z [][] = new int[3][3];
//	2.將隨機亂數填入到x、y陣列
	for(int i=0 ; i<=2 ; i++) {
		for(int j=0 ; j<=2 ; j++) {
			x[i][j] = (int)(Math.random()*31);
			y[i][j] = (int)(Math.random()*31);
		}
	}
//	3.將x,y對應位置的元素加總後置入到z陣列對應位置
	for(int i=0 ; i<=2 ; i++) {
		for(int j=0 ; j<=2 ; j++) {
			z[i][j] = x[i][j]+y[i][j];
		}
	}
	
//	4.三個陣列元素列印出來
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
