package j13_최상위클래스;

public class StringEquals {

	public static void main(String[] args) {
		String name1 = "김준일";	// 리터럴 값을 조합해서 가져다 쓰는 것임. 조합이 같으면 주소가 같을 수박에
		String name2 = "김준일";
		String name3 = new String("김준일");
		String name4 = name3;
		
		System.out.println("name1: " + name1);
		System.out.println("name2: " + name2);
		System.out.println("name3: " + name3);

		System.out.println("name1 == name2: " + (name1 == name2));	//true
		System.out.println("name1 == name3: " + (name1 == name3));	//false	// string 객체의 주소값이 name3변수에 들어있기 때문임. 
		System.out.println("name3 == name4: " + (name3 == name4));	//true
		
		System.out.println("name1.equals(name2): " + name1.equals(name2));
		System.out.println("name1.equals(name3): " + name1.equals(name3));
		System.out.println("name1.equals(name4): " + name1.equals(name4));
	}

}
