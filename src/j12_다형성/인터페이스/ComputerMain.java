package j12_다형성.인터페이스;

import java.util.Scanner;

import j12_다형성.인터페이스.usb.Keyboard;
import j12_다형성.인터페이스.usb.Mouse;

public class ComputerMain {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String select = null;
		ConnectionTerminal connectionTerminal = null;
		
		System.out.println("[컴퓨터 연결 관리]");
		System.out.println("1. 모니터 연결");
		System.out.println("2. 빔프로젝트 연결");
		System.out.println("선택 >> ");
		
		select = scanner.nextLine();
		
		if(select.equals("1")) {
			connectionTerminal = new Moniter();
		}else if(select.equals("2")) {
			connectionTerminal = new BeamProject();
		}else {
			System.out.println("메뉴를 잘 못 설정하셨습니다.");
		}
		
		Computer computer = new Computer(connectionTerminal, new Mouse(), new Keyboard());	// 어떤 객체를 주입을 해 줄건지 ... 
																							// 컴퓨터 인스턴스를 만드느데, 모니터 연결이랑 마우스랑 키보드 전부 연결해준것임. 
		
		// 인터페이스를 왜 스냐 ?? -> 컴퓨터에 터미널 단자랑 USB 단자가 있으면 전부 연결을 해줘야 하는데, 그 단자를 인터페이스로 만들어서 연결을 해 주는 것임. 
		
		computer.powerOn();
	
		
		for(int i = 0; i < 10; i++) {
			try {
				Thread.sleep(100);
			} catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		computer.powerOff();
		
	}

}
