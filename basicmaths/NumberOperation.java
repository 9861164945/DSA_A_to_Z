package basicmaths;

public class NumberOperation
{
    public void countTheNumberOfDigit(int n) {

        try 
        {
            int count = 0;   
            while (n > 0) 
            {
                int ldigit = n % 10;
                n = n / 10;
                count++;
            }
            System.out.println("Number of DIgit " + count);
        }
        catch (Exception e)  
        {
            System.err.println("The input Number Should be an Integer");
        }
    }
    public void sumOfDigits(int n) {
    	try {
    		
    	int sum =0;
    		while(n>0) {
    			int ldigit =n%10;
    			sum+=ldigit;
    			n=n/10;
    		}
    		System.out.println("Sum of the Digit :" +sum);
    		
    	}
    	
    	catch (Exception e) 
    	{
    		 System.err.println("The input Number Should be an Integer");
    		  // TODO: handle exception
		}
    	
    }
    
    public void checkPalindrome(int n)
    {
    	boolean isPalindrome =false;
    	try 
    	{
    		int rev= this.reverseNumber(n);
    		if(rev==n) {
    			isPalindrome=true;
    		}
    		if(isPalindrome) {
    			System.out.print(n+ " is a palindrome Number ");
    		}
    		
    	}
    	catch (Exception e) 
    	{
    		System.err.println("Invalid Format");
			// TODO: handle exception
		}
    	
    }
    public void checkArmstrong(int n) {
    	
    }
    public void  findAllDivisor(int n) 
    {
    	
    }
    public void checkPrime(int n) {
    	
    }
    public int  reverseNumber(int n) 
    {
    	int revNum =0;
    	try 
    	{
    		while(n>0) {
    			 int lastDigit =n%10;
    			 revNum =(revNum*10)+lastDigit;
    			 n=n/10;
    		}
    		 
    		
    	}
    	catch(Exception e) {
    		System.err.println("SOmthging wenr twhile reveresing the Number");
    	}
    	return revNum;
    }
    public void checkNeonNumber(int n) {
    	
    }
    public void checkEveNOdd(int n) 
    {
    	try 
    	{
    		if(n%2==0) {
    			System.out.println( n+" is a Even Number");
    		}
    		else {
    			System.out.println( n+" is a Odd Number ");
    		}
    		
    		
    	}
    	catch (Exception e)
    	{
    		System.out.println("Something went Wrong whilechoosing even Odd" +e.getMessage());
    		
			// TODO: handle exception
		}
    	
    }
}
