package basicmaths;

import java.util.Scanner;

public class Tester 
{
	public static void main(String[] args) 
	{
		
		try{
			Scanner sc= new Scanner(System.in);
		
			System.out.println("Hey Sambit Lets Start BAsic MATH Programms");
		System.out.println("Enter The Number ---------> " );
		int number = sc.nextInt();
		NumberOperation test = new NumberOperation();
				test.countTheNumberOfDigit(number);
				test.sumOfDigits(number);
				int n= test.reverseNumber(number);
				System.out.println("Reverse Number ----> "+ n);
				test.checkPalindrome(number);
				test.checkEveNOdd(number);
		}
		catch (Exception e) 
		{
			System.err.println("Invaid Number "+e.getMessage());
			// TODO: handle exception
		}
		
	}

}
