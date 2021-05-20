import java.nio.charset.CoderMalfunctionError;

public class Snack extends Eattings{

	String material[] = new String[6]; 
	
	
	public void snack() {	// 과자
		this.code[1] = 1;
		this.id[1] = "꼬북칩";
		this.date[1] = "6개월";
		this.taste[1] = "짠맛";
		this.price[1] = 2000;
		this.size[1] = "중";
		this.material[1] = "봉지";
	}

}
