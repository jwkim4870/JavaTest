package Third;

import java.util.Scanner;

public class one {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("반지름을 입력하세요 : ");
		int a = sc.nextInt();
		
		Circle a1 = new Circle();
		System.out.println( "원의 면적 : " + a1.Area(a) );
		
		Circle2 b1 = new Circle2();
		System.out.println( "원의 둘레 : " + b1.Doole(a) );
		
	}
}

class Circle {
	public double Area (int r) {
		double area = r * r * 3.14;
		return area;
	}
}

class Circle2 {
	public double Doole (int r) {
		double doole = r * 2 * 3.14;
		return doole;
	}
}