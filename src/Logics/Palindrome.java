package Logics;

public class Palindrome
{

	public static void main(String[] args)
	
	{
		
		String str = "MADAM";
		String reversed = new StringBuilder(str).reverse().toString();
		//System.out.println(str.equals(reversed));
		
		if(str.equals(reversed))
		{
			System.out.println("Palindrome : "+str);
		}
		else
		{
			System.out.println("Not Palindrome");
		}
	}

}
