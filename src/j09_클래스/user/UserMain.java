package j09_클래스.user;

public class UserMain {
	
	
	/*
	 * 사용자 정보 시스템
	 * username(사용자 이름)
	 * password(비밀번호)
	 * name(이름)
	 * email(이메일)
	 * 
	 * User
	 * UserService
	 */
	
	public static void main(String[] args) {
		
		int userCount = 2;
		
		// User 정보를 담아줄 배열
		User[] userArray = new User[userCount];
		
		UserService service = new UserService(userArray);
		
		while(service.showMain()) {};
		// while(service.register()) {};
		
	}

}
