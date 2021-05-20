
public class ShortDateFood extends Eattings{

	public ShortDateFood() {
		this.code[26] = 26;
		this.id[26] = "참치마요삼각김밥";
		this.date[26] = "2일";
		this.taste[26] = "참치마요";
		this.price[26] = 800;
	
	}
	
	public void PrintProduct() {
		System.out.println(" 상품코드 : " + this.code[26] + " 상품명 : " + this.id[26] +  " 맛 : " + this.taste[26] + " 유통기한 : " + this.date[26] + " 가격 : " + this.price[26]);	
		System.out.println();
	}
}
