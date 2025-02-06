import java.util.Scanner;

class Bank 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		String username1 = null;
		String password1 = null;
		String address = null;
		long contact = 0;
		double balance = 0.0;
		
		for(; ;)
		{
			System.out.println("\n\t*********************************");
			System.out.println("\t            WELCOME         ");
			System.out.println("\t          Qspider BANK        ");
			System.out.println("\n\t************ OPTIONS ***********\n");
			System.out.println("\t\t1. EXISTING USER");
			System.out.println("\t\t2. NEW USER");
			System.out.println("\n\t*******************************\n");
			
			System.out.print("\tEnter option = ");
			int opt = sc.nextInt();
			
			if(opt == 1)
			{
				if(username1 == null)
				{
					System.out.println("\n\t!!!!! Create your Account first !!!!!");
					continue;
				}
				System.err.println("\n\t-------------- LOGIN---------------");
				for(int i=3; i>=1; i--)
				{
					System.out.print("\n\tEnter Username = ");
					String username = sc.next();
					
					System.out.print("\n\tEnter Password = ");
					String password = sc.next();
					
					if(username.equals(username1) && password.equals(password1))
					{
						home:
							for(; ; )
							{
								System.out.println("\n\t*************** HOME PAGE **************\n");
								System.out.println("\t\t1. DEPOSIT");
								System.out.println("\t\t2. WITHDRAW");
								System.out.println("\t\t3. CHECK BALANCE");
								System.out.println("\t\t4. BANK STATEMENTS");
								System.out.println("\t\t5. LOG OUT");
								System.out.println("\n\t****************************************");
								
								System.out.print("\n\tEnter an option = ");
								int opt1 = sc.nextInt();
								
								switch (opt1) 
								{
									case 1:
										System.out.println("\n\t------------------------------------");
										System.out.println("\t             DEPOSIT     ");
										System.out.println("\t------------------------------------");
										
										System.out.print("\n\tEnter the amount = ");
										int deposit = sc.nextInt();
										balance += deposit;
										
										System.out.println("\n\t!!!!!! AMOUNT DEPOSITED SUCCESSFULLY !!!!!!\n");
									break;
									case 2:
										System.out.println("\n\t------------------------------------");
										System.out.println("\t               WITHDRAW     ");
										System.out.println("\t------------------------------------");
										
										System.out.print("\n\tEnter the amount = ");
										int withdraw = sc.nextInt();
										
										System.out.print("\n\tEnter the pin = ");
										String password3 = sc.next();
										
										if(password3.equals(password1))
										{
											if(withdraw<=balance)
											{
												balance -= withdraw;
												System.out.println("\n\t!!!!!! AMOUNT WITHDRAW SUCCESSFULLY !!!!!!\n");
											}
											else
											{
												System.out.println("\n\tINSUFFICIENT BALANCE..........\n");
											}
										}
										else
										{
											System.out.println("\n\tWRONG PIN");
										}
									break;
									case 3:
										System.out.println("\n\t------------------------------------");
										System.out.println("\t            CHECK BALANCE     ");
										System.out.println("\t------------------------------------");
										for(int j=3; j>=1; j--)
										{
											System.out.print("\n\tEnter the pin = ");
											String password2 = sc.next();
											
											if(password2.equals(password1))
											{
												System.out.print("\n\tACCOUNT BALANCE =  "+balance+"rs");
												continue home;
												
											}
											else
											{
												System.out.println("\n\tWRONG PIN.......... LEFT WITH "+(j-1)+" ATTEMPTS");
											}
										}
										System.out.println("\n\tYOUR ACOOUNT HAS BEEN BLOCKED FOR 24 HOURS\n");
										System.exit(0);	
									break;
									case 4:
										System.out.println("\n\t------------------------------------");
										System.out.println("\t             BANK STATEMENTS     ");
										System.out.println("\t------------------------------------");
									break;
									case 5:
										System.out.println("\n\t------------------------------------");
										System.out.println("\t           LOG OUT     ");
										System.out.println("\t------------------------------------");
										System.out.println("\n\tTHANK YOU ......... VISIT AGAIN ...........\n");
										System.exit(0);
									break;
								}
							}
					}
					else
					{
						System.out.println("\n\tINVALID CREDENTIALS.......... LEFT WITH "+(i-1)+" ATTEMPTS");
					}
				}
				
				System.out.println("\n\tTHANK YOU....... NEVER VISIT AGAIN !!!!!!!!!!!!!!!!!!!!!!!");
				System.exit(0);
			}
			else if(opt == 2)
			{
				System.out.println("\n\t------------- CREATE ACCOUNT---------------\n");
				System.out.println("\t              FILL THE DETAILS          ");
				System.out.print("\n\tEnter your Name = ");
				username1 = sc.next();
				System.out.print("\n\tEnter your Password = ");
				password1 =sc.next();
				System.out.print("\n\tEnter your Address(city) = ");
				sc.nextLine();//Buffer
				address = sc.nextLine();
				System.out.print("\n\tEnter your Contact no. = ");
				contact = sc.nextLong();
				System.out.print("\n\tDeposite (some) Amount = ");
				balance = sc.nextDouble();
				System.out.println("\n\t!!!!!! ACCOUNT CREATED SUCCESSFULLY !!!!!!");
				System.err.println("\n\t--------------------------------------------\n");
			}
			else
			{
				System.out.println("\n\tINVALID OPTION ...................");
			}
		}
	}
}
