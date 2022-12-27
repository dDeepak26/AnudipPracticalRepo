package stringexThurdayPractical;

import java.util.Scanner;

public class EqualNotEx {

	public static void main(String[] args) 
	{
	Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter The Text1- ");
		String a = sc.nextLine();
		System.out.println("Enter The Text2- ");
		String b = sc.nextLine();
		
		if(a.equals(b))
		{
			System.out.println("The Text is same");
		}
		else
		{
			System.out.println("The Text is not same");
		}
	}

}
