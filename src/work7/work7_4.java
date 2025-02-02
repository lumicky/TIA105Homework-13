package work7;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

//【重要觀念-序列化】
//(第一題)
//請寫一支程式,利用老師提供的Dog與Cat類別分別產生兩個物件,寫到C:\data\Object.ser裡。
//注意物件寫入需注意的事項,若C:\內沒有data資料夾,請用程式新增這個資料夾
//(第二題)
//承上題,請寫一個程式,能讀取Object.ser這四個物件,並執行speak()方法觀察結果如何 (請利用多型簡化本題的程式設計)

public class work7_4 {
//	(1)先將要序列化的類別實作Serializable介面

	public static void main(String[] args) {
		// (2)確認資料夾、ser檔案都有準備好
		File folder = null;
		File file = null;
		try {
			folder = new File("c:\\data");
			file = new File("c:\\data\\Object.ser");
			
			if (!folder.exists()) {
				folder.mkdir();
				System.out.println("資料夾成功建立");
			} else {
				System.out.println("資料夾已存在");
			}
			
			if (!file.exists()) {
				file.createNewFile();
				System.out.println("檔案成功建立");
			} else {
				System.out.println("檔案已存在");
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}

		// (3)將創立的物件放入陣列中
		Dog[] dog = new Dog[2];
		dog[0] = new Dog("woow");
		dog[1] = new Dog("woof");

		Cat[] cat = new Cat[2];
		cat[0] = new Cat("meoow");
		cat[1] = new Cat("meaaa");

		// (4)輸出
		FileOutputStream fos = null;
		ObjectOutputStream oos = null;
		try {
			// 建好輸出的管路
			fos = new FileOutputStream(file);
			oos = new ObjectOutputStream(fos);
			// 用迴圈的方式將陣列中的物件傳送到ser檔案中"永久儲存"
			for (int i = 0; i < 2; i++) {
				oos.writeObject(dog[i]);
				oos.writeObject(cat[i]);
			}
			System.out.println("成功將內容放入ser檔案");
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			// 將連結通道關閉
			try {
				oos.close();
				fos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

		// (5)輸入
		FileInputStream fis = null;
		ObjectInputStream ois = null;
		try {
			//先建立好通道
			fis = new FileInputStream("c:\\data\\Object.ser");
			ois = new ObjectInputStream(fis);
			
//			關於while(true)「無限迴圈」。
//			迴圈的結束條件不寫在 while 裡面，而是交由 try-catch 來處理。
//			當檔案讀取完畢時，ois.readObject() 會丟出 EOFException（End of File Exception）。
//			這時候 catch (EOFException e) 會捕捉例外，執行 System.out.println("閱讀結束");，然後程式才會結束。
			try {
				while (true) {
					Object obj = ois.readObject();
					if (obj instanceof Dog) {
						((Dog) obj).speak();
					} else if (obj instanceof Cat) {
						((Cat) obj).speak();
					}
				}
			//簡單來說EOFException這個例外本身就是有可以讓迴圈停止功能啦!! 才可以這樣寫
			} catch (EOFException e) {
				System.out.println("閱讀結束");

			}

		} catch (ClassNotFoundException | IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (ois != null) {
					ois.close();
				}
				if (fis != null) {
					fis.close();
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

	}
}
