import java.util.Scanner;
import java.util.*;

public class Main {
  public static void main(String[] args) {
		
		boolean swi = true;
		boolean swi2 = true;
		
    // ���
		while(swi){
			System.out.println("1.");
			System.out.println("2.");
			System.out.println("3.");
			System.out.println("4.");
			System.out.println("5.");
			System.out.println("6.");
			System.out.println("7. 나가기");
			
      
			Scanner scan = new Scanner(System.in); 
			System.out.print("> ");
			int choice = scan.nextInt();
			swi2  = true;

      switch(choice){
				case 1:
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

				case 2: 
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
					System.out.println("잘못입력하셨습니다.");
				break;
			}
    }
  }
}