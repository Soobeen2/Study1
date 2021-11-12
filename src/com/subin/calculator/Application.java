package com.subin.calculator;

import java.util.Scanner;

public class Application {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("첫번째 정수를 하나 입력하세요 : ");
		int num1 = sc.nextInt();
		System.out.print("두번째 정수를 하나 입력하세요 : ");
		int num2 = sc.nextInt();
		// switch문을 이용해서 사칙연산 조합하기
		System.out.println("연산 기호를 하나 입력하세요 (+, -, *, /) : ");
		char op = sc.next().charAt(0);

		// 연산결과 저장할 변수
		int result = 0;

		switch(op) {

		case '+' : 
			result = num1 + num2;
			break;
		case '-' : 
			result = num1 - num2;
			break;
		case '*' : 
			result = num1 * num2;
			break;
		case '/' : 
			result = num1 / num2;
			break;
		}
		
		System.out.println(num1 + " " + op + " " + num2 + " = " + result);
	}
}
