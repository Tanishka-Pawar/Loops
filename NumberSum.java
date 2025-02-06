/*enter a number and print sum of digits */

import java.util.Scanner;

class NumberSum
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter any number = ");
		int num = sc.nextInt();
		int sum =0;
		int temp = num;

		while(num>0)
		{
			int rem = num%10;
			sum +=rem;
			num /=10;
		}
		System.out.println("The sum of "+temp+" is = "+sum);
	}
}