import java.util.Scanner;
public class num{
   public static void main (String [] args)
        {
		Scanner scanner = new Scanner(System.in);
		
		int num1, num2;
		System.out.println("Enter in 2 Numbers");

		num1 = scanner.nextInt();
		num2 = scanner.nextInt();

		if(num1 < num2){
			while(num1 <= num2){
				if ((num1 % 2) != 0)
				System.out.println(num1);
				num1++;
				}	
		}
	}
}

//import for system.in.read