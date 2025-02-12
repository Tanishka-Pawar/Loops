/* enter a number of any digits and check its length if len is even then convert all odd digits of num into even and
	if len is odd then convert all even digits of num into odd */

import java.util.Scanner;

class DigitConversion
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter any number = ");
		int  num = sc.nextInt();

		int temp= num;
		int rem=0,cnt =0;
		
		while(num>0)
		{
			cnt++;
			num/=10;
		}
		System.out.println("\nLength of "+temp+" is = "+cnt);

		String newNum = "";

		if(cnt%2==0)
		{
			System.out.println("\n--------- Length is Even ---------\n");	
			for(int i = temp; i>0 ; i/=10)
			{
				rem = i%10;
				if(rem%2!=0)
					newNum = ++rem + newNum;
				else
					newNum = rem + newNum;
			}
		}
		else
		{
			System.out.println("\n--------- Length is Odd ---------\n");	
			for(int i = temp; i>0 ; i/=10)
			{
				rem = i%10;
				if(rem%2==0)
					newNum = ++rem + newNum;
				else
					newNum = rem + newNum;
			}
		}
		
		System.out.println("\t"+temp+" : "+newNum);	
		
	}
		
}


