package j07_반복.랜덤;

import java.util.Random;

public class Random1_2 {

	public static void main(String[] args) {
		Random random = new Random();
		
		int i = 0;
		int a = 0;
		int b = 0;
		int c = 0;
		int max = 0;
		
//		a = 10;
//		b = 5; 
//		c = 7; // 첨에 넘 막막하면 a에다가 값넣어보는 거에요 랜덤하게 .. 내가 대충 값 넣어보고 비교하는 로직(논리)을 만들고 그걸 사용하면 댐.
			   // 내 생각엔 일단 a, b, c를 비교를 해야 할 것 같음. 3개 니까 .. -> 근데 모든 반복 중 가장 커야하니가 결국 max 랑 비교를 해야함 
			   // a , b 중 크게 나온 값을 맥스랑 비교해서 더 클 때 맥스에 넣어두고, 그 상태에서 c와 비교해서 맥스보다 c가 크면 또 넣어줘야 됨. 

		
		while(i <20) {
			a = random.nextInt(50);
			b = random.nextInt(50);
			c = random.nextInt(50);
			
			System.out.println("a : " + a);
			System.out.println("b : " + b);
			System.out.println("c : " + c); 
			
			if(a > b && max < a) {
//			if(a > b) {
//				if(max < a) {
//					max = a;
//				}
			}else if(max < b) {
					max = b;
				}
			
			if(max < c) { //위 if와 별개의 명령. 절대 같이 묶어주면 안 됩니다! 
				max = c;
			}
			
			i++;
			
		}
		
		System.out.println("최대값 : " + max);

	}

}
