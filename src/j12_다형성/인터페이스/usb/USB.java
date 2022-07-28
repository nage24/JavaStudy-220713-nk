package j12_다형성.인터페이스.usb;

public interface USB {
	public String version = "2.0";
	
	public void connect();
	public void disConnect();
	
	// 애네 메소드를 오버라이딩 안하면 만들어 줄수가 없는것임
	// 그러니까 usb에 연결할 애들은 저 메소드를 전부 지녀야 하고, 
	// 컴퓨터에 연결할 대는 이 메소드들을 이욯해서 연결하면
	// 마우스르 연결하든 키보드를 연결하든 바뀌든 말든 할수 있는것임
}
