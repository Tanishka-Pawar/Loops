/* Enter a no of any digits and print smallest digit among them */

import java.util.Scanner;

class MinDigit
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number = ");
		int num = sc.nextInt();

		int min = 9;
		for(int i = num; i>0; i/=10)//extract in reverse
		{
			int digit = i%10;;
			if(min>digit)
				min = digit;
			System.out.println("\t"+digit+" : "+min);

		}
		System.out.println("Smallest digit from "+num+" is = "+min);
	}
}