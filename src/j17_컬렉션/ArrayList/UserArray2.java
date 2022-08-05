package j17_컬렉션.ArrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import lombok.Getter;

@Getter
public class UserArray2 {
	// 유저 정보 담아줄 리스트랑, 스캐너 가 필요함.
	private List<User> userList;
	private Scanner scanner;

	// 생성자 호출 시 객체를 생성한다.
	public UserArray2() {
		userList = new ArrayList<User>();
		scanner = new Scanner(System.in);
	}

	public void addUser() {
		System.out.print("아이디: ");
		String username = scanner.nextLine();
		System.out.print("비밀번호: ");
		String password = scanner.nextLine();
		System.out.print("이름: ");
		String name = scanner.nextLine();
		System.out.print("이메일: ");
		String email = scanner.nextLine();

		User user = User.builder().username(username).password(password).name(name).email(email).build();

		userList.add(user);
		System.out.println("<<회원 추가 완료.>>\n");
	}

	public void showUser() {
		for (User user : userList) {
			System.out.println("아이디\t> " + user.getUsername());
			System.out.println("비밀번호\t> " + user.getPassword());
			System.out.println("이름\t> " + user.getName());
			System.out.println("이메일\t> " + user.getEmail() + "\n");
		}
		System.out.println("<<더 이상 사용자가 존재 하지 않습니다.>>\n");
	}

	public void removeUser() {
		System.out.print("삭제할 사용자 아이디를 입력하세요: ");
		String findUser = scanner.nextLine();

		for (User user : userList) {
			if (user.getUsername().equals(findUser)) {
				System.out.print("삭제할 사용자 비밀번호를 입력하세요: ");
				String confirmPassword = scanner.nextLine();

				if (user.getPassword().equals(confirmPassword)) {
					userList.remove(user);
					System.out.println("<<사용자 정보가 삭제되었습니다.>>\n");
					return;
				} else {
					System.out.println("<<비밀번호가 틀립니다.>>\n");
					return;
				}
			}
		}
		System.out.println("<<사용자가 존재하지 않습니다.>>\n");
	}

	public static void main(String[] args) {
		UserArray2 userArray2 = new UserArray2();

		while (true) {
			System.out.println("[ 사용자 관리 프로그램 }");
			System.out.println("1. 사용자 추가");
			System.out.println("2. 사용자 조회");
			System.out.println("3. 사용자 삭제");
			System.out.println("q. 프로그램 종료");
			System.out.print("옵션을 선택하세요 φ(゜▽゜*)♪ -> ");
			String select = userArray2.scanner.nextLine();
			System.out.println("\n");

			if (select.equals("1")) {
				userArray2.addUser();
			} else if (select.equals("2")) {
				userArray2.showUser();
			} else if (select.equals("3")) {
				userArray2.removeUser();
			} else if (select.equals("q")) {
				System.out.println("<<프로그램을 종료합니다.>>");
				break;
			} else {
				System.out.println("<<해당 옵션은 존재하지 않습니다.>>");
			}
		}
	}
}
