package practice;
//題目:
//請從1~49，每次執行就有六個不重複的數字

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Collectionprcatice {
	public static <E> void main(String args[]) {
        //我這裡對set的用法搞錯了!!
		//把1~49放進去
		//也可以用HashSet set = new HashSet();
		Set<E> set = new HashSet();
		for(int i=1 ; i<50 ; i++) {
			set.add((E) new Integer(i));
		}
		
		//把東西印出來看看
		System.out.println("元素個數:"+set.size());
		System.out.println("元素內容:"+set);
		
		//把東西一次取六個出來
		Iterator objs = set.iterator();
		for(int i=1 ; i<7 ; i++) {
			while(objs.hasNext()) {
				System.out.println(objs.next());
			}
		}
		
	}

}
