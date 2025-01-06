package work5;

public class MyRectangle {
	double width;
	double depth;
	
//	傳入的兩個引數會指定給對應的屬性
	public MyRectangle(double width, double depth) {
		this.width=width;
		this.depth=depth;
	}
	
//	不帶參數也無內容的建構子
	public MyRectangle() {
		this(10,20);
	}
	

//	將收到的引數指定給width屬性
	void setWidth(double width) {
		this.width=width;
	}
	
//	將收到的引數指定給depth屬性
	void setDepth(double depth) {
		this.depth=depth;
	}
	
//	能計算該長方形的面積
	double getArea() {
		return width*depth;
	}
	

	
	
}
