class Loop
{
	public static void main(String[] args)
	{
		
		System.out.println("\n\t1 to 10 numbers");
		for(int i=0; i<=10; i++)		
		{
			System.out.print(i+" ");
		}
		System.out.println();

		

		System.out.println("\n\tA to Z upper case Alphabet");
		for(char ch='A'; ch<='Z'; ch++)		
		{
			System.out.print(ch+" ");
		}
		System.out.println();

		System.out.println("\n\tz to a lower case Alphabet");
		for(char ch= 'z'; ch>='a'; ch--)		
		{
			System.out.print(ch+" ");
		}
		System.out.println();



		System.out.println("\n\t 0 to 9 Digits");
		for(char ch='0'; ch<='9'; ch++)		
		{
			System.out.print(ch+" ");
		}
		System.out.println();



		System.out.println("\n\tASCII value with its Character");
		for(int i=0; i<=127; i++)		
		{
			//System.out.print(i+" "+((char)i)+"\t");
		}
		System.out.println();

	}
}