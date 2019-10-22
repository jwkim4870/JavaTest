package First;

import java.util.Scanner;

public class two {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("실수 2개를 입력하세요 : ");
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		System.out.println("두 수의 곱 : " + a*b);
	}

}
