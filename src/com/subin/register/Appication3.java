package com.subin.register;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.subin.register.dto.RegisterDTO;

public class Appication3 {

	public static void main(String[] args) {

		List<RegisterDTO> registerList = new ArrayList<RegisterDTO>();
		
		//1. setter를 이용한 값 저장
		RegisterDTO regi1 = new RegisterDTO();
		regi1.setName("켈러");
		regi1.setMajor("어문학");
		regi1.setNumber("010-1212-3434");
		regi1.setTutor("설리번");
		regi1.setAdress("인천시");
		
		System.out.println("regi1 : " + regi1);
		
		//2. 매개변수있는 생성자 방법
		RegisterDTO regi2 = new RegisterDTO("예람","클래식","010-5656-7878","승제","서울시");
		System.out.println("regi2 : " + regi2);
		
		// 리스트 추가
		registerList.add(regi1);
		registerList.add(regi2);
		registerList.add(new RegisterDTO("수빈","실용음악","010-5656-7878","승제","서울시"));
		registerList.add(new RegisterDTO("관순","사회복지학","010-0909-2121","란사","천안시"));
		registerList.add(new RegisterDTO("봉길","철학","010-4343-6565","매곡","예산시"));
		registerList.add(new RegisterDTO("중근","ICT","010-8787-9090","상설","황해도"));
		
		System.out.println("----------리스트 출력----------");
		
		Scanner sc = new Scanner(System.in);
		System.out.print("학생의 이름을 입력하세요 : ");
		String getStuInfo = sc.nextLine();

		// 향상된 for문
		for(RegisterDTO rg: registerList) {
			if(rg.getName().equals(getStuInfo)){
			System.out.println("학생정보 : " + rg);
			
			}
		}
	}
}
