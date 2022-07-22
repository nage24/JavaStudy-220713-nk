package j07_반복;

public class Continue1 {

	public static void main(String[] args) {
		for(int i = 0; i < 10; i++) {
			if(i % 2 == 0) {
				continue; 	// 다음 반복으로 넘어가~ 
			}
			System.out.println("i: " + i);
		}

	}

}
