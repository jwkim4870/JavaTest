package First;

import java.util.Scanner;

public class one {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력하세요 : ");
		int a = sc.nextInt();
		if(a < 0) {
			System.out.println(a + "=> 음수");
		} else if(a > 0) {
			System.out.println(a + "=> 양수");
		}
	}

}
