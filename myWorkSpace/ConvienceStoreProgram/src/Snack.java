

public class Snack extends Eattings{

	public Snack() {	// 과자
		this.code[1] = 1;
		this.id[1] = "꼬북칩";
		this.date[1] = "6개월";
		this.taste[1] = "짠맛";
		this.price[1] = 2000;
		this.size[1] = "중";
		this.material[1] = "봉지";
	}

	public void PrintProduct() {
		System.out.println(" 상품코드 : " + this.code[1] + " 상품명 : " + this.id[1] +  " 맛 : " + this.taste[1] + " 유통기한 : " + this.date[1] + " 가격 : " + this.price[1] + " 종류 : " + this.material[1] );		
		System.out.println();
	}
}
