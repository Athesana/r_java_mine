package com.kh.dimension.practice;

import java.util.Random;
import java.util.Scanner;

public class DimensionPractice {

	public void method1() {
		
		int one[][] = new int[4][4];
		
		int value = 1;
		
		for(int i = 0; i < one.length; i++) {
			for(int j = 0; j < one[i].length; j++) {
				one[i][j] = value++; 
			}
		}
		
		for(int i = 0; i < one.length; i++) {
			for(int j = 0; j < one[i].length; j++) {
				System.out.printf("%2d ", one[i][j]);
			}
			System.out.println();
		}
		
	}
	
	public void method2() {
		
		int two[][] = new int[4][4];
		int value = 16;
		
		for(int i = 0; i < two.length; i++) {
			for(int j = 0; j < two[i].length; j++) {
				two[i][j] = value--;
			}
		}
		
		for(int i = 0; i < two.length; i++) {
			for(int j = 0; j < two[i].length; j++) {
				System.out.printf("%2d " , two[i][j]);
			}
			System.out.println();
		}
		
		
	}
	
	public void method3() {
		
		String[][] three;
		three = new String[3][3];
		
		for(int i = 0; i < three.length; i++) {
			for(int j = 0; j < three[i].length; j++) {
				three[i][j] = "(" + i + "," + j + ")";
			}
		}
		
		for(int i = 0; i < three.length; i++) {
			for(int j = 0; j < three[i].length; j++) {
				System.out.printf("%s ", three[i][j]);
			}
			System.out.println();
		}
		
	}
	
	public void method4() {
		
		int[][] four = new int[4][4];
		int sum = 0;
		
		for(int i = 0; i < four.length -1 ; i++) {
			for(int j = 0; j < four[i].length - 1; j++) {
				four[i][j] = (int)(Math.random() * 10 + 1);
				
				four[3][j] += four[i][j];
				four[i][3] += four[i][j];
				four[3][3] += four[i][j];
			
			}
		}
		
		
		for(int i = 0; i < four.length; i++) {
			for(int j = 0 ; j < four[i].length; j++) {
				
				System.out.printf("%2d ", four[i][j]);
			}
			System.out.println();
		}
		
	}
	
	public void method5() {
		
		int row = 0;
		int col = 0;
		Scanner scanner = new Scanner(System.in);
		
		char [][] iArray = null;
		
		while(true) {
			System.out.print("행 크기를 입력하세요 : ");
			row = scanner.nextInt();
			System.out.print("열 크기를 입력하세요 : ");
			col = scanner.nextInt();
			
			if ((row >= 1 && row <= 10) && (col >= 1 && col < 10)){
				iArray = new char[row][col];
				
				for(int i = 0; i < iArray.length; i++) {
					for(int j = 0; j < iArray[i].length; j++) {
						iArray[i][j] = (char)((int)(Math.random() * 26 + 65));
					}
				}
			
				for(int i = 0; i < iArray.length; i++) {
					for(int j = 0; j < iArray[i].length; j++) {
						System.out.print(iArray[i][j] + " ");
					}
					System.out.println();
				}
		
			 break; 
		
			} else {
				
			System.out.println("반드시 1 ~ 10 사이의 정수를 입력해야 합니다.");
			
			}
		
		}

	}
	
	public void method6() {
		
		String[][] strArr = new String[][] {{"이","까","왔","앞","힘"}, 
										    {"차","지","습","으","냅"},
										    {"원","열","니","로","시"},
										    {"배","심","다","좀","다"},
										    {"열","히","! ","더","!! "}};
		
		for(int j = 0; j < strArr.length; j++) {
			for(int i = 0; i < strArr[j].length; i++) {
				System.out.print(strArr[i][j]);
			}
			System.out.println();
		}
		
							
	}
	
