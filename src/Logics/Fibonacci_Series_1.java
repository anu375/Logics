package Logics;

import java.util.Scanner;

public class Fibonacci_Series_1
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();
        
        System.out.println("Enter number you want to enter : ");
        int n = sc.nextInt();

        for(int i=0;i<=n;i++)
        {
            int num3 = num1 + num2;
            
            System.out.println(num1+" + "+num2+" = "+num3);
            num1 = num2;
            num2 = num3;
        }
	}

}
