package work8;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

//請建立一個Collection物件並將以下資料加入:
//Integer(100)、Double(3.14)、Long(21L)、Short(“100”)、Double(5.1)、“Kitty”、
//Integer(100)、Object物件、“Snoopy”、BigInteger(“1000”)

//• 印出這個物件裡的所有元素(使用Iterator, 傳統for與foreach)
//• 移除不是java.lang.Number相關的物件
//• 再次印出這個集合物件的所有元素,觀察是否已將非Number相關的物件移除成功

public class work8_1 {
	public static void main(String[] args) {
		Collection<Object> collection = new ArrayList<>();
        
		//先將內容都放進集合中
		// 就不用再人工轉型了，java會幫忙自動轉型
		collection.add(100);
		collection.add(3.14);
		collection.add(21L);
		collection.add("100");
		collection.add(5.1);
		collection.add("Kitty");
		collection.add(100);
		collection.add(new Object());
		collection.add("Snoopy");
		collection.add("1000");

		System.out.println("(1)印出集合中的所有元素");
		System.out.println("<使用Iterator>");
		Iterator<Object> iterator = collection.iterator();
		while (iterator.hasNext()) {
			System.out.print(iterator.next() + " ");
		}

		System.out.println("\n");
		System.out.println("<使用傳統的foreach>");
		for (Object obj : collection) {
			System.out.print(obj + " ");
		}

		System.out.println("\n");
		System.out.println("-----------------------");
		System.out.println("(2)移除不是java.lang.Number相關的物件");
//		這樣寫不對!因為collection是集合，它永遠不會是Number，要比就要元素內容相比較
//		if (!(collection instanceof Number)) {
//			collection2.add(collection);
//		}
		System.out.println("<使用Iterator>");
		Iterator iterator2 = collection.iterator();
		while (iterator2.hasNext()) {
			Object obj = iterator2.next();
			//重點:用instanceof預先將Number類別的內容排出
			if(!(obj instanceof Number)) {
				System.out.print(obj + " ");
			}
		}
		System.out.println("\n");
		System.out.println("<使用傳統的foreach>");
		for(Object obj : collection) {
			//重點:用instanceof預先將Number類別的內容排出
			if(!(obj instanceof Number)) {
				System.out.print(obj + " ");
			}
		}
		

		
		
		
		
	}

}
