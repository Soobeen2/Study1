package com.subin.calculator;

import java.util.Scanner;

public class Application1 {

	public static void main(String[] args) {
		
		String[] name = {"켈러","수빈","관순","봉길","중근"};
		String[] major = {"어문학","실용음악","사회복지학","철학","ICT"};
		String[] number = {"010-1212-3434","010-5656-7878","010-0909-2121","010-4343-6565","010-8787-9090"};
		String[] tutor = {"설리번","승제","란사","매곡","상설"};
		String[] adress = {"인천시","서울시","천안시","예산시","황해도"};
		
		Scanner sc = new Scanner(System.in);
		System.out.print("조회할 학생의 이름을 입력하세요 : ");
		String info = sc.nextLine();
		
		// String배열을 생성하고 크기를 1로 지정
		String[] sarr = new String[1];
		
		
		// 반복문을 이용해서 검색한 이름이 몇번째 index에 있는지 찾고,---> 문자열비교이기 때문에 equals()
		for(int i = 0; i < name.length; i++) {
			if(name[i].equals(info)){
				
				// 선생님 숙제
				System.out.println(name[i] + "은 " + (i+1) + "번째 입니다");
				
				// 내가 하고싶던거
				System.out.println(name[i] + "의 전공은 " + major[i] + "입니다");
				System.out.println("연락처는 " + number[i] + "입니다");
				System.out.println("담당교수는 " + tutor[i] + "입니다");
				System.out.println("주소는 " + adress[i] + "입니다");
				
			}
		}
	}
}