	public void method7() {
		
		int inum = 0;
		int inum2 = 0;
		char ch = 'a';
		char[][] seven = null; 
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("행의 크기를 입력하세요. : ");
		inum = scanner.nextInt();
		
		seven = new char[inum][];
		
			for(int i = 0; i < seven.length; i++) {
				System.out.print(i + "행의 크기 : " );
				inum2 = scanner.nextInt();
				
				seven[i] = new char[inum2];
			}
			
			
			for(int i = 0; i < seven.length; i++) {
				for(int j = 0; j < seven[i].length; j++) {
					seven[i][j] = ch++;
				}
			}
				
			for(int i = 0; i < seven.length; i++) {
				for(int j = 0; j < seven[i].length; j++) {
					System.out.print(seven[i][j] + " ");
				}
				
				System.out.println();
			}
		
	}
	
	public void method8() {
		
		String[] member = {"강건강", "남나나", "도대담", "류라라", "문미미", "박보배", "송성실", "윤예의", "진재주", "차천축", "피풍표", "홍하하"};
		String[][] line1 = new String[3][2];
		String[][] line2 = new String[3][2];
		int value = 0;
		
		System.out.println("== 1분단 ==");
		
		
			for(int i = 0; i < line1.length; i++) {
				for(int j = 0; j < line1[i].length; j++) {
					line1[i][j] = member[value++];
				}
			}
		
			for(int i = 0; i < line1.length; i++) {
				for(int j = 0; j < line1[1].length; j++) {
					System.out.print(line1[i][j] + " ");
				}
				System.out.println();
			}
	
		System.out.println("== 2분단 ==");
		

			for(int i = 0; i < line2.length; i++) {
				for(int j = 0; j < line2[i].length; j++) {
					line2[i][j] = member[value++];
				}
			}
			
			for(int i = 0; i < line2.length; i++) {
				for(int j = 0; j < line2[i].length; j++) {
					System.out.print(line2[i][j] + " ");
				}
				System.out.println();
			}

	}
	
	public void method9() {
		
		String[] member = {"강건강", "남나나", "도대담", "류라라", "문미미", "박보배", "송성실", "윤예의", "진재주", "차천축", "피풍표", "홍하하"};
		String[][] line1 = new String[3][2];
		String[][] line2 = new String[3][2];
		int value = 0;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("== 1분단 ==");
		
			for(int i = 0; i < line1.length; i++) {
				for(int j = 0; j < line1[i].length; j++) {
					line1[i][j] = member[value++];
				}
			}
		
			for(int i = 0; i < line1.length; i++) {
				for(int j = 0; j < line1[1].length; j++) {
					System.out.print(line1[i][j] + " ");
				}
				System.out.println();
			}
	
		System.out.println("== 2분단 ==");

			for(int i = 0; i < line2.length; i++) {
				for(int j = 0; j < line2[i].length; j++) {
					line2[i][j] = member[value++];
				}
			}
			
			for(int i = 0; i < line2.length; i++) {
				for(int j = 0; j < line2[1].length; j++) {
					System.out.print(line2[i][j] + " ");
				}
				System.out.println();
			}

		System.out.println("=============================");
		String name = ""; // 이름
		String group = "";  // 분단
		int col = 0; // 몇 번재 줄
		String side = "";  // 왼쪽 or 오른쪽
		
		System.out.print("검색할 학생 이름을 입력하세요. : ");
		name = scanner.nextLine();
		
		for(int i = 0; i < line1.length; i++) {
			for(int j = 0; j < line1[i].length; j++) {
				if(line1[i][j].equals(name)) {
					group = "1분단";
					col = i+1;
					
					if(j == 0) {
						side = "왼쪽";
					} else {
						side = "오른쪽";
					} 
					
				}
			}
		}
		
		for(int i = 0; i < line2.length; i++) {
			for(int j = 0; j < line2[i].length; j++) {
				if(line2[i][j].equals(name)) {
					group = "2분단";
					col = i+1;
					
					if(j == 0) {
						side = "왼쪽";
					} else {
						side = "오른쪽";
					} 
				}
			}	
		}
		
		if(group.equals("")) {
			System.out.println("검색하신 학생은 없습니다.");
		} else {
			System.out.println("검색하신 " + name + "학생은 " + group + " " + col + "번째 줄 " + side + "에 있습니다.");
			
		}
	
		
	}

	
}