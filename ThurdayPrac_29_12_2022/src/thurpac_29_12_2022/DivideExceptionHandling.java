package thurpac_29_12_2022;

import java.util.Scanner;

public class DivideExceptionHandling
{

	public static void main(String[] args) 
	{
		try
		{
			// declare and initialize here.
			int i,j,c;
			Scanner sc = new Scanner(System.in);
			
			// input numbers here.
			System.out.print("Enter first number : ");
			i = sc.nextInt();
       
			System.out.print("Enter second number : ");
			j = sc.nextInt();
       
			//throw to catch
			c=i/j;
			System.out.println("Result:"+c);
		}
		catch(ArithmeticException e)
		{
			System.out.println("Error:"+e.getMessage());
			System.out.println("Error:"+e);
		}
		// here program ends.
		System.out.println("End of Program...");

	}

}
