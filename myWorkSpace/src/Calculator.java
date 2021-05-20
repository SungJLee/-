
public class Calculator extends Main{
	int A = 0;
	Snack snack = new Snack();
	Drink drink = new Drink();
	Icecream icecream = new Icecream();
	FrozenFood frozenFood = new FrozenFood();
	Ramen ramen = new Ramen();
	ShortDateFood shortDateFood = new ShortDateFood();
	
	public void getItems1() {
		A = snack.price[1];
		System.out.println("1개의 가격은 : " + A + "원 입니다.");
		}
	
	public void getItems2() {
		A = drink.price[6];
		System.out.println("1개의 가격은 : " + A + "원 입니다.");
		}
	
	public void getItems3() {
		A = icecream.price[11];
		System.out.println("1개의 가격은 : " + A + "원 입니다.");
		}
	
	public void getItems4() {
		A = frozenFood.price[16];
		System.out.println("1개의 가격은 : " + A + "원 입니다.");
		}
	
	public void getItems5() {
		A = ramen.price[21];
		System.out.println("1개의 가격은 : " + A + "원 입니다.");
		}
	
	public void getItems6() {
		A = shortDateFood.price[26];
		System.out.println("1개의 가격은 : " + A + "원 입니다.");
		}
	

}
