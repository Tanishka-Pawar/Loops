/*Enter a number and cnt frequency of digits */

import java.util.Scanner;

class FreqOfDigit
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter any number = ");
		long num = sc.nextLong();//12312312345
		System.out.println("Number :"+num);

		for(int i=0; i<=9; i++)
		{
			int cnt = 0;
			for(long j =num; j>0; j/=10)
			{
				long rem = j%10;
				if(i==rem)
				{
					cnt++;
				}
			}
			if(cnt!=0)//prints frequency of digit
			{	
				System.out.println("\t"+i+" : "+cnt);
			}
				
		}
	}
}