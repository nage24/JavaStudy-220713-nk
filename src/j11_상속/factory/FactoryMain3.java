package j11_상속.factory;

public class FactoryMain3 {
	public static void main(String[] args) {
		
		Factory[] factories = new Factory[4];
		factories[0] = new SamsungFactory(1);
		factories[1] = new LGfactory(1);
		factories[2] = new SamsungFactory(2);
		factories[3] = new LGfactory(2);
		
		// 업캐스팅은 
		
		int num = 10;
		double dNum = (double) num;
		
		System.out.println(dNum);
		
		int n = (int) dNum;			// double형을 int로 다운캐스팅 해준 거죠
		
		// 일반 자료형과 다르게 업캐스팅 된 상태에서만 다운캐스팅이 가능함. 
		double d = 3.14;
		int i = (int) d;
		
		SamsungFactory sFactory = new SamsungFactory(1);
		Factory f = sFactory;
		
		// Factory f2 = new Factory(1);
		// SamsungFactory sF2 = (SamsungFactory) f2; // 이거 안 됨. 
		
		
		
		
		
		
	}
}
