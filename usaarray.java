import java.io.IOException;
import java.util.Scanner;

public class usaarray{
   public static void main (String [] args)
        {
			int columns = 3, rows =3;
			
			char[][] usa = new char [columns][rows];
			for(int i=0; i < rows; i++){			//assign values to array
				for(int j=0; j<columns; j++){
					if(i==0)
						usa[i][j]='u';
					if(i==1)
						usa[i][j]='s';
					if(i==2)
						usa[i][j]='a';
				}
			}
			Scanner selector=new Scanner(System.in);	
				System.out.println("Do you want to print 'p' or rotate the array 'r'");
				char selection=selector.next().charAt(0);
				while(selection != 'q'){
					if(selection == 'p'){
						for(int a=0; a < rows; a++){			//Print values to array
							for(int b=0; b < columns; b++){
								System.out.println(usa[a][b]);
							}
						}
						System.out.println("Printed---------------------------");
					}
					if(selection == 'r')
					{
						char tmp, tmp2, tmp3, tmp4;
						tmp = usa[0][0];
						tmp2 = usa[1][0];
						tmp3 = usa[2][0];
						tmp4 = usa[2][1];
						usa[0][0] = usa[0][2];
						usa[1][0] = usa[0][1];
						usa[2][0] = tmp;
						usa[0][1] = usa[1][2];
						usa[2][1] = tmp2;
						usa[0][2] = usa[2][2];
						usa[1][2] = tmp4;
						usa[2][2] = tmp3;
					
						for(int a=0; a < rows; a++){			//Print values to array
							for(int b=0; b < columns; b++){
								System.out.println(usa[a][b]);
							}
						}
						System.out.println("Rotated---------------------------");
					}
				selection=selector.next().charAt(0);
				}//end while
			
			
	
	}
}