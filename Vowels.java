/*Enter a string and print vowels from it*/

import java.util.Scanner;

class Vowels
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your name = ");
		String name = sc.next().toUpperCase();

		int len = name.length();
		System.out.println("Name : "+name+" Length: "+len);
		
		//for(int i=0; i<name.length();i++)
		//{
			//char ch = str.charAt(i);
			//if(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
				//System.out.println(ch+" : "+i);
		//}

		System.out.println("--------------------- VOWELS -----------------------\n");
		for(int i=0; i<len; i++)
		{
			if(name.charAt(i)=='A' || name.charAt(i)=='E'|| name.charAt(i)=='I'|| name.charAt(i)=='O'|| name.charAt(i)=='U')
			{
				System.out.println("Character : "+name.charAt(i)+" index: "+i+" ");
			}
		}
	
		
	}
}