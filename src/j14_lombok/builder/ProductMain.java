package j14_lombok.builder;

public class ProductMain {

	public static void main(String[] args) {
//		Builder builder = new Builder();
//		Product product = builder.builder()
//				.productCode(20220002)
//				.productName("스타벅스 텀블러")
//				.productCategory("텀블러")
//				.createDate("2022-08-02")
//				.build();
		
		//System.out.println(product);
		
		Product product2 = Product.builder()
				.productCode(20220001)
				.productName("수다벅스 머그컵")
				.productCategory("머그컵")
				.createDate("2022-08-01")
				.build();
		
		System.out.println(product2);
		
		
	}

}
