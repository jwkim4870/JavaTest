package Four;

import java.util.Scanner;

public class one {
/*
 1. 키보드로 정수를 입력 받아서,  그 값이 홀수인지, 짝수인지 판별하여 출력해보기
 1) 삼항 연산자, %연산자 이용
 2) if 이용*/
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		if(a % 2 == 0) {
			System.out.print("짝수");
		} else {
			System.out.print("홀수");
		}
	}

}
