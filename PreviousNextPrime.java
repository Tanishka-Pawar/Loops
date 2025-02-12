

import java.util.Scanner;

class PreviousNextPrime
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number = ");
		int num = sc.nextInt();
		int prev = 0, next = 0;
		
		//previous prime num
		for(int i=num-1; i>=2; i--)
		{
			boolean flag = true;
			for(int j=2;j<i;j++)
			{
				if(i%j==0)
				{
					flag = false;
					break;
				}
			}
		
			if(flag)
			{
				prev = i;
				break;
			}
		}

		for(int i=num+1; ; i++)
		{
			boolean flag = true;
			for(int j=2;j<i;j++)
			{
				if(i%j==0)
				{
					flag = false;
					break;
				}
			}
		
			if(flag)
			{
				next = i;
				break;
			}
		}

		if(num-prev < next-num)
		{
			System.out.println("------- Previous Prime -------");
			System.out.println("\t"+prev+" : "+num);
		}
		else if(num-prev > next-num)
		{
			System.out.println("------- Next Prime -------");
			System.out.println("\t"+num+" : "+next);
		}
		else
		{
			System.out.println("----- Prev - Num - Next -----");
			System.out.println("\t"+prev+" : "+num+" : "+next);
		}	
	
		
	}
}