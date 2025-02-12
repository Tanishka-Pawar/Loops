import java.util.Scanner;

class EmirpNo
{
	public static void main(String[] args)
	{
		System.out.print("Enter a number = ");
		int num = new Scanner(System.in).nextInt();

		int cnt1 = 0,  cnt2 =0;
		int rev = 0, temp=num;

		for(int i=1; i<num/2; i++)
			if(num%i==0)
				cnt1++;
				

			for(int i=num; i>0; i/=10)
			{
				rev = rev*10+(i%10);
				if(rev%i==0)
				{
					cnt2++;
				}
				
			}
		
		System.out.println("Reverse Num\n\t"+temp+" : "+rev);
		
		if(cnt1 == cnt2)
			System.out.println(temp+" is Emirp number.");
		else
			System.out.println(temp+" is not a Emirp number.");
		
	}
}