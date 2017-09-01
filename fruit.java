import java.util.Scanner;
public class fruit{
   public static void main (String [] args)
        {
		
		String fruits[] = {"Apple","Tomato", "Potato"};
		

		for(int i=0; i< fruits.length; i++){
				System.out.print(fruits[i]);
				if(i != (fruits.length-1))
					System.out.print(", ");
				if(i == (fruits.length -2))
					System.out.print(" and ");
				
				}	
	}
}
//change negation - tweeking code.

//import for system.in.read