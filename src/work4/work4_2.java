package work4;

//請建立一個字串,經過程式執行後,輸入結果是反過來的
//例如String s = “Hello World”,執行結果即為dlroW olleH
//(提示:String方法,陣列)

public class work4_2 {
	public static void main(String[] args) {
//		先創一個字串，並用.toCharArray();方法將該字串變成字元放入陣列中
		String holiday = "merry christmas";
		char[] num = holiday.toCharArray();
//		這個功能只是把string的每個字分開>>System.out.println(Arrays.toString(num));
		System.out.print("原本的文字:");
		System.out.println((num));
//		因為將字串變成字元了，因此陣列中的每個元素代表每個字元
//		就可以用迴圈點出元素的位置，把他們從尾到頭呼喚出來
//		小心迴圈的設計，本來寫成i<0，那迴圈就永遠不會跑了....
//		如果意思是希望i變負值迴圈停止，可以改成i>=0，這樣迴圈才能跑
		System.out.print("反轉後的文字:");
		for(int i=14 ; i>=0 ; i--) {
			System.out.print(num[i]);
		}
		
		
	}

}
