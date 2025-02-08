/*Factors of a number and cnt of total factors*/

import java.util.Scanner;

class FactorsCnt
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter any number = ");
		int num = sc.nextInt();
		int cnt=0;

		System.out.println("--------------Factors of "+num+"----------------");
		for(int i=1; i<=num; i++)
		{
			if(num%i==0)
			{	
				cnt++;
				System.out.print(i+" ");
			}
		}
		System.out.println("\nTotal Factors of  "+num+" are = "+cnt);
	}
}