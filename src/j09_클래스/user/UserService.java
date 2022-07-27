package j09_클래스.user;

import java.util.Scanner;

public class UserService {
	
	private Scanner scanner;
	private User[] userArray;
	
	public UserService(User[] userArray) {
		this.userArray = userArray;
		this.scanner = new Scanner(System.in);
	}
	
	private String inputSelect() {
		System.out.print("옵션 선택 >> ");
		return scanner.nextLine();
	}
	
	private void printSelectError() {
		System.out.println("해당 옵션은 선택 할 수 없습니다.");
		System.out.println("다시 선택해 주세요.");
	}
	
	public boolean showMain() {
		String select = null;
		
		System.out.println("[회원가입 하시겠습니까?]");
		System.out.println("1. 회원 등록");
		System.out.println("2. 회원 조회");
		System.out.println("q. 나가기");
		
		select = inputSelect();
		
		if(select.equals("1")) {
			User user = addUser();
			if(user != null) {
				System.out.println(user.showUser());
			}
		}else if(select.equals("2")) {
			showUserSearch();
		}else if(select.equals("q")) {
			System.out.println("회원가입 창을 닫습니다.");
			return false;
		}else {
			printSelectError();
		}
		
		return true;
	}
	
	private User addUser() {
		for(int i = 0; i < userArray.length; i++) {
			if(userArray[i] != null) {
				continue;
			}
			userArray[i] = inputUser();
			System.out.println("[ " + userArray[i].getName() + "님 회원가입이 성공적으로 되었습니다. ]");
			return userArray[i];
		}
		
		System.out.println("더 이상 회원가입 하실 수 없습니다.");
		
		return null;
	}
	
	private User inputUser() {
		String userName = null;
		String password = null;
		String name = null;
		String email = null;
		
		System.out.println("\n[회원가입]");
		
		System.out.print("아이디를 입력하세요: ");
		userName = scanner.nextLine();
		
		System.out.print("패스워드를 입력하세요: ");
		password = scanner.nextLine();
		
		System.out.print("성함을 입력하세요: ");
		name = scanner.nextLine();
		
		System.out.print("이메일을 입력하세요: ");
		email = scanner.nextLine();
		
		return new User(userName, password, name, email);
	}
	
	private boolean showUserSearch() {
		String select = null;
		
		System.out.println("[회원정보를 확인합니다.]");
		System.out.println("1.유저 이름으로 검색");
		System.out.println("2.유저 정보 전체 조회");
		System.out.println("b. 회원가입 창으로 돌아갑니다.");
		
		select = inputSelect();
		
		if(select.equals("1")) {
			searchUser();
		}else if(select.equals("2")){
			showUserList();
		}else if(select.equals("b")) {
			System.out.println("회원가입 창으로 돌아갑니다.");
			return false;
		}else {
			printSelectError();
		}
		
		return true;
	}
	
	private void searchUser() {
		String searchUser = null;
		
		System.out.println("[유저 이름으로 검색]");
		System.out.print("username >> ");
		searchUser = scanner.nextLine();
		
		User searchUserName = searchUserByUserName(searchUser);
		if(searchUser != null) {
			System.out.println(searchUserName.showUser());
		}
	}
	
	private User searchUserByUserName(String searchUser) {
		for(int i = 0; i < userArray.length; i++) {
			if(userArray[i] != null) {
				String userName = userArray[i].getUserName();
				if(searchUser.equals(userName)) {
					return userArray[i];
				}
			}
		}
		System.out.println("유저 정보 없음.");
		return null;
	}
	
	private void showUserList() {
		System.out.println("[유저 정보 전체 조회]");
		System.out.println("유저이름\t\t비밀번호\t\t이름\t\t이메일");
		for(int i = 0; i < userArray.length; i++) {
			if(userArray[i] != null) {
				System.out.println(userArray[i].getUserName() + "\t\t"
						+ userArray[i].getPassword() + "\t\t"
						+ userArray[i].getName() + "\t\t"
						+ userArray[i].getEmail());
			}
			System.out.println();
		}
	}
//	public boolean register() {
//		User user = addUser();
//		if(user != null) {
//			System.out.println(user.showUser());
//		}else {
//			return false;
//		}
//		return true;
//	}
}
