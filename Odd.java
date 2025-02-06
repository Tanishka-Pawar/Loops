/* Print odd numbers from 1to 100*/
import java.util.Scanner;

class Odd
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("How amny numbers do you want = ");
		int num = sc.nextInt();
	
		System.out.print("\t\t------------------------------------ ODD NUMBERS -----------------------------------------\n");
		for(int i= 1; i<=num; i++)
		{
			if(i%2!=0)
			{
				System.out.print(i+"\t");
			}
		}
	}
}