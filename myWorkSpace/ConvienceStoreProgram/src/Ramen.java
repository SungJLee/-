
public class Ramen extends Eattings{
	
	public Ramen() {	// 과자
		this.code[21] = 21;
		this.id[21] = "신라면";
		this.date[21] = "6개월";
		this.taste[21] = "매콤짭짤한맛";
		this.price[21] = 2000;
		this.material[21] = "봉지";
		this.company[21] = "농심";
	}
	public void PrintProduct() {
		System.out.println(" 상품코드 : " + this.code[21] + " 상품명 : " + this.id[21] +  " 맛 : " + this.taste[21] + " 유통기한 : " + this.date[21] + " 가격 : " + this.price[21] + " 종류 : " + this.material[21] + " 회사명 : " + this.company[21]);		
		System.out.println();
	}
}
