import java.util.Scanner;

class ReverseStr
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter string1 = ");
		String str1 = sc.next().toUpperCase();

		System.out.print("Enter string2 = ");
		String str2 = sc.next().toUpperCase();

		String rev1 ="";
		String rev2 ="";
		
		//Forward
		for(int i=0; i<str1.length();i++)
		{
			rev1 = str1.charAt(i)+rev1;	
		}
		System.out.println("Reverse of "+str1+" is = "+rev1);

		//backword
		for(int i =str2.length()-1; i>=0; i--)
		{
			rev2 = rev2+str2.charAt(i);
		}
		System.out.println("Reverse of "+str2+" is = "+rev2);
	}
}