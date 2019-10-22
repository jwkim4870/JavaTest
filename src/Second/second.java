package Second;

import java.util.Scanner;

public class second {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("반복횟수를 입력하세요 : ");
		int a = sc.nextInt();
		for(int i = 0; i < a; i++) {
			System.out.println("열심히 공부합시다");
		}
	}

}
