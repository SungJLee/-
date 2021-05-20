

public class NoEattings extends Product{

	
	public NoEattings() {	// 과자
		this.code[31] = 31;
		this.id[31] = "치약";
		this.date[31] = "6개월";
		this.price[31] = 2000;
		this.size[31] = "250ml";
	}
	public void PrintProduct() {
		System.out.println(" 상품코드 : " + this.code[31] + " 상품명 : " + this.id[31] +  " 맛 : " + this.taste[31] + " 유통기한 : " + this.date[31] + " 가격 : " + this.price[31] + "크기 : " + this.size[31]);		
		System.out.println();
	}
}

