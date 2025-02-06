/* Print even numbers from 1 to 100*/
import java.util.Scanner;

class Even
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("How many numbers do you want =  ");
		int num = sc.nextInt();
		
		System.out.println("\t\t-------------------------------------- EVEN NUMBERS ------------------------------------\n");
		//for(int i=2; i<=num; i+=2) --> without condition
		for(int i = 1; i<=num; i++)
		{
			if(i%2==0)
			{
				System.out.print(i+"\t");
				
			}
		}

		
	}

}