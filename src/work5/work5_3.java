package work5;

//利用Overloading,設計兩個方法int maxElement(int x[][])與double maxElement(double x[][]),
//可以找出二維陣列的最大值並回傳,如圖:
public class work5_3 {

	
	public static int maxElement(int x[][]) {
		int num=0;
		for(int i=0 ; i<2 ; i++) {
			for(int j=0 ; j<3 ; j++) {
				if(num<x[i][j]) {
					num=x[i][j];
				}
			}
		}
		return num;
	}
	
	public static double maxElement(double x[][]) {
		double num=0;
		for(int i=0 ; i<2 ; i++) {
			for(int j=0 ; j<3 ; j++) {
				if(num<x[i][j]) {
					num=x[i][j];
				}
			}
		}
		return num;
	}
	
	public static void main(String[] args) {
		int[][] intArray = {
				{1,6,3},
				{9,5,2}
		};
		
		double[][] doubleArray = {
				{1.2,3.5,2.2},
				{7.4,2.1,8.2}
		};
		
		System.out.println("int陣列最大值:"+maxElement(intArray));
		System.out.println("double陣列最大值:"+maxElement(doubleArray));
		
		
	}

}
