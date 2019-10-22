package Second;

import java.util.Scanner;

public class first {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("주민번호 뒷자리의 첫자리 수(성별)을 입력하세요 : ");
		int a = sc.nextInt();
		String gender;
		if(a == 1) {
			gender = "남자";
			System.out.println("성별구하기 : " + a + "=> " + gender);
		} else if(a == 2) {
			gender = "여자";
			System.out.println("성별구하기 : " + a + "=> " + gender);
		}
	}

}
