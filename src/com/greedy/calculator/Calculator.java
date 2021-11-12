package com.greedy.calculator;

public class Calculator {

	private int num1;
	private int num2;
	
	public Calculator() {}
	
	public Calculator(int num1, int num2) {
		this.num1 = num1;
		this.num2 =  num2;
	}
	/* 더하기 기능 */
	public void plusTwoNumbers(int num1, int num2) {
		printString(num1,num2);
		//return num1 + num2;
	}
	
	private void printString(int num1, int num2) {
		System.out.println("두 수를 더하면 : " + (num1 + num2) +  " 입니다");
	}
	/* 빼기 기능 */
	public int minusTwoNumbers(int num1, int num2) {
//		System.out.println("두 수를 빼면 : " + (num1 - num2) +  " 입니다");
		return num1 - num2;
	}
	/* 곱하기 기능 */
	public int multipleTwoNumbers(int num1, int num2) {
//		System.out.println("두 수를 곱하면 : " + (num1 * num2) +  " 입니다");
		return num1 * num2;
	}
	/* 나누기 기능 */
	public int divideTwoNumbers(int num1, int num2) {
//		System.out.println("두 수를 나눈면 : " + (num1 / num2) +  " 입니다");
		return num1 / num2;
	}

	@Override
	public String toString() {
		return "Calculator [num1=" + num1 + ", num2=" + num2 + "]";
	}
	
}
