package j05_입력;

import java.util.Scanner;

public class practive_input {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		/* 
		 * Scanner
		 * 이름: 김준일					next()			name
		 * 나이: 29						nextInt()		age
		 * 주소: 부산 동래구 사직동		nextLine()		address
		 * 연락처: 010-9988-1916 		next()			phone
		 * 
		 * 
		 * 사용자의 이름은 김준일이고 나이는 29살입니다.
		 * 주소는 부산 동래구 사직동에 거주중입니다.
		 * 연락처는 010-9988-1916 입니다.
		 * 
		 * 
		 */
	
		String name = null;
	    int age = 0;
	    String address = null;
	    String phone = null;
	    
	    System.out.print("이름을 입력해 주세요 : ");
	    name = scanner.next(); 
	    // next는 공백 단위로 입력을 받기 때문에 띄어쓰기를 하면 띄어쓰기 하기 전 문자열만 나온다. 
	    //입력 후 엔터를 치면 버퍼(컴퓨터에서 쓰는 임시 저장소)에 엔터값이 하나 남은 상태가 됨. 
	    
	    System.out.print("나이: ");
	    age = scanner.nextInt(); 
	    // 나이를 입력받고 엔터를 치면 입력받은 정수는 나이 변수에 들어가고 버퍼에 엔터값이 하나 더 남는다. 
	    //-> 현재 버퍼에는 엔터 2개 값이 들어있는 상태. 
	    scanner.nextLine(); // 버퍼 초기화 작업 
	    // 남아있는 엔터 값을 지우기 위해 그 값을 대신 받을 nextLine을 입력해 엔터나 공백값을 먹어주고 버퍼를 초기화시켜줘야한다 !!! 
	    // 초기화를 하지 않고 바로 주소를 입력받으면 버퍼에 있던 엔터값이 주소 변수로 들어가버리고 바로 연락처 입력칸이 되어버린다. 
	    
	    System.out.print("주소: ");
		address = scanner.nextLine();
	    
	    System.out.print("연락처: ");
		phone = scanner.next();
	    
	    System.out.println("\n사용자의 이름은 " + name 
	    					+ "이고 나이는 " + age + "살입니다.\n"
	    					+ "주소는 " + address + "에 거주중입니다.\n"
	    					+ "연락처는 " + phone + " 입니다.\n");
		
	}
}
