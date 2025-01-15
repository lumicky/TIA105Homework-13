package practice;


public class CubeTest {
	
	public static void main(String[] args) {
		
		try {
			Cube test = new Cube();
			test.setter(10);
			System.out.println(test.getVolume());
		} catch (CubeException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		
		
		
		
	}

}
