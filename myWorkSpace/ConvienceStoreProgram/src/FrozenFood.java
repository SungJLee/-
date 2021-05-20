
public class FrozenFood  extends Eattings{
	
	
	int tmp = this.code[16];
	
	public FrozenFood() {	// 과자
		this.code[16] = 16;
		this.id[16] = "만두";
		this.date[16] = "6개월";
		this.taste[16] = "김치맛";
		this.price[16] = 3000;
		this.company[16] = "비비고";
	}
	
	public void PrintProduct() {
		System.out.println(" 상품코드 : " + this.code[16] + " 상품명 : " + this.id[16] +  " 맛 : " + this.taste[16] + " 유통기한 : " + this.date[16] + " 가격 : " + this.price[16] + " 종류 : " + this.material[16] + " 회사명 : " + this.company[16] );		
		System.out.println();
	}
	
//	public void AddProduct() {
//		tmp++
//		this.code[tmp]
//		tmp++;
//		
//	}
}
