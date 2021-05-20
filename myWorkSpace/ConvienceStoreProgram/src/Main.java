import java.util.Scanner;
import java.util.*;

public class Main {
  public static void main(String[] args) {
		
		boolean swi = true;
		boolean productChoiceSwi = true;
		boolean swi2 = true;
		while(swi){
			System.out.println("1.상품들 보기");
			System.out.println("2.");
		    System.out.println("3.");
		    System.out.println("4.");
		    System.out.println("5.");
		    System.out.println("6.");
			System.out.println("7. ");
			
      
			Scanner scan = new Scanner(System.in); 
			System.out.print("> ");
			int choice = scan.nextInt();

		switch(choice){
					case 1: // 상품들이 나옴
						
						while(productChoiceSwi) {
							System.out.print("어떤 상품을 찾으시나요? ");
							System.out.print("1.과자 2.마실것 3.아이스크림 4.라면 5.일일배송식품 6.생필품" );
							System.out.print("> ");
							int productChoice = scan.nextInt();
							switch (productChoice) {
								case 1 :
									Snack snack = new Snack();
									snack.PrintProduct();
									break;
								case 2 :
									Drink drink = new Drink();
									drink.PrintProduct();
									break;
								case 3 :
									Icecream icecream = new Icecream();
									icecream.PrintProduct();
									break;
								case 4 :
									Ramen ramen = new Ramen();
									ramen.PrintProduct();
									break;
								case 5 :
									ShortDateFood shortDateFood = new ShortDateFood();
									shortDateFood.PrintProduct();
									break;
								case 6 :
									NoEattings noEattings = new NoEattings();
									noEattings.PrintProduct();
									break;
								case 7:
									System.out.println("메인화면으로 넘어갑니다.");
									productChoiceSwi = false;
									break;
								default : 
									System.out.println("잘못 입력하셨습니다.");
									break;
							}
						}
						
	
					case 2: 
						break;
	
					case 3: 
						Bus bs = new Bus();
				        Scanner sc = new Scanner(System.in);
				        System.out.println("교통카드 요금 충전 프로그램 입니다");
				        
				        while(swi2){
				                System.out.println("1:요금 충전  2:현재 잔액 확인 3. 나가기");
				                int menu = Integer.parseInt(sc.nextLine());
				        switch(menu){
				        case 1: System.out.println("충전하실 금액을 입력해주세요");
				                int coin = Integer.parseInt(sc.nextLine());
				                System.out.println("1 :현재금액으로 충전 ");
				                int charge = Integer.parseInt(sc.nextLine());
				                if(charge==1){
				                    bs.Bus_charge(coin);
				                }
				                break;
				        case 2: bs.Bus_coin_ok(); //현재 잔액을 확인한다.
				                System.out.println("종료하시겠습니까?(Y/N)");
				                String exit_ok = sc.nextLine();
				                bs.Bus_charge_exit(exit_ok);//종료 메서드 실행
				                break;
				        case 3: 
				        	swi2 = false;
							break;
				        }
				    }
						break;
	
					case 4: 
						break;
	
					case 5 : 
						break;
	
					case 6 : 
						break;

        case 7 : // 
					swi = false;
				break;
				default :
					System.out.println("�߸� �Է��ϼ̽��ϴ�.");
				break;
			}
    }
  }
}