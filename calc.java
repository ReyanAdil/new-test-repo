import java.util.*;

public class calc{
	public static void main(String[] args){
		int input;
		do{

			Scanner scan = new Scanner(System.in);
			System.out.println("1. Add two numbers");
			System.out.println("2. Subtract two numbers");
			System.out.println("3. Exit");
			input = scan.nextInt();
			switch(input){
				case 1:
					System.out.println("Enter two numbers");
					int num1 = scan.nextInt();
					int num2 = scan.nextInt();
					System.out.println("Sum is " + (num1 + num2));
					break;
				case 2:
					num1 = scan.nextInt();
					num2 = scan.nextInt();
					System.out.println("Difference is " + (num1 - num2));
					break;
				case 3: 
					System.exit(0);
				default:
					System.out.println("Invalid Choice");
			}
			System.out.println("-----------------------------");
		}while(input != 2);
		
	}
}