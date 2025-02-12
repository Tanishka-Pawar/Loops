import java.util.Scanner;

class TemperatureConverter
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		double f, cel, kel, rank;
		

		System.out.println("---------------------------------");
		System.out.println("\tTEMPERATURE CONVERTER");
		System.out.println("------------OPTIONS -------------");
		System.out.println("\t1. Fahrenheit");
		System.out.println("\t2. Celsius");
		System.out.println("\t3. Kelvin");
		System.out.println("\t4. Rankine");
		System.out.println("---------------------------------");

		System.out.print("\nEnter the option = ");
		int opt = sc.nextInt();
		
		if(opt==1)
		{
			System.out.println("\n--------------------------------");
			System.out.println("\t    FAHRENHIET");
			System.out.println("------------ OPTIONS -----------");
			System.out.println("\t1. Celsius");
			System.out.println("\t2. Kelvin");
			System.out.println("\t3. Rankine");
			System.out.println("---------------------------------");

			System.out.print("\nEnter temperature in fahrenhiet = ");
			f = sc.nextDouble();
			
			System.out.print("\nEnter the option = ");
			int opt1 = sc.nextInt();

			switch(opt1)
			{
				case 1:
					cel = (f-32)* 5/9;
					System.out.println(f+" fahrenheit : "+cel+" Degree Celcius");
				break;
				case 2:
					kel = (f-32)* 5/9 + 273.15;
					System.out.println(f+" fahrenheit : "+kel+" Kelvin"); 
				break;
				case 3:
					rank = f + 459.67;
					System.out.println(f+" fahrenheit : "+rank+" Rankine");
				break;
				default:
					System.out.println("Invalid Choice.....");
			}
		}
		else if(opt == 2)
		{
			System.out.println("\n--------------------------------");
			System.out.println("\t     CELSIUS");
			System.out.println("------------ OPTIONS -----------");
			System.out.println("\t1. Fahrenheit");
			System.out.println("\t2. Kelvin");
			System.out.println("\t3. Rankine");
			System.out.println("---------------------------------");

			System.out.print("\nEnter temperature in celsius = ");
			cel = sc.nextDouble();

			System.out.print("\nEnter the option = ");
			int opt2 = sc.nextInt();

			switch(opt2)
			{
				case 1:
					f = (cel * 9/5)+32;
					System.out.println(cel+" Degree Celcius : "+f+" fahrenheit");
				break;
				case 2:
					kel = cel + 273.15;
					System.out.println(cel+" Degree Celcius : "+kel+" Kelvin"); 
				break;
				case 3:
					rank = cel * 9/5 +491.67;
					System.out.println(cel+" Degree Celcius : "+rank+" rankine"); 
				break;
				default:
					System.out.println("Invalid Choice.....");
			}
		}
		else if(opt == 3)
		{
			System.out.println("\n--------------------------------");
			System.out.println("\t     KELVIN");
			System.out.println("------------ OPTIONS -----------");
			System.out.println("\t1. Fahrenheit");
			System.out.println("\t2. Celsius");
			System.out.println("\t3. Rankine");
			System.out.println("---------------------------------");

			System.out.print("\nEnter temperature in kelvin = ");
			kel = sc.nextDouble();

			System.out.print("\nEnter the option = ");
			int opt3 = sc.nextInt();

			switch(opt3)
			{
				case 1:
					f = (kel-273.15) * 9/5 +32;
					System.out.println(kel+" Kelvin : "+f+" fahrenheit");
				break;
				case 2:
					cel = kel - 273.15;
					System.out.println(kel+" Kelvin : "+cel+" Degree Celcius"); 
				break;
				case 3:
					rank = kel * 1.8;
					System.out.println(kel+" Kelvin : "+rank+" Rankine"); 
				break;
				default:
					System.out.println("Invalid Choice.....");
			}
		}
		else if(opt == 4)
		{
			System.out.println("\n--------------------------------");
			System.out.println("\t     RANKINE");
			System.out.println("------------ OPTIONS -----------");
			System.out.println("\t1. Fahrenheit");
			System.out.println("\t2. Celsius");
			System.out.println("\t3. Kelvin");
			System.out.println("---------------------------------");

			System.out.print("\nEnter temperature in Rankine = ");
			rank = sc.nextDouble();

			System.out.print("\nEnter the option = ");
			int opt4 = sc.nextInt();

			switch(opt4)
			{
				case 1:
					f = rank - 459.67;
					System.out.println(rank+" Rankine : "+f+" fahrenheit");
				break;
				case 2:
					cel = (rank - 491.67) * 5/9;
					System.out.println(rank+" Rankine : "+cel+" Degree Celsius");
				break;
				case 3:
					kel =  rank * 5/9;
					System.out.println(rank+" Rankine : "+kel+" Kelvin");
				break;
				default:
					System.out.println("Invalid Choice.....");
			}
		}
		else
		{
			System.out.println("Invalid Option.....");
		}


	
			
		
	}
} 