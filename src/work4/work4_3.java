package work4;

//有個字串陣列如下 (八大行星):
//{“mercury”, “venus”, “earth”, “mars”, 
//	“jupiter”, “saturn”, “uranus”, “neptune”}
//請用程式計算出這陣列裡面共有多少個母音(a, e, i, o, u)
//(提示:字元比對,String方法)
//方法 >> indexOf()或是lastIndexOf()
public class work4_3 {
	public static void main(String[] args) {
//		我的想法是用巢狀迴圈把陣列，跟陣列裡的字元都跑過，並且透過if判斷式跟count+=1來算有幾個母音
//		要小心的是算字元的迴圈判斷，因為每個字的"字元數"不同，不能設"固定的條件判斷"，而是拿"字元數"當判斷
		int count = 0;
		String world[] = { "mercury", "venus", "earth", "mar", "jupiter", "saturn", "uranus", "neptune" };
		for (int i = 0; i < 8; i++) {
			for (int j = 0; j < world[i].length(); j++) {
				String planet = world[i];
				char letter = planet.charAt(j);
				if (vowel(letter)) {
					count += 1;
				}
			}
		}
		System.out.println("母音總共有:" + count);

	}
//	  本來判斷母音的地方又臭又長，用方法簡化後好看多了!!
//	  要小心方法要用static，因為main方法是static不然main會吃不到外面的方法
//	  以下這串本來是放在上面的main程式碼中喔:
//	  if (letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u') {
//		count += 1;
//	  }
	public static boolean vowel(char letter) {
		return letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u';
	}

}
