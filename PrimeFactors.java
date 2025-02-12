import java.util.Scanner;

class PrimeFactors
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter any number = ");
		int num = sc.nextInt();
		int prime=1;

		System.out.print("Prime factor of "+num+" are = ");
		for( int i=2; i<=num; i++)
		{
			if(num%i==0)//factors
			{	
				for(int j=2; j*j<=i; j++)//prime no
				{
					if(i%j==0)
					{	
						prime =0;
						break;
					}
				}
				if(prime==1)
				{
					System.out.print(i+" ");
				}
				num/=i;
			}
		}
		
		
	}
}