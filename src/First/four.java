package First;

import java.util.Scanner;

public class four {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("실수 2개를 입력하세요 : ");
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		double small;
		if(a > b) {
			small = b;
			System.out.println("더 작은 수 : " + a + ", " + b + "=>" + small);
		} else if(a < b) {
			small = a;
			System.out.println("더 작은 수 : " + a + ", " + b + "=>" + small);
		}
	}

}
