import java.util.Scanner;

class MobilePin
{
	public static void main(String[] args) throws InterruptedException
	{
		Scanner sc = new Scanner(System.in);
		int storePin = 1234;
		int sec = 5000;
		
		OuterLoop:	
		for( ; ;)
		{
			int attempts = 3;
			do
			{
				System.out.print("Enter your pin = ");
				int pin = sc.nextInt();
		
				if(storePin == pin)
				{
					System.out.println("Phone Unlocked....");
					break OuterLoop;		
				}
				else
				{
					System.out.println("Wrong pin...... Left with "+(attempts-1)+" attempts\n");
				}
				
				attempts--;
			}while(attempts>=1);
		
			System.out.println("\nPhone is Locked for "+(sec/1000)+" seconds\n");
			Thread.sleep(sec);
			sec*=2;
		}
		
	}
}