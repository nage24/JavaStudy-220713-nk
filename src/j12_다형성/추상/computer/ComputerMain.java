package j12_다형성.추상.computer;

public class ComputerMain {

	public static void main(String[] args) {
		Computer c1 = new Laptop();
		Computer c2 = new DesktopImpl();
		
		c1.onDisplay();
		c1.onKeyPress();
		
		c2.onDisplay();
		c2.onKeyPress();
		
		( (Desktop) c2 ).onMouseClick(); // 마우스 클릭은 데스크탑 클래스에 있으니 데스크탑 클래스로 다운캐스팅 해준것임. 
		
		//추상 클래스에서 일반변수 일반메소드 선언해줄 수도 있댜. 
		
		c2.onSound();
		
	}

}
