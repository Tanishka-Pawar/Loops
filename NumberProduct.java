/*enter a number and print product of digits */

import java.util.Scanner;

class NumberProduct
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter any number = ");
		int num = sc.nextInt();
		int product =1;
		int temp = num;

		for(int i=1;i<=num;i++)
		{
			int rem = num%10;
			product *=rem;
			num /=10;
		}
		System.out.println("The product of digits of "+temp+" is = "+product);
	}
}