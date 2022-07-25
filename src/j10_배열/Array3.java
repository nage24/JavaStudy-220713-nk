package j10_배열;

import j09_클래스.접근지정자.student.Student;

public class Array3 {

	public static void main(String[] args) {
		/*
		 * names 배열 5개
		 * studentYears 배열 5개
		 * scores 배열 5개
		 * 
		 * 박진관 3 75.9(double)
		 * 조문기 2 80.5
		 * 서재효 4 85.7
		 * 임나영 3 88.3
		 * 전나경 4 78.5
		 * 
		 * 박진관 \t3학년 75.9점(double)
		 * 조문기 \t2학년 80.5점
		 * 서재효 \t4학년 85.7점
		 * 임나영 \t3학년 88.3점
		 * 전나경 \t4학년 78.5점
		 */
		
		String[] names = { "박진관", "조문기", "서재효", "임나영", "전나경" };
		int[] studentsYears = { 3, 2, 4, 3, 4 };
		double[] scores = { 75.9, 80.5, 85.7, 88.3, 78.5 };

		for(int i = 0; i < 5; i++) {
			System.out.println(names[i] + "\t" + studentsYears[i] + "학년 " + scores[i] + "점");
		}
		
		// 학생 배열을 만들어서 값들을 넣으면 더 편하겠죠
		// 만들어둔 걸 가져와보자
		
		Student[] students = new Student[5];
		students[0] = new Student("김준일", 3, 29, "부산", "010-9988-1916");
		
//		for(int i = 0; i <5; i++) {
//			if(students[i] == null) {
//				continue; 					// 배열에서 꺼냈더니 null값이 뜨면 계속해라 // 값을 다 넣어주지 않아서 null값이 나오죠
//			}
//			System.out.println("이름: " + students[i].getName()); 		// 다른 방법 ; student[i] != null 일 때는 실행을 해라 라고 작성할 수도 있습니다. 
//		}
		
		for(int i = 0; i <5; i++) {
			if(students[i] != null) {
				System.out.println("이름: " + students[i].getName()); 	// 우린 더 실행할 로직이 없으니 눌이 아닐때 실행하라는 구문이 더 적합하겠죠
																		// 더 실행해야 할 때 continue 를 쓰는게 맞습니다. 
			}
		}
		
		
		
		
		
		
	}

}
