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
		

		String[] sarr = new String[1];
		System.out.println(name + "학생의 정보는 : " + major + number + tutor + adress + " 입니다");
	}
}
