/*Sum of Factorial of odd digits of number 123--->7    1=1  3=6*/

import java.util.Scanner;

class Factorial3
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter any number = ");
		int num = sc.nextInt();
		int temp =num;
		int Osum =0;
		
		while(num>0)
		{
			int rem = num%10;
			if(rem%2!=0)
			{
				System.out.println("Remainder: "+rem);
				int fact=1;
				for(int i=1; i<=rem; i++)
				{
					fact*=i;
				}
				System.out.println("Factorial of "+rem+" is = "+fact+"\n");
				Osum +=fact;
			}
			num/=10;
		}
		System.out.println("Sum of Factorial of only odd digits of "+temp+" is = "+Osum);
	}
}