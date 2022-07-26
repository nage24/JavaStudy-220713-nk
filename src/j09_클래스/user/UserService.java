package j09_클래스.user;

import java.util.Scanner;

public class UserService {
	
	private Scanner scanner;
	private User[] userArray;
	
	
	public UserService( User[] userArray) {
		this.userArray = userArray;
		this.scanner = new Scanner(System.in);
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
		String userName;
		String password;
		String name;
		String email;
		
		System.out.println("\n[회원가입]");
		
		System.out.println("아이디를 입력하세요: ");
		userName = scanner.nextLine();
		
		System.out.println("패스워드를 입력하세요: ");
		password = scanner.nextLine();
		
		System.out.println("성함을 입력하세요: ");
		name = scanner.nextLine();
		
		System.out.println("이메일을 입력하세요: ");
		email = scanner.nextLine();
		
		return new User(userName, password, name, email);
	}
	
	public boolean register() {
		User user = addUser();
		if(user != null) {
			System.out.println(user.toString());
		}else {
			return false;
		}
		
		return true;
	}
	

}
