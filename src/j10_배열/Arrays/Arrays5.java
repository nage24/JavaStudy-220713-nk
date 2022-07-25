package j10_배열.Arrays;

import java.util.Arrays;

import j09_클래스.접근지정자.student.Student;

public class Arrays5 {

	public static void main(String[] args) {
		
		int[] nums = new int[5];				// 기본 0
		
		for(int i = 0; i < nums.length; i++) {
			System.out.println(nums[i]);
		}
		
		Student[] students = new Student[5];
		students[0] = new Student();			// 출력하면 0번째 인덱스에 스튜던트 주소가 들어가있습니다. ->그안의 메소드 등 사용할 수 있습니다. 
		students[0].setName("김준일");			
		System.out.println(students[0].getName());
		//students[1].setName("갱나");			//  null 값에는 뭘 할수가 없겟지요
		
		for(int i = 0; i < students.length; i++) {		// 이러면 각자 스튜던트 객체가 생긴게 보이지요
			students[i] = new Student();
		}
		
		
		for(int i = 0; i < students.length; i++) {	// 기본 null
			System.out.println(students[i]);
		}
		
	}

}
