package work4;

//班上有8位同學,他們進行了6次考試結果如下:
//請算出每位同學考最高分的次數
//(提示:二維陣列)
public class work4_6 {
	public static void main(String[] args) {
		int test[][] = { { 0, 0, 0, 0, 0, 0, 0, 0 }, { 10, 35, 40, 100, 90, 85, 75, 70 },
				{ 37, 75, 77, 89, 64, 75, 70, 95 }, { 100, 70, 79, 90, 75, 70, 79, 90 },
				{ 77, 95, 70, 89, 60, 75, 85, 89 }, { 98, 70, 89, 90, 75, 90, 89, 90 },
				{ 90, 80, 100, 75, 50, 20, 99, 75 } };
		
		 

//		找到當次考試中的最高分是幾分，並放入陣列中		
		for (int j = 1; j < 7; j++) {
			int count = 0;
			int maxIndex = 0;
			for (int i = 0; i < 8; i++) {
				if (count < test[j][i]) {
					count = test[j][i];
//					我就差在這裡!!一直用i!!結果應該要自己設一個變數暫存!!!
					maxIndex = i; 

				} 
			}
//			趕快把找出來的最大值位置加入陣列中
			test[0][maxIndex]++;
		}
		
		for(int k=0 ; k<8 ; k++) {
			System.out.println((k+1)+"號同學拿了"+test[0][k]+"次高分");
		}
		

		
		


	}

}
