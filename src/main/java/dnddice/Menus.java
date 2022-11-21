package dnddice;

import java.util.Scanner;

public class Menus {

	Scanner input = new Scanner(System.in);
	
	// Menu
	public void menu() {
		
		boolean menuFlag = true;
		String choice = "";
		int num1;
		
		while (menuFlag) {
			System.out.println("This is a DnD dice roller. Please choose your dice:");
			System.out.println("\t 1. D4");
			System.out.println("\t 2. D6");
			System.out.println("\t 3. D8");
			System.out.println("\t 4. D12");
			System.out.println("\t 5. D20");
			System.out.println("\t 0. Exit application");
			
			choice = this.input.nextLine();
			
			switch (choice) {
			case "1":
				// D4
				System.out.print("D4. Roll how many times?");
				num1 = this.input.nextInt();
				input.nextLine();
				System.out.print("Your rolls are: ");
				System.out.println(Methods.d4(num1));
				break;
			
			case "2":
				// D6
				System.out.print("D6. Roll how many times?");
				num1 = this.input.nextInt();
				input.nextLine();
				System.out.print("Your rolls are: ");
				System.out.println(Methods.d6(num1));
				break;
			
			case "3":
				// D8
				System.out.print("D8. Roll how many times?");
				num1 = this.input.nextInt();
				input.nextLine();
				System.out.print("Your rolls are: ");
				System.out.println(Methods.d8(num1));
				break;
			
			case "4":
				// D12
				System.out.print("D12. Roll how many times?");
				num1 = this.input.nextInt();
				input.nextLine();
				System.out.print("Your rolls are: ");
				System.out.println(Methods.d12(num1));
				break;
			
			case "5":
				// D20
				System.out.print("D20. Roll how many times?");
				num1 = this.input.nextInt();
				input.nextLine();
				System.out.print("Your rolls are: ");
				System.out.println(Methods.d20(num1));
				break;
			
			case "0":
				// Exit
				System.out.println("\r\nShutting down...");
				menuFlag = false;
				break;
				
			default:
				System.out.println("\r\nError, try again below. \r\n");
				break;
			}
		}
		
	}
	
}
