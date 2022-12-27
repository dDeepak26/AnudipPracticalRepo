package stringexThurdayPractical;

import java.util.Scanner;

public class ExistinAnother {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter The Text1- ");
		String a = sc.next();
		System.out.println("Enter The Text2- ");
		String b = sc.next();
		
		if (a.contains(b))
		{
			System.out.println("First String Exists in Second String");
		}
		else 
		{
			System.out.println("First String Does not Exists in Second String");
		}

	}

}
