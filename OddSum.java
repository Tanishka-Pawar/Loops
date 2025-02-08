/*enter a number and print sum of odd digits only*/
import java.util.Scanner;

class OddSum
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter any number = ");
		int num = sc.nextInt();
		int Osum = 0, temp = num;

		while(num>0)
		{
			int rem = num%10;
			if(rem%2!=0)
			{
				Osum += rem;
			}
			num/=10;
		}
		System.out.print("Sum of Odd Digits only = "+Osum);
	}
}