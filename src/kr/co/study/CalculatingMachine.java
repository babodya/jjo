package kr.co.study;

import java.util.Scanner;

public class CalculatingMachine {
	
	public static void main(String[] args) {

		int one = 0;
		int two = 0;
		int result = 0;
		int calc = 0;

		Scanner Scan = new Scanner(System.in);
		System.out.print("첫번째 숫자를 입력하세요");
		one = Scan.nextInt();
		
		while (one < 0) {	
			System.out.print("정수를 입력해주세요.");
			one = Scan.nextInt();
		}

		Scan = new Scanner(System.in);
		System.out.println("사칙연산자를 고르세요.");
		System.out.println("1. + (더하기)");
		System.out.println("2. - (빼기)");
		System.out.println("3. * (곱하기)");
		System.out.println("4. / (나누기)");
		calc = Scan.nextInt();
		
		while (calc < 1 || calc > 4) {
			System.out.println("사칙연산자를 보기에서 고르세요.");
			System.out.println("1. + (더하기)");
			System.out.println("2. - (빼기)");
			System.out.println("3. * (곱하기)");
			System.out.println("4. / (나누기)");
			calc = Scan.nextInt();
		}
		
		Scan = new Scanner(System.in);
		System.out.println("두번째 숫자를 입력하세요");
		two = Scan.nextInt();

		while (two < 0) {
			System.out.println("정수를 입력해주세요.");
			two = Scan.nextInt();
		}

		
		if (calc == 1) {

			result = (one + two);
			System.out.println(one + "+" + two + "=" + result);

		} else if (calc == 2) {

			if (one > two) {

				result = (one - two);
				System.out.println(one + "-" + two + "=" + result);
			} else {

				System.out.println("첫번째 숫자가 두번째 숫자보다 작습니다.");
			}

		} else if (calc == 3) {

			result = (one * two);
			System.out.println(one + "*" + two + "=" + result);
		} else {
			if (one > two) {

				result = (one / two);
				System.out.println(one + "/" + two + "=" + result);

			} else if (one == 0 || two == 0) {

				System.out.println("0에서 나누거나 0으로 나눌수 없습니다.");

			} else {
				System.out.println("첫번째 숫자가 두번째 숫자보다 작을 수 없습니다.");
			}

		}
		
	}

}
