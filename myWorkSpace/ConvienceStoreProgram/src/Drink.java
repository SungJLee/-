
public class Drink extends Eattings{

	

	
	public Drink() {	// 과자
		this.code[6] = 6;
		this.id[6] = "코카콜라";
		this.date[6] = "6개월";
		this.taste[6] = "단맛";
		this.price[6] = 1200;
		this.size[6] = "200ml";
		this.material[6] = "탄산";
	}
	
	public void PrintProduct() {
		System.out.println(" 상품코드 : " + this.code[6] + " 상품명 : " + this.id[6] +  " 맛 : " + this.taste[6] + " 유통기한 : " + this.date[6] + " 가격 : " + this.price[6] + " 용량 "+this.size[6] +  " 종류 : " + this.material[6]);
		System.out.println();
	}
}