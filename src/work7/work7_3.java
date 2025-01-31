package work7;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;



//請從無到有試著完成一個方法名為copyFile,這個方法有兩個參數。
//呼叫此方法時,第一個參數所代表的檔案會複製到第二個參數代表的檔案
//【重要觀念-傳輸檔案的"單位轉換"】
//(1)要先取得A檔的資料到程式中
//(2)再將資料傳輸的B檔案中

public class work7_3 {
	
	public static void copyFile (String InputLocation,String OutputLocation) {
		FileInputStream fi = null;	
		InputStreamReader isr = null;
		BufferedReader br = null;
		
		FileOutputStream fo = null;
		OutputStreamWriter osw = null;
		BufferedWriter bw = null;
		
		try {
			//(1)打開兩邊檔案的傳輸管道
			fi = new FileInputStream(InputLocation);
			isr = new InputStreamReader(fi);
			br = new BufferedReader(isr);
			
			fo = new FileOutputStream(OutputLocation);
			osw = new OutputStreamWriter(fo);
			bw = new BufferedWriter(osw);
			
			
			//(2)創立每次運輸的位元量、int變數(判斷跟傳資料會用到)
		    char[] bag = new char[1024];
		    int bagContent;
		    
		    //(3)若讀取的資料未見底(顯示-1)，即將資料傳進另外一個檔案中，用while迴圈
		    while((bagContent = br.read(bag)) != -1) {
		    	bw.write(bag,0,bagContent);
		    }			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			//(4)記得用finally將連結關閉
			try {
				bw.close();
				osw.close();
				fo.close();
				
				br.close();
				isr.close();
				fi.close();
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.print("複製完成");
			
	}
	
	
	
	public static void main(String[] args) {
		copyFile("c:\\javawork\\A.txt","c:\\javawork\\B.txt");		
	}
	

}
