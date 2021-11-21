package com.subin.register;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.subin.yeramProject.dto.YeramDTO;

public class Yeram1 {

	public static void main(String[] args) {

		List<YeramDTO> yeramList = new ArrayList<YeramDTO>();

		yeramList.add(new YeramDTO(20211121, "오초보"));
		yeramList.add(new YeramDTO(20211122, "임잔디"));
		yeramList.add(new YeramDTO(20211123, "신지각"));

		Scanner sc = new Scanner(System.in);
		System.out.print("학번을 입력해주세요 : ");
		int inputNo = sc.nextInt();
		//for(자료형 변수 : 리스트)
		for(YeramDTO yr : yeramList){
			
			if(yr.getStuNo() == inputNo){
				
				System.out.println("입학자 정보 : " + yr);
			}
		}
	}
}
