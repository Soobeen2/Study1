package com.subin.register;

import java.util.Scanner;

public class Application2 {

	public static void main(String[] args) {

		//2차원
		//		int[][] arr1;
		//		arr1 = new int[3][];

		//정변
		//		int[][] arr2 = new int[3][4];

		//가변
		//		int[][] arr3 = new int[3][];

		String[][] students = {{"켈러","어문학","010-1212-3434","설리번","인천시"},
				{"수빈","실용음악","010-5656-7878","승제","서울시"},
				{"관순","사회복지학","010-0909-2121","란사","천안시"},
				{"봉길","철학","010-4343-6565","매곡","예산시"},
				{"관순","ICT","010-8787-9090","상설","황해도"}};

		//1. 이름받을 스캔
		Scanner sc = new Scanner(System.in);
		System.out.print("학생의 이름을 입력하세요 : ");
		String stuInfo = sc.nextLine();

		//2. 반복문 이용하여 검색한 이름에 맞는 전체정보 출력
		for(int i = 0; i < students.length; i++) {
			if(students[i][0].equals(stuInfo)){
				System.out.print((i+1) + "번째 학생의 정보 : ");
				for(int j = 0; j < students[i].length; j++){
					System.out.print(students[i][j] + " ");
				}
				System.out.println();
			}
		}
	}
}


