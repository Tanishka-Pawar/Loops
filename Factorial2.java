/*Sum of Factorial of all digits of number 4=24 3=6 2=2 ---> 234-->32*/
import java.util.Scanner;

class Factorial2
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter any number = ");
		int num = sc.nextInt();
		int temp =num;
		int sum =0;
		
		while(num>0)
		{
			int rem = num%10;
			System.out.println("Remainder: "+rem);
		
			int fact=1;
			for(int i=rem; i>=1; i--)
			{
				fact*=i;
			}
			System.out.println("Factorial of "+rem+" is = "+fact+"\n");
			sum +=fact;
			num/=10;
		}
		
		System.out.println("Sum of Factorial of all digits of "+temp+" is = "+sum);
	}
}