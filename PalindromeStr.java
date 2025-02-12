/*Enter a string and check wheather it is palindrome or not */

import java.util.Scanner;

class PalindromeStr
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter any string = ");
		String str = sc.next();

		String rev ="";
		for(int i =0; i<str.length();i++)
		{
			 rev = str.charAt(i)+rev;
		}
		
		if(str.equals(rev))
			System.out.println(str+" is a Palindrome String.");
		else
			System.out.println(str+" is not a Palindrome String.");
	}
}