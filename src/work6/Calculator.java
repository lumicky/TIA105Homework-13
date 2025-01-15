package work6;

public class Calculator {

//	例外處理:powerXY方法如果出現例外事件，就會丟給CalException處理
	public double powerXY(int x,int y) throws CalException{
		 if(y<0) {
			throw new CalException("次方為負值，結果回傳不為整數");
		}else if (x==0&&y==0) {
			throw new CalException("0的0次方沒有意義");
		}
		return Math.pow(x, y);
	}
	
	
	


}
