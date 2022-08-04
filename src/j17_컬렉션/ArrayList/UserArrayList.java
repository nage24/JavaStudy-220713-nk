package j17_컬렉션.ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

import lombok.Getter;

@Getter 
public class UserArrayList {
	private ArrayList<User> userList;
	private Scanner scanner;

	public UserArrayList() {
		userList = new ArrayList<User>();
		scanner = new Scanner(System.in);
	}
	
	public void addUser() {
		//입력
		System.out.println("아이디: ");
		System.out.println("비밀번호: ");
		System.out.println("이름: ");
		System.out.println("이메일: ");
		
		String username = scanner.nextLine();
		String password = scanner.nextLine();
		String name = scanner.nextLine();
		String email = scanner.nextLine();
		
		// User 객체 생성
		User user = User.builder()
				.username(username)
				.password(password)
				.name(name)
				.email(email)
				.build();
		
		System.out.println("회원 추가 완료.\n");
		System.out.println(user);
				
		// userList에 add하기
		userList.add(user);
		
		// 나 보는 거
		System.out.println(userList + "\n");
	}
	
	public void printUserList() {
		// userList
		/*
		 * 아이디 > aaa
		 * 비밀번호 > 1234
		 * 이름 > 김준일
		 * 이메일 > aaa@naver.com
		 * 
		 * 아이디 > bbb
		 * 비밀번호 > 2222
		 * 이름 > 김준이
		 * 이메일 > bbb@naver.com
		 * 
		 */
		
		for(User user : userList) {
			System.out.println("아이디\t > " + user.getUsername());
			System.out.println("비밀번호 > " + user.getPassword());
			System.out.println("이름/t > " + user.getName());
			System.out.println("이메일/t > " + user.getEmail());
			System.out.println("\n");
		}
		
	}
	
	public void removeUser() {
		// 아이디 입력
		System.out.print("아이디를 입력해주세요: ");
		String findUsername = scanner.nextLine();

		for (User user : userList) {
			if (user.getUsername().equals(findUsername)) {
				System.out.print("비밀번호를 입력해주세요: ");
				String confirmPassword = scanner.nextLine();

				if (user.getPassword().equals(confirmPassword)) {
					userList.remove(user);
					System.out.println("회원 삭제 완료.\n");
					// break; 브레이크 아님
					return;
				} else
					System.out.println("비밀번호가 다릅니다.");
					return;
			} else {
				System.out.println("회원 정보가 없습니다.");
				return;
			}
		}
	}
			
	
	public static void main(String[] args) {
		
	/*
	 * [ 사용자 관리 프로그램 ]
	 * 1. 사용자 추가
	 * 2. 사용자 리스트 출력
	 * 3. 사용자 삭제
	 * 4. 프로그램 종료
	 * 
	 * 루프
	 */
		UserArrayList userArrayList = new UserArrayList();
		
		while (true) {
			System.out.println("[ 사용자 관리 프로그램]");
			System.out.println("1. 사용자 추가");
			System.out.println("2. 사용자 리스트 출력");
			System.out.println("3. 사용자 삭제");
			System.out.println("4. 프로그램 종료");
			
			System.out.print("옵션을 선택하세요 > ");
			String select = userArrayList.getScanner().nextLine();
			System.out.println("\n");

			if (select.equals("1")) {
				userArrayList.addUser();
			} else if (select.equals("2")) {
				userArrayList.printUserList();
			} else if (select.equals("3")) {
				userArrayList.removeUser();
			} else if (select.equals("4")) {
				break;
			} else {
				System.out.println("잘못 선택하셨습니다.\n");
			}

		}
		
		
		
		
		
		
	}
	
}
