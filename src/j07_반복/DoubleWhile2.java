package j07_반복;

public class DoubleWhile2 {

	public static void main(String[] args) {
		/*
		 * 1교시 1분 ... // 전부 출력 50분 10분 쉬는시간 2교시 1분 ... // 전부 출력 50분 10분 쉬는시간 3교시 1분 ...
		 * // 전부 출력 50분 10분 쉬는시간 4교시 1분 ... // 전부 출력 50분 10분 쉬는시간
		 */

//		int lesson = 0;
//
//		while (lesson < 4) {
//
//			System.out.println("\t" + (lesson + 1) + "교시");
//			int i = 0;
//
//			while (i < 50) {
//				System.out.println((i + 1) + "분"); // 50분
//				i++;
//
//				if (i == 50) {
//					int n = 0;
//					while (n < 10) {
//						n++;
//						System.out.println(n + "분 쉬는 시간");
//
//					}
//				}
//			}
//			lesson++;
//		}
		
		int lesson = 0;

		while (lesson < 4) {

			System.out.println((lesson + 1) + "교시");
			int i = 0;

			while (i < 60) {
				if (i < 50) {
					System.out.println("\t" + (i + 1) + "분");
					i++;
				} else if (i == 50) {
					System.out.println("10분 쉬는 시간");
					i++;
				} else {
					System.out.println("\t" + ((i + 1) - 50) + "분 쉬는 시간");
					i++;
				}

			}
			lesson++;

		}

	}
}
