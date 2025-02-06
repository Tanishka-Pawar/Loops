/*enter a number and print sum of even numbers only*/
import java.util.Scanner;

class EvenSum
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter any number = ");
		int num = sc.nextInt();
		int esum = 0, temp = num;

		while(num>0)
		{
			int rem = num%10;
			if(rem%2==0)
			{
				esum += rem;
			}
			num/=10;
		}
		System.out.print("Sum of "+temp+" Even numbers only = "+esum);
	}
}