package Second;

import java.util.Scanner;

public class four {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("년도를 입력하세요 : ");
		int year = sc.nextInt();
		if(year % 4 == 0) {
			System.out.println("윤년여부 : " + year + "=>윤년");	
		} else if(year % 4 != 0) {
			System.out.println("윤년여부 : " + year + "=>No윤년");	
		}
		
	}

}
