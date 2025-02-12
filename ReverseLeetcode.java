import java.util.Scanner;

class ReverseLeetcode
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter any number = ");
		int num = sc.nextInt();

		long rev =0, temp=num;

		 boolean flag =false;
        	if(num<0)
        	{
            		flag =true;
            		num = Math.abs(num);
        	}

        
        	for(int i =num; i>0; i/=10)
        	{
            		rev = rev*10+(i%10);
        	}
        
       		 if(flag)
            		rev = rev*(-1);

        	if(rev>Integer.MAX_VALUE || rev<Integer.MIN_VALUE)
            		System.out.print("0");
        	else
            		System.out.print((int)rev);



		
		
	}
}