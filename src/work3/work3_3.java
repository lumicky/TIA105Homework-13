package work3;

import java.util.Scanner;

//阿文很喜歡簽大樂透(1~49),但他是個善變的人,上次討厭數字是4,
public class work3_3 {
	public static void main(String[] args) {
		Scanner num = new Scanner(System.in);
		int number = num.nextInt();
		for (int i = 1; i <= 49; i++) {
			if (i != number && i % 10 != number) {
				System.out.println(i);
			}
		}

	}

}
