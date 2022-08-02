package j12_다형성.인터페이스.usb;

public class USBMain {

	public static void main(String[] args) {
		USB usb1 = new Mouse();
        USB usb2 = new Keyboard(); // Mouse, Keyboard 클래스가  USB 인터페이스를 구현하기 때문에 업캐스팅이 가능함. 
        usb1.connect();
        usb2.connect();

	}

}
