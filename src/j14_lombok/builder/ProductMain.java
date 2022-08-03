package j14_lombok.builder;

public class ProductMain {

	public static void main(String[] args) {
		Builder builder = new Builder();
//		Product product = builder.builder()
//				.productCode(20220002)
//				.productName("스타벅스 텀블러")
//				.productCategory("텀블러")
//				.createDate("2022-08-02")
//				.build();
		
		//System.out.println(product);
		
		Product product2 = builder.builder()
				.productCode(20220803)
				.productName("잉어킹")
				.productCategory("포켓몬")
				.createDate("2022-08-03")
				.build();
		
		System.out.println(product2);
		
		
	}

}
