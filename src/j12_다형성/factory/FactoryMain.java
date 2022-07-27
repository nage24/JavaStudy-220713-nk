package j12_다형성.factory;

import java.util.Scanner;

import j11_상속.factory.Factory;
import j11_상속.factory.LGfactory;
import j11_상속.factory.SamsungFactory;

public class FactoryMain {		// main 창에서 삼성이든 엘지든 넣어줄 수 있도록 만들어주는 것이 맞다 이말입니다. 

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		Factory factory = null;
		
		String select = null;
		
		System.out.println("1. 삼성공장");
		System.out.println("2. 엘지공장");
		System.out.print("공장을 선택하세요: ");
		select = scanner.nextLine();
		
		if(select.equals("1")) {
			factory = new SamsungFactory(1);
		}else {
			factory = new LGfactory(1);
		}
		
		FactoryService factoryService = new FactoryService(factory);

		factoryService.factoryStart();
		factoryService.factoryStop();
		
	}

}
