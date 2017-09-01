import java.io.IOException;

public class num2{


public static void main (String args[]){
int num1=0, num2=0;

try{
System.out.println("input 2 numbers");

num1=System.in.read();
num2=System.in.read();
if (num1 < num2){
	for(int i = num1; i<num2; i++){
		if(i%2!=0)
		System.out.println(i);
		}
	}
}
catch(IOException e){
	System.out.println("Error");
}
	
}
}