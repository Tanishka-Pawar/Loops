/*Enter a number and cnt frequency of digits  and print Highest repeating digit from num*/

import java.util.Scanner;

class HighFreqOfDigit
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter any number = ");
		long num = sc.nextLong();

		int digit =0, max = 0;
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

			if(max<cnt)
			{	
				max = cnt;
				digit = i;
			}	
		}
		
		System.out.println("Highest repeating digit is "+digit+" with frequency "+max);
		
	}
}