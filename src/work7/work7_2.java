package work7;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

//請寫一隻程式,能夠亂數產生10個1~1000的整數,並寫入一個名為Data.txt的檔案裡 
//(請使用append功能讓每次執行結果都能被保存起來)

public class work7_2 {
	public static void main(String[] args) {
		FileOutputStream fo = null;
		BufferedOutputStream bo = null;
		PrintStream ps = null;
		int i;
		try {
			fo = new FileOutputStream("c:\\javawork\\Data.txt",true);
			bo = new BufferedOutputStream(fo);
			ps = new PrintStream(bo);
			for(int j=1 ; j<=10 ; j++) {
				i = (int)(Math.random()*1000)+1;
				ps.println(i+" ");
			}
			
		}catch (IOException e) {
			System.err.println(e);
		}finally {
			ps.close();
			try {
				bo.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				fo.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
				
		
	}

}
