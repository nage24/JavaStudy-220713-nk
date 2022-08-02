package j12_다형성.인터페이스.ATM;

public class User {
	
	private String userId;			// 아이디
	private String userPassword;	// 비번
	private int accountNumber;		// 계좌번호
	private String accountName;		// 계좌주 명
	
	public User() {
		
	}
	
	public User(String userId, String userPassword, int accountNumber, String accountName) {
		this.userId = userId;
		this.userPassword = userPassword;
		this.accountNumber = accountNumber;
		this.accountName = accountName;
	}
	
	
	
}
