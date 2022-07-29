package j12_다형성.인터페이스.ATM;

import java.util.Scanner;

public class ATM_Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

		System.out.println("[ATM 서비스 입니다.]");
		System.out.println("실행하실 메뉴를 선택해 주세요.");
		System.out.println("1. 계좌 조회");
		System.out.println("2. 입금");
		System.out.println("3. 출금");
		System.out.print("실행하실 옵션을 골라주세요: ");
		String select = scanner.nextLine();
		
		if(select.equals("1")) {
			
		}else if(select.equals("2")) {
			
		}else if(select.equals("3")) {
			
		}else {
			System.out.println("잘못 선택하셨습니다.");
		}
		

	}

}
