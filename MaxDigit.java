/* Enter a no of any digits and print largest digit among them */

import java.util.Scanner;

class MaxDigit
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number = ");
		int num = sc.nextInt();

		int max = 0;
		for(int i = num; i>0; i/=10)
		{
			int digit = i%10;;
			if(max<digit)
				max = digit;
			System.out.println("\t"+digit+" : "+max);

		}
		System.out.println("Largest digit from "+num+" is = "+max);
	}
}