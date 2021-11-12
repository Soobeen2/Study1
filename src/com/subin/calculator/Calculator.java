package com.subin.calculator;

public class Calculator {
	
	public Calculator() {}

	/* 더하기 기능 */
	public void plusTwoNumbers(int num1, int num2) {
		System.out.println("두 수를 더한 결과 : " + (num1 + num2));
	}
	/* 빼기 기능 */
	public void minusTwoNumbers(int num1, int num2) {
		System.out.println("두 수를 뺀 결과 : " + (num1 - num2));
	}
	/* 곱하기 기능 */
	public void multipleTwoNumbers(int num1, int num2) {
		System.out.println("두 수를 곱한 결과 : " + (num1 * num2));
	}
	/* 나누기 기능 */
	public void divideTwoNumbers(int num1, int num2) {
		System.out.println("두 수를 나눈 결과 : " + (num1 / num2));
	}

}
