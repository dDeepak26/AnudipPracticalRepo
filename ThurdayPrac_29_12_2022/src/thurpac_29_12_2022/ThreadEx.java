package thurpac_29_12_2022;

import java.util.Scanner;

public class ThreadEx extends Thread
{
	
    public void run() 
    {
    	Scanner sc  = new Scanner(System.in);    // use to take input
    	System.out.println("Enter a number to check if it is even or odd = ");
    	int UserInput = sc.nextInt();            // store the input data
    	sc.close(); 			// close the scanner class
    	
    	if((UserInput % 2) != 0) 
    	{ 							// to check number is even or odd
    		System.out.println("The given number is Odd");
    	} 
    	else 
    	{
    		System.out.println("Enetred number is Even");
    	}
    }
    
	public static void main(String args[])
	{
		ThreadEx t = new ThreadEx(); 			// created object of thread class
		t.start(); 								// invoke the new thread 
		System.out.println("Main Thread");
	}
}
