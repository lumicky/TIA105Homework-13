package work4;
//有個一維陣列如下:
//{29, 100, 39, 41, 50, 8, 66, 77, 95, 15}
//請寫出一隻程式能輸出此陣列所有元素的平均值與大於平均值的元素
//(提示:陣列,length屬性)
public class work4_1 {
	public static void main(String[] args) {
//		先創立1.陣列2.空int(等等算數用)3.空陣列(等等放東西用)
		int num[] = {29, 100, 39, 41, 50, 8, 66, 77, 95, 15};
		int sum = 0;
		int bigElement[] = new int[9];
//		用迴圈將陣列數字加總，最後除10算平均值
		for(int i=0 ; i<10 ; i++) {
			sum+=num[i];
		}
		System.out.println("元素的平均值為:"+(sum/10));
//		3.用迴圈和判斷式篩選出想要的數值
//		4.並在迴圈中將數值加入進新陣列，並列印出來
		System.out.println("大於平均值的元素:");
		for(int i=0 ; i<10 ; i++) {
			if(num[i]>52) {
				bigElement[i]=num[i];
				System.out.print(+bigElement[i]+" ");
			}
		}
		
	

		
		
	}

}
