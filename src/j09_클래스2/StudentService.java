package j09_클래스2;


// 먼가 기능이 있는 클래스
import java.util.Scanner;

public class StudentService {
	
	private Scanner scanner;
	private Student[] studentArray;
	
	public StudentService(Student[] studentArray) {
		this.studentArray = studentArray;
		this.scanner = new Scanner(System.in);
	}
	
	
	private String inputSelect() {	
		System.out.print("메뉴선택 >> ");
		return scanner.nextLine();
	}
	
	private void printSelectErrorMessage() {
		System.out.println("해당 메뉴는 선택 할 수 없습니다.");
		System.out.println("다시 입력하세요.");
	}
	
	public boolean showMainMenu() {
		String select = null;
		
		System.out.println("[학생 등록 시스템]");
		System.out.println("1. 학생 등록");
		System.out.println("2. 학생 조회");
		System.out.println("q. 프로그램 종료");
		
		select = inputSelect();
		
		if(select.equals("1")) {
			Student student = addStudent();
			if(student != null) {
				System.out.println(student.toString());
			}
			
		}else if(select.equals("2")) {
			showStudentSearch();
			
		}else if(select.equals("q")) {
			System.out.println(" 프로그램 종료중 ...");
			return false;
			
		}else {
			printSelectErrorMessage();
		}
		
		System.out.println();
		
		return true;
	}
	
	private Student addStudent() {
		// 배열에 착착 집어넣는 로직이 필요함. 
		
		for(int i = 0; i < studentArray.length; i++) {
			if(studentArray[i] != null) {
				continue;
			}
			studentArray[i] = inputStudent();		// null이 없다는 건 자리가 없다는 것임. 근데 자리가 있다고 하면 해당 자리에 학생을 넣어줄 수 있겠죠
			System.out.println("[ " + studentArray[i].getStudentName() + " ] 학생 등록 완료");	//	그리고 null이면 학생입력을 받겠죠 
			return studentArray[i];
		}
		
		System.out.println("더 이상 학생을 등록할 수 없습니다.");
		
		return null;
	}
	
	private Student inputStudent() {			// 리턴 자료형은 Student. 함수 선언은 접근제어자 + 자료형 + 함수명! 
											// 학생 객체를 생성해야만 주소값이 생기겟지요 
											// 학생 등록할 대만 쓸거니가 private
		String studentName = null;
		int studentYear = 0;
		String studentAddress = null;
		String studentPhone = null;
		
		System.out.println("[학생 등록]");
		
		System.out.println("이름 >> ");
		studentName = scanner.nextLine();
		
		System.out.println("학년 >> ");
		studentYear = scanner.nextInt();		// 버퍼에 엔터가 남아버리겠죠 초기화해줘야 해요
		scanner.nextLine();
		
		System.out.println("주소 >> ");
		studentAddress = scanner.nextLine();
		
		System.out.println("연락처 >> ");
		studentPhone = scanner.nextLine();
		
		Student s = new Student(studentName, studentYear, studentAddress, studentPhone); 	// 전체 생성자가 인스턴스를 생성하게 만들어줘요
		
		return s;
	}
	
	private boolean showStudentSearch() {
		String select = null;
		
		System.out.println("[학생 조회]");
		System.out.println("1. 학생 전체 조회");
		System.out.println("2. 학생 조회");
		System.out.println("b. 뒤로가기");
		
		select = inputSelect();
		
		if(select.equals("1")) {
			showStudentList();
		}else if(select.equals("2")) {
			showSearchStudent();
			
		}else if(select.equals("b")) {
			System.out.println("이전 메뉴로 돌아갑니다.");
			return false;
		}else {
			printSelectErrorMessage();
		}
		
		System.out.println();
		return true;
	}

	private void showStudentList() {
		System.out.println("[학생 전체 조회]");
		System.out.println("이름\t\t학년\t\t주소\t\t연락처");
		for(int i = 0; i < studentArray.length; i++) {
			if(studentArray[i] != null) {
				System.out.println(studentArray[i].getStudentName() + "\t\t"
						+ studentArray[i].getStudentYear() + "\t\t"
						+ studentArray[i].getStudentAddress() + "\t\t"
						+ studentArray[i].getStudentPhone()) ;
			}
		}
		System.out.println();
		
	}
	
	private void showSearchStudent() {
		String searchName = null;
		
		System.out.println("학생 이름으로 검색");
		System.out.print("이름 >> ");
		searchName = scanner.nextLine();
		
		Student searchStudent = searchStudentByStudentName(searchName);
		if(searchStudent != null) {
			System.out.println(searchStudent.toString());
		}
		
	}
	
	private Student searchStudentByStudentName(String searchName) {
		for(int i = 0; i < studentArray.length; i++) {
			if(studentArray != null) {
				String studentName = studentArray[i].getStudentName();
				if(searchName.equals(studentName)) {
					return studentArray[i];
				}
			}
		}
		System.out.println("해당 이름의 학생은 존재하지 않습니다.");
		return null;
	}
	
	
	
}
