package j15_스태틱.싱글톤;

public class SingletonMain {

	public static void main(String[] args) {
		KIA kia = KIA.getInstance();
		KIA kia2 = KIA.getInstance();
		KIA kia3 = KIA.getInstance();
		
		// 셋 다 주소가 다름. 
		
		System.out.println(kia);
		System.out.println(kia2);
		System.out.println(kia3);
		
		kia.produceCar("k3");
		
		
		Test1 test1 = new Test1();
		Test2 test2 = new Test2();
		Test3 test3 = new Test3();
	}

}
