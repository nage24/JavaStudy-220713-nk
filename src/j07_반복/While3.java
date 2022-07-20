package j07_반복;

import java.util.Scanner;

public class While3 {

	public static void main(String[] args) {
		/*
		 * 반복함수 입력: 10
		 * 
		 * n 변수에 저장
		 * 
		 * i = 1
		 * i = 2
		 * i = 3
		 * i = 4
		 * i = 5
		 * i = 6
		 * i = 7
		 * i = 8
		 * i = 9
		 * i = 10
		 * 
		 * i = 10 ; 거꾸로 ... 
		 */
		
		
		Scanner scanner = new Scanner(System.in);
		
		int n = 0;
		
		System.out.println("반복 횟수 입력: ");
		n = scanner.nextInt();
		
		int i = 0; // 0부터 시작하는 것은 고정으로
		
		while(i<n) { // 반복횟수
			System.out.println("i = " + (i+1));
			i++;
		}
		
		i = 0;
		System.out.println("\n");
		
		while(i<n) {
			System.out.println("i = " + (n-i));
			i++;
		}
		
	}

}
