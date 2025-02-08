/*Sum of factors of number 10-->1 2 5 10--->18 */

import java.util.Scanner;

class FactorsSum
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter any number = ");
		int num = sc.nextInt();
		int sum=0;
		
		System.out.println("----- Factors of "+num+" -----");
		for(int i =1; i<=num; i++)
		{
			if(num%i==0)
			{
				System.out.println("\t"+i);
				sum+=i;
			}
		}
		System.out.println("Sum of factors of "+num+" is = "+sum);
	}
}