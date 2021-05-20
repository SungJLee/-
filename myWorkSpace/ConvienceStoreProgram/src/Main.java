import java.util.Scanner;
import java.util.*;

public class Main {
  public static void main(String[] args) {
		
		
		boolean productChoiceSwi = true;
		boolean swi = true;
		boolean swi2 = true;
		boolean swi3 = true;
		Snack snack = new Snack();
		Drink drink = new Drink();
		Icecream icecream = new Icecream();
		FrozenFood frozenFood = new FrozenFood();
		Calculator calculator = new Calculator();
		Ramen ramen = new Ramen();
		ShortDateFood shortDateFood = new ShortDateFood();
		while(swi){
			System.out.println("1.상품들 보기");
			System.out.println("2.계산하기");
		    System.out.println("3.버스카드충전");
		    System.out.println("4.신상품 추가");
			System.out.println("5. 나가기");
			
      
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
									Snack snack2 = new Snack();
									snack2.PrintProduct();
									break;
								case 2 :
									Drink drink2 = new Drink();
									drink.PrintProduct();
									break;
								case 3 :
									Icecream icecream2 = new Icecream();
									icecream2.PrintProduct();
									break;
								case 4 :
									Ramen ramen2 = new Ramen();
									ramen.PrintProduct();
									break;
								case 5 :
									ShortDateFood shortDateFood2 = new ShortDateFood();
									shortDateFood.PrintProduct();
									break;
								case 6 :
									NoEattings noEattings2 = new NoEattings();
									noEattings2.PrintProduct();
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
						while(swi3){
							
					//		System.out.println("원하시는 제품을 선택해 주세요.");
							System.out.println("1." + snack.id[1]);
							System.out.println("2." + drink.id[6]);
							System.out.println("3." + icecream.id[11]);
							System.out.println("4." + frozenFood.id[16]);
							System.out.println("5." + ramen.id[21]);
							System.out.println("6." + shortDateFood.id[26]);
							System.out.println("7. 나가기"  );
							
							Scanner scan2 = new Scanner(System.in); 
							System.out.print("> ");
							int choice2 = scan2.nextInt();
							
								switch(choice2){
								case 1: calculator.getItems1();
								
								System.out.print("구입할 갯수:  ");
							      int A = scan.nextInt(); 
							      System.out.println(calculator.A * A + " 원입니다.");
							      break;
							    
								case 2: calculator.getItems2();
								  System.out.print("구입할 갯수:  ");
							      int B = scan.nextInt(); 
							      System.out.println(calculator.A * B + " 원입니다.");
							      break;
							    
								case 3: calculator.getItems3();
								  System.out.print("구입할 갯수:  ");
							      int C = scan.nextInt(); 
							      System.out.println(calculator.A * C + " 원입니다.");
							      break;
							    
								case 4: calculator.getItems4();
								  System.out.print("구입할 갯수:  ");
							      int D = scan.nextInt(); 
							      System.out.println(calculator.A * D + " 원입니다.");
							      break;
							    
								case 5: calculator.getItems5();
								  System.out.print("구입할 갯수:  ");
							      int E = scan.nextInt(); 
							      System.out.println(calculator.A * E + " 원입니다.");
							      break;
							    
								case 6: calculator.getItems6();
								
								  System.out.print("구입할 갯수:  ");
							      int F = scan.nextInt(); 
							      System.out.println(calculator.A * F + " 원입니다.");
							      break;
							    
								case 7 : 
								  System.out.println("메인으로 돌아갑니다.");
								  System.out.println("");
								  swi3 = false;
								
								default :
								  System.out.println("잘못 입력 했습니다.");
								  break;
								}
							}
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
						swi = false;
						break;
	
						
					
					default :
						System.out.println("잘못 입력하셨습니다.");
						break;
			}
    }
  }
}