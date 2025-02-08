/* find a square root of a number*/

import java.util.Scanner;

class SquareRoot
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number = ");
		int num = sc.nextInt();
		boolean flag = false;

		for(int i=1; i<=num; i++)
		{
			if(i*i==num)
			{
				flag = true;
				System.out.println(i+" is a Perfect Square root for "+num);
			}
			if(i*i>num)
			{
				break;
			}
		}
		
		if(!flag)
		{
			System.out.println(num+" is not having perfect Square root");
		}

		//using built in function
		System.out.println("Square root of "+num+" is = "+(int)(Math.sqrt(num)));
		
		
	}
}