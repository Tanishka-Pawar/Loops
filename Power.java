/*Power of a number 2^3=8 */

import java.util.Scanner;

class Power
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number = ");
		int num = sc.nextInt();

		System.out.print("Enter the power = ");
		int power = sc.nextInt();
		int ans =1;

		for(int i=1;i<=power; i++)
		{
			//ans = ans*num;
			ans*= num;
		}

		System.out.println("Power "+power+" of a number "+num+" is = "+ans);

		//using built in fuction
		System.out.println(num+" ^ "+power+" = "+(int)(Math.pow(num,power)));
		
	}
}