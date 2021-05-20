import java.util.Scanner;
import java.util.*;

public class Main {
  public static void main(String[] args) {
		boolean swi = true;
		Snack snack = new Snack();
		Drink drink = new Drink();
		Icecream icecream = new Icecream();
		FrozenFood frozenFood = new FrozenFood();
		Calculator calculator = new Calculator();
		Ramen ramen = new Ramen();
		ShortDateFood shortDateFood = new ShortDateFood();

    // ���
		while(swi){
			System.out.println("1.");
			System.out.println("2. 계산");
			System.out.println("3.");
			System.out.println("4.");
			System.out.println("5.");
			System.out.println("6.");
			System.out.println("7. 종료");
			
      
			Scanner scan = new Scanner(System.in); 
			System.out.print("> ");
			int choice = scan.nextInt();



      switch(choice){
				case 1:
				break;

				case 2: 
					while(swi){
						
				//		System.out.println("원하시는 제품을 선택해 주세요.");
						System.out.println("1." + snack.id[1]);
						System.out.println("2." + drink.id[6]);
						System.out.println("3." + icecream.id[11]);
						System.out.println("4." + frozenFood.id[16]);
						System.out.println("5." + ramen.id[21]);
						System.out.println("6." + shortDateFood.id[26]);
						
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
						    
							default :
							System.out.println("잘못 입력 했습니다.");
							break;
							}
						}
				break;

				case 3: 
				break;

				case 4: 
				break;

				case 5 : 
				break;

				case 6 : 
				break;

        case 7 : // 나가기
					swi = false;
				break;
				default :
					System.out.println("잘못 입력 했습니다.");
				break;
			}
    }
  }
}
