import java.util.Scanner;

class ReverseNum
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter any number = ");
		int num = sc.nextInt();

		int rev =0, rem, temp=num;
		
		for(; num>0; )
		{
			rem = num%10;
			rev = rev*10+rem;
			num = num/10;
		}
		System.out.println("Reverse of "+temp+" is = "+rev);
	}
}