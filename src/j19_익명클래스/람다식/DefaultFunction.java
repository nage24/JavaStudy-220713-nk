package j19_익명클래스.람다식;

import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public class DefaultFunction {

	public static void main(String[] args) {
		Runnable runnable = () -> {
			System.out.println("runnable인터페이스를 활용한 람다식");
			System.out.println("중괄호 안에 여러 실행문을 작성 할 수 있음");
		};

		runnable.run();
		
		Supplier<Integer> supplier = () -> 100;
		Supplier<Integer> supplier2 = () -> {
			System.out.println("중괄호 안에 다른 실행문도 작성 가능");
			return 100;
		};
		
		// 기본 함수형 인터페이스 Runnable Supplier(Parameter 없음) Consumer(return이 void) 
		
		Consumer<String> consumer = name -> {
			System.out.println("이름: " + name);
		}; // 리턴 없으면 무조건 중괄호 입니다. .. 
		
		consumer.accept("전나경");
		
		Function<Integer, Integer> function = num -> num * num;
		System.out.println(function.apply(10));
		
		Predicate<String> predicate = (str) -> str == null || str.isBlank();
		System.out.println(predicate.test(""));
		
		BiConsumer<Integer, Integer> biConsumer = (num1, num2) -> {	// 파라미터가 2개 이상이면 괄호로 묶어주어야 람다식 작성 가능합니다. 
			System.out.println("num1 + num2 = " + (num1 + num2));
		};
		
		UnaryOperator<Integer> operator = num -> num * num * num;
		System.out.println(operator.apply(2));
		
		BinaryOperator<Integer> operator2 = (num1, num2) -> num1 * num2;
		System.out.println(operator2.apply(10, 2));
		
		
		
	}
}
