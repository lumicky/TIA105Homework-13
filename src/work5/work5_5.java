package work5;

//身為程式設計師的你,收到一個任務,要幫系統的註冊新增驗證碼的功能,請設計一個方法
//genAuthCode(),當呼叫此方法時,會回傳一個8位數的驗證碼,此驗證碼內容包含了英文大小寫
//與數字的亂數組合,如圖:

public class work5_5 {	
	
	public static String genAuthCode(int x) {
		//(1)創立一個空的變數
		String key = "";
		//(2)創立一個放各種元素的陣列
		String charpool = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
		char[] element = charpool.toCharArray();
		//(3)使用迴圈，把陣列內的元素一個個加進空變數
		for(int i=0 ; i<x ; i++) {
			int index= (int)(Math.random()*element.length);
			key+=element[index];
		}
		return key;
	}
	
	public static void main(String[] args) {
		//(4)呼叫方法印出8位數驗證碼
		System.out.print(genAuthCode(8));
		
	}
	
}
