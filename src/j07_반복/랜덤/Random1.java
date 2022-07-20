package j07_반복.랜덤;

import java.util.Random;

public class Random1 {

	public static void main(String[] args) {

		/*
		 * random 메소드
		 * 0 - 1 사이의 숫자를 실수형태로 랜덤하게 값을 만들어줌. 
		 * 
		 * 
		 */
		int i = 0;
		int temp = 0; // 랜덤으로 나온 값 중 제일 큰 값을 계속계속 넣어줍시다. 
		
//		while(i<10) {
//			double rNum = Math.random();
//			System.out.println((int)(rNum * 10)); // 10곱하고 다운캐스팅 해서 한자리수 랜덤 뽑기
//			
//			i++;
//		}
		
		
		/*
		 * Random 클래스
		 * nextBoolean()
		 * nextInt()
		 *  ... 
		 */
		Random random = new Random(); // ctrl + space바 해서 import 해줘야함.
		
		while (i < 10) {
			int rNum = random.nextInt(10); // 100 안의 숫자에서 랜덤 숫자를 봅아줌
			System.out.println("현재 temp 값: " + temp);
			System.out.println("새로 생성된 값: " + rNum); // Alt 누르고 위아래 누르면 줄 바꿔줌
			
			if(i == 0) {
				temp = rNum;
			}else {
				if(temp < rNum) {
					temp = rNum;
				}
			}
			i++;
		}
		
		
		System.out.println("최대값 : " + temp);
	}
}
