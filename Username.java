/* Enter name and print its length and characters from name */
import java.util.Scanner;

class Username
{
	public static void main(String[] args) throws InterruptedException
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your name = ");
		String name = sc.next().toUpperCase();

		int uLen = name.length();
		System.out.println("Name = "+name+" Length = "+uLen);

		for(int i =0; i<uLen; i++)
		{
			System.out.print(name.charAt(i));
			Thread.sleep(1000);
		}
	}

}