import java.util.Scanner;
import java.util.*;

public class Main {
  public static void main(String[] args) {
		
		boolean swi = true;
		
    // ���
		while(swi){
			System.out.println("1.");
			System.out.println("2.");
      System.out.println("3.");
      System.out.println("4.");
      System.out.println("5.");
      System.out.println("6.");
			System.out.println("7. ������");
			
      
			Scanner scan = new Scanner(System.in); 
			System.out.print("> ");
			int choice = scan.nextInt();

      switch(choice){
				case 1:
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

        case 7 : // ������
					swi = false;
				break;
				default :
					System.out.println("�߸� �Է��ϼ̽��ϴ�.");
				break;
			}
    }
  }
}