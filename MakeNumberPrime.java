/*Enter a number if it is prime print as it is if not make it prime number*/

import java.util.Scanner;

class MakeNumberPrime
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number = ");
		int num = sc.nextInt();
		int temp = num;

		boolean flag = true;

		for(int i =2; i<num; i++)
		{
			if(num%i==0)
			{
				flag = false;
				num++;
				i = 2;
			}
		}
	
		System.out.println("\nOriginal num  :  New Num");
		System.out.println("\t "+temp+"   :  "+num);

	}
}