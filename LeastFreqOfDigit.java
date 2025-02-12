/*Enter a number and cnt frequency of digits  and print least repeating digit from num*/

import java.util.Scanner;

class LeastFreqOfDigit
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter any number = ");
		long num = sc.nextLong();

		int digit = 0, min = 9;
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

			if(cnt>0 && min>cnt)
			{	
				min = cnt;
				digit = i;
			}	
		}
		
		System.out.println("Least repeating digit is "+digit+" with frequency "+min);
		
	}
}