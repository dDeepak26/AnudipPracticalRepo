package thurpac_29_12_2022;

import java.util.Scanner;


public class ThrowExceptionEx
{
	 public static void main(String[ ] args) 
	 {
		 Scanner sc= new Scanner(System.in);
		 System.out.println("Enter your Age = ");
		 int age=sc.nextInt();
		 sc.close();
		 //To Throw Exception if the age is below 18
		 if(age<18)
		 	{
			 throw new ArithmeticException("You are not eligible for vote");
		    }
		//if age i above 18
		 else
		 {
			 System.out.println("You are eligible to vote");
		 }
	 }
	 
}