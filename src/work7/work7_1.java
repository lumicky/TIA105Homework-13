package work7;



import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

//請寫一個程式讀取這個Sample.txt檔案,並輸出以下訊息:
//Sample.txt檔案共有
//(1) xxx個位元組 >檔案的總大小? 以位元組(Byte)為單位
//    >>length()
//(2) yyy個字元 >檔案的總字元數? 字數有多少啦!! read()方法回傳為int型別，結束為-1
//    >>read()
//(3) zzz列資料 >檔案裡有幾行文字? readLine()方法回傳為String型別，結束為null，只能用於 BufferedReader
//    >readLine()
//檢討:
//因為在讀取資料需要考慮到"游標位置"，當read讀完整個檔案文字時，游標已經再最後面的因此readLine無法再繼續讀取，除非重開BufferedReader
//若不要重開，就要想辦法一次解決。可以先讀Line，然後順便讀Line中的內容。File.length()跟String.length()意思不一樣!!

public class work7_1 {
	public static void main(String[] arg)  {
		FileInputStream fis = null;		
		InputStreamReader isr = null;
		BufferedReader bis = null;
		
			//(1) xxx個位元組 >檔案的總大小? 以位元組(Byte)為單位
			File file = new File ("c:\\javawork\\Sample.txt");
			long a = file.length();
			System.out.println("(1)檔案中有" + a + " 個Byte"); //檔案中有1426 個Byte
			
			try {			
				fis = new FileInputStream(file);
				isr = new InputStreamReader(fis);
				bis = new BufferedReader(isr);		
				
				String line;
				int lineCount=0;
				int charCount=0;
				while((line = bis.readLine()) != null) {
					//(3) zzz列資料 >檔案裡有幾行文字? 
					lineCount+=1;
					//(2) yyy個字元 >檔案的總字元數? 
					charCount+=line.length();
				}
				System.out.println("(2)檔案中有"+charCount+"個字元"); 
				System.out.println("(3)檔案中有"+lineCount+"行文字"); 
				
		
			} catch (IOException e) {
				//跟IO相關的Exception都
				e.printStackTrace();
			} finally {
				//把連結都關起來
				try {
					bis.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				try {
					isr.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				try {
					fis.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
			

				
			
		
	}
}
