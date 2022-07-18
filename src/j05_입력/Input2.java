package j05_입력;

import java.util.Scanner;

public class Input2 {

	public static void main(String[] args) {
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
		
		Scanner scanner = new Scanner(System.in);
		// 바로 객체를 생성하면서 Ctrl + space바(자동완성 단축키) 눌러주면 알아서 클래스를 불러올 수 있음. 
		
		String name = null;
		int age = 0;
		String address = null;
		String phone = null;
		
		System.out.print("이름: ");
		name = scanner.next(); // 이름을 입력하고 엔터누르면 버퍼에 엔터 하나가 남게 됨
		// next는 공백 단위로 입력을 받기 때문에 띄어쓰기를 하면 띄어쓰기 하기 전 문자열만 나온다.  
		
		System.out.print("나이: ");
		age = scanner.nextInt(); // 버퍼에서 남은 엔터 뒤로 나이를 입력받고 엔터를 치면, 
								 // next 메소드는 엔터를 입력받지 않기 때문에 이름을 입력하고 남은 엔터는 버퍼에 남고 나이로 입력받은 정수가 값으로 들어감. 
								 // 값을 입력하기 위해 또 엔터를 치면 버퍼에 엔터가 또 남게 됨. -> 버퍼에는 현재 엔터 2개 값이 남아있는 상태
		scanner.nextLine(); // 남아있는 엔터나 공백 값을 지우기 위해 그 값을 받을 nextLine을 입력해 엔터와 공백값을 먹어주고 버퍼를 초기화시켜줘야한다! 
		// 초기화를 하지 않고 바로 주소를 입력받으면 버퍼에 있던 엔터값이 주소 변수로 들어가고 바로 연락처 입력칸이 되어버린다. 
		
		System.out.print("주소: ");
		address = scanner.nextLine();
		
		System.out.print("연락처: ");
		phone = scanner.next();
		
		System.out.println("사용자의 이름은 " + name + "이고 나이는 " + age + "살입니다.");
		System.out.println("주소는 " + address + "에 거주중입니다.");
		System.out.println("연락처는 " + phone + " 입니다.");
		
	}

}







