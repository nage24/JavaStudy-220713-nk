package j02_변수와상수;

public class Cast {

	public static void main(String[] args) {
		
		// char -> int -> double -> long 의 순서를 잘 지켜주어야 합니다. (데이터를 담을 수 있는 그릇 크기 순)
		
		//업캐스팅
		char a = '가';
		int b = a;
		double c = b;
		
		System.out.println(b);
		System.out.println(c);
		
		//다운캐스팅
		int d = (int) c; //int 로 double을 변환할 수 없음. 앞에 자료형 명시해준다. 
		char e = (char) d;
		
		System.out.println(d);
		System.out.println(e);

	}

}
