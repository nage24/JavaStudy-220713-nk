package j12_다형성.인터페이스.ATM;

public interface ATM {
	
	public int MAX_ATM = 1000000;
	
	public void withdraw(int account);
	
	public void deposit(int account);
	
	public void balance();
	
}
