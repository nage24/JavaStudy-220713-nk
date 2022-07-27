package j12_다형성.추상.computer;

public class DesktopImpl extends Desktop {

	
	// onKeyPress는 Desktop에서 이미 정의가 되어서 오버라이드 안해도 됨. 
	
	@Override
	public void onMouseClick() {
		System.out.println("컴퓨터에서 마우스 클릭을 받음.");
		
	}

	@Override
	public void onDisplay() {
		System.out.println("컴퓨터 화면을 출력함.");
		
	}

}
