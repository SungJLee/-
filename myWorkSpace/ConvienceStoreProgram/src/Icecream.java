
public class Icecream extends Eattings {

	
	public Icecream() {	// 과자
		this.code[11] = 11;
		this.id[11] = "메로나";
		this.taste[11] = "메론맛";
		this.date[11] = "6개월";
		this.price[11] = 2000;
		this.material[11] = "하드";
	}
	public void PrintProduct() {
		System.out.println(" 상품코드 : " + this.code[11] + " 상품명 : " + this.id[11] +  " 맛 : " + this.taste[11] + " 유통기한 : " + this.date[11] + " 가격 : " + this.price[11] + " 종류 : " + this.material[11]);		
		System.out.println();
	}
}