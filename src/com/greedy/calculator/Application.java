package com.greedy.calculator;

import com.greedy.model.dto.MemberDTO;
import com.greedy.model.service.MemberService;
// 클래스는 각각의 역할이 있다.
// 클래스는 하나의 역할만 한다라는 원칙을 가지고있다.(객체지향의 단일화원칙)
public class Application {
	/* main메소드는 실행용 메소드 */
	public static void main(String[] args) {
		
//		Scanner sc = new Scanner(System.in);
//		System.out.print("첫번째 정수를 하나 입력하세요 : ");
//		int num1 = sc.nextInt();
//		System.out.print("두번째 정수를 하나 입력하세요 : ");
//		int num2 = sc.nextInt();
//		
		// 객체를 생성
		// 타입                                   구현부
		Calculator calc = new Calculator();
		System.out.println(calc);
		
		Calculator calc2 = new Calculator(10,10);
		System.out.println(calc2);
		//calc.plusTwoNumbers(num1, num2);
//		calc.plusTwoNumbers(num1, num2);
		
//		Calculator.plusTwoNumbers(num1, num2);
//		int plus = calc.plusTwoNumbers(num1, num2);
//		System.out.println("두 수를 더하면 : " + (plus) + " 입니다");
//		System.out.println("두 수를 빼면 : " + (num1 - num2) + " 입니다");
//		System.out.println("두 수를 나누면  : " + (num1 / num2) + " 입니다");
//		System.out.println("두 수를 곱하면 : " + (num1 * num2) + " 입니다");
//		System.out.println("두 수의 나머지는 : " + (num1 % num2) + " 입니다");
		
		MemberService memberService = new MemberService();
		String name = "홍길동";
		int age = 20;
		char gender = '남';
		
		MemberDTO member = new MemberDTO(name,age,gender);
		memberService.selectMember(member);
	}
}
