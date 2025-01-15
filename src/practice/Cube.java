package practice;

public class Cube {
	private double length;
	
	public Cube() {
		
	}
	
//	可讓使用者設計的
	public Cube(double length) throws CubeException{
		setter(length);
//		if(length>0) {
//			this.length = length;
//		}else {
//			throw new CubeException("正方立體邊長不可為0或負數");
//		}
		
	};
	
	public double getter() {
		return length;
	}
	
//	可讓使用者設計的
	public void setter(double length) throws CubeException {
		if(length>0) {
			this.length = length;
		}else {
			throw new CubeException("正方立體邊長不可為0或負數");
		}
		
	}
	
	public double getVolume() {
		return length*length*length;
	}

}
