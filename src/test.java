
public class test {

	public static void main(String[] args) {
		int lesson = 0; // 교시

		while (lesson < 4) {

			System.out.println(lesson + 1 + "교시");
			int i = 0;

			// 수업 시간과 쉬는 시간을 잴 겁니다.
			while (i < 60) { // 60분이니까 60번 반복.
				int timer = 0;

				if (i < 50) { // 수업시간 50분
					timer = i + 1;
					System.out.println("\t" + timer + "분"); // 1분 ~ 50분
				} else {
					if (i == 50) {
						System.out.println("10분 쉬는 시간");
					}

					timer = i - 50 + 1; // 수업시간 50분을 빼줘야 쉬는시간 카운트가 1분 부터 될 것임.
					System.out.println("\t" + timer + "분");
				}

				i++;
			}
		lesson++;
		}

	}
}
