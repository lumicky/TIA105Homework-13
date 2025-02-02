package work8;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;

//• 請設計一個Train類別,並包含以下屬性:
//- 班次 number,型別為int - 車種 type,型別為String - 出發地 start,型別為String- 目的地 dest,型別為String - 票價 price,型別為double
//• 設計對應的getter/setter方法,並在main方法裡透過建構子產生以下7個Train的物件,放到每小題需使用的集合裡
//- (202, "普悠瑪", "樹林", "花蓮", 400)
//- (1254, "區間", "屏東", "基隆", 700)*重複
//- (118, "自強", "高雄", "台北", 500)
//- (1288, "區間", "新竹", "基隆", 400)
//- (122, "自強", "台中", "花蓮", 600)
//- (1222, "區間", "樹林", "七堵", 300)
//- (1254, "區間", "屏東", "基隆", 700)*重複

//• (1)請寫一隻程式,能印出不重複的Train物件
//• (2)請寫一隻程式,讓Train物件印出時,能以班次編號由大到小印出
//• (3)承上,不僅能讓班次編號由大排到小印出, 還可以不重複印出Train物件
//• (以上三題請根據使用的集合,練習各種取值寫法,如迭代器、for迴圈或foreach等)

public class work8_2 {
	public static void main(String[] args) {
		System.out.println("(1)請寫一隻程式,能印出不重複的Train物件");
		System.out.println("**使用HashSet，因為train2跟train7重複，所以只會印出六個物件");
		Train train1 = new Train(202, "普悠瑪", "樹林", "花蓮", 400);
		Train train2 = new Train(1254, "區間", "屏東", "基隆", 700);
		Train train3 = new Train(118, "自強", "高雄", "台北", 500);
		Train train4 = new Train(1288, "區間", "新竹", "基隆", 400);
		Train train5 = new Train(122, "自強", "台中", "花蓮", 600);
		Train train6 = new Train(1222, "區間", "樹林", "七堵", 300);
		Train train7 = new Train(1254, "區間", "屏東", "基隆", 700);

		Collection<Object> collection = new HashSet();
		collection.add(train1);
		collection.add(train2);
		collection.add(train3);
		collection.add(train4);
		collection.add(train5);
		collection.add(train6);
		collection.add(train7);

		Iterator itr = collection.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

		System.out.println("--------------------------------------");
		System.out.println("(2)請寫一隻程式,讓Train物件印出時,能以班次編號由大到小印出");
		System.out.println("**因為改用ArrayList，允許重複，所以會印出七個車號");
		// 繼承關係的方法會繼承自"父類別"，所以這裡要用List(有順序)而非Collection
		List<Train> collection2 = new ArrayList();
		collection2.add(train1);
		collection2.add(train2);
		collection2.add(train3);
		collection2.add(train4);
		collection2.add(train5);
		collection2.add(train6);
		collection2.add(train7);
		Collections.sort(collection2);

		// ArrayList要用get(i)的方式取值而不是collection2[i]，並且開頭的index=0!!
		for (int i = 0; i < collection2.size(); i++) {
			System.out.println(collection2.get(i).getNumber());
		}

//		for(Train train : collection2) {
//			System.out.println(train.getNumber());
//		}

		System.out.println("--------------------------------------");
		System.out.println("(3)承上,不僅能讓班次編號由大排到小印出, 還可以不重複印出Train物件");
		System.out.println("**改用TreeSet介面，既不允許重複，又有排序的特性");

		TreeSet<Train> collection3 = new TreeSet();
		collection3.add(train1);
		collection3.add(train2);
		collection3.add(train3);
		collection3.add(train4);
		collection3.add(train5);
		collection3.add(train6);
		collection3.add(train7);
		// 因為TreeSet沒有index，所以只能用foreach的方式將內容取出來(無法用傳統for迴圈就是了!!)
		for (Train train : collection3) {
			System.out.println(train.getNumber());
		}

	}

}
