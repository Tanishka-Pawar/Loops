import java.util.Scanner;
class Table
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number = ");
		int num = sc.nextInt();

		System.out.print("Enter the range = ");
		int range = sc.nextInt();

		System.out.println("\n\t Table of "+num);
		System.out.println("\n\t---------------------------------);
		for(int i=1; i<=range; i++)
		{
			System.out.println("\t"+num+" X "+i+" = "+(num*i));
		}
	}
}