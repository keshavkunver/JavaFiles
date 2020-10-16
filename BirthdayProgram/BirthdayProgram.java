/*
* 1. Gets user's age 
* 2. Checks if it's their birthday and increments age if so
* 3. Prints statement by checking conditions:
* (user <= 18), (18 < user < 40), (user = 45 or user = 50), (else: > 40)
*/

import java.util.Scanner;

public class BirthdayProgram
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		int age;
		boolean birthday;

		//Age input
		System.out.println("What is your age?");
		age = scan.nextInt();

		//Check birthday today
		System.out.println("It is your birthday today. True or False?");
		//update if needed
		if(scan.next().equalsIgnoreCase("true"))
		{
			birthday = true;
			age++;
		}
		else
			birthday = false;

		if(age <= 18)
			System.out.println("User is 18 or younger");
		else if(age < 40)
			System.out.println("User is between 19 and 39");
		else if(age == 45 || age == 50)
			System.out.println("User is either 45 or 50");
		else
			System.out.println("User is older than 40");
	}
}