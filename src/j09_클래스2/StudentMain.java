package j09_클래스2;

public class StudentMain {

	public static void main(String[] args) {
		
		//new; 메모리의 heap 공간에 저 클래스가 카피되어서(복사되어서) 저 인스턴스가 그대로 생기는 것
		//그리고 저 메모리 주소값을 저장하는 것
		
		int studentCount = 2;
		
		Student[] studentArray = new Student[studentCount];				// 얘 주소를
		
		StudentService service = new StudentService(studentArray);		// 얘가 받아서 서비스페이지로 이동해서 생성되어졌을 대 쟤 주소를 넣어주는 것임! 
		
		while(service.showMainMenu()) 
			System.out.println("프로그램 종료");
		
		
	}

}
