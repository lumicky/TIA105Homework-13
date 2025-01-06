package work5;

public class MyRectanglemain {
	public static void main(String[] args) {
		
//		(1) 使用public MyRectangle()建構子建立物件,
//		設定width, depth為10, 20,透過getArea()印出結果
		MyRectangle r2 = new MyRectangle();
		System.out.println("r2長方形面積為:"+r2.getArea());
		
//		(2) 使用public MyRectangle(double width, double depth)建構子建立物件,
//		設定width, depth為10, 20,透過getArea()印出結果
		MyRectangle r1 = new MyRectangle(10,20);
		System.out.println("r1長方形面積為:"+r1.getArea());
	}
	
	

}
