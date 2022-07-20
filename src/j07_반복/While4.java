package j07_반복;

public class While4 {

	
	public static void main(String[] args) {
		int dan = 2;
		
		//System.out.println(dan + "x" + num + "=" + (dan * num));
		
		/*
		 * 2 x 1 = 2
		 * 2 x 2 = 3
		 * 구구단 만들기
		 */
		
		int i = 0;
		
		while(i < 9) { // 9번 반복합니다. while 안에는 반복횟수가 무조건적으로 들어간다 생각하믄 댑니다. 
			
			int num = i + 1; // 구구단은 1단 부터니까 num을 i보다 1 크게 하면 1부터 곱해지겠죠
			System.out.println(dan + "x" + num + "=" + (dan * num));
			i++; // i를 1 증가하면 i가 8일때 반복이 멈추고 num은 i 보다 크기 때문에 9까지 곱해지고 멈춥니다. 
			
		}
	}
}
