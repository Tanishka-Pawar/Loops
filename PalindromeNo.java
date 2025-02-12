/*Check enter no is palindrome or not */

import java.util.Scanner;

class PalindromeNo
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter any number =");
		int num = sc.nextInt();

		int rev =0;
		for(int i =num; i>0;i/=10)
		{
			 rev = rev*10+(i%10);
		}
		
		if(num==rev)
			System.out.println(num+" is a Palindrome number.");
		else
			System.out.println(num+" is not a Palindrome number.");
	}
}