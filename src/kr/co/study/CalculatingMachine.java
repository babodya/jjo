package kr.co.study;

import java.util.Scanner;

public class CalculatingMachine {
	
	public static void main(String[] args) {

		int one = 0;
		int two = 0;
		int result = 0;
		int calc = 0;

		Scanner Scan = new Scanner(System.in);
		System.out.print("ù��° ���ڸ� �Է��ϼ���");
		one = Scan.nextInt();
		
		while (one < 0) {	
			System.out.print("������ �Է����ּ���.");
			one = Scan.nextInt();
		}

		Scan = new Scanner(System.in);
		System.out.println("��Ģ�����ڸ� ������.");
		System.out.println("1. + (���ϱ�)");
		System.out.println("2. - (����)");
		System.out.println("3. * (���ϱ�)");
		System.out.println("4. / (������)");
		calc = Scan.nextInt();
		
		while (calc < 1 || calc > 4) {
			System.out.println("��Ģ�����ڸ� ���⿡�� ������.");
			System.out.println("1. + (���ϱ�)");
			System.out.println("2. - (����)");
			System.out.println("3. * (���ϱ�)");
			System.out.println("4. / (������)");
			calc = Scan.nextInt();
		}
		
		Scan = new Scanner(System.in);
		System.out.println("�ι�° ���ڸ� �Է��ϼ���");
		two = Scan.nextInt();

		while (two < 0) {
			System.out.println("������ �Է����ּ���.");
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

				System.out.println("ù��° ���ڰ� �ι�° ���ں��� �۽��ϴ�.");
			}

		} else if (calc == 3) {

			result = (one * two);
			System.out.println(one + "*" + two + "=" + result);
		} else {
			if (one > two) {

				result = (one / two);
				System.out.println(one + "/" + two + "=" + result);

			} else if (one == 0 || two == 0) {

				System.out.println("0���� �����ų� 0���� ������ �����ϴ�.");

			} else {
				System.out.println("ù��° ���ڰ� �ι�° ���ں��� ���� �� �����ϴ�.");
			}

		}
		
	}

}
