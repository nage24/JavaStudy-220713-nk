package j12_다형성.인터페이스.ATM;

public class BankAccount {
	
	public int accountNumber; 	// 계좌번호
	public int balance;			// 잔액
	public String takeName;		// 받는 사람
	public String accountName;	// 보내는 사람 ; 계좌 주인
	
	public BankAccount() {
		
	}
	
	public BankAccount(int accountNumber, int balance, String accountName, String takeName) {
		this.accountNumber = accountNumber;
		this.balance = balance;
		this.accountName = accountName;
		this.takeName = takeName;
	}

	
	public int getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public String getTakeName() {
		return takeName;
	}

	public void setTakeName(String takeName) {
		this.takeName = takeName;
	}

	public String getAccountName() {
		return accountName;
	}

	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}

	public String showAccount() {
		return "계좌번호 : " + accountNumber + "\t계좌주 : " + accountName + "\t 잔액 : " + balance + " 원";
	}
	
}
