import java.util.Scanner;

public class Strings
{
	public static void main(String[] args)
	{
		//1. Take two String inputs from user
		Scanner scan = new Scanner(System.in);

		//2. Take input two different ways (line and one word)
		System.out.println("String one: ");
		String s1 = scan.nextLine();
		System.out.println("String two: ");
		String s2 = scan.next();

		System.out.println();

		//3. Check if s2 is a substring of s1
		if(s1.contains(s2))
			System.out.println("String 2 is a substring of String 1");
		else
			System.out.println("String 2 is NOT a substring of String 1");

		//4. Check if s1 starts with "a"
		if(s1.substring(0).equalsIgnoreCase("a"))
			System.out.println("All is Well");

		//5. Check if s1 ends with "DCI"
		if(s1.substring(s1.length() - 3).equals("DCI"))
			System.out.println("String 1 ends in 'DCI'");
		else
			System.out.println("String 1 does NOT end in 'DCI'");

		//6. Check if String 2 contains "UST"
		if(s2.contains("UST"))
			System.out.println("String 2 contains 'UST'");
		else
			System.out.println("String 2 does NOT contain 'UST'");

		//7. Check if String 1 starts and end with the same character
		if(s1.substring(0,1).equals(s1.substring(s1.length()-1,s1.length())))
			System.out.println("String 1 starts and ends with the same character");
		else
			System.out.println("String 1 does NOT start and end with the same character");

		//8. Check if String 1 and String 2 are the same (case sensitive)
		if(s1.equals(s2))
			System.out.println("Strings 1 and 2 are the same");
		else
			System.out.println("Strings 1 and 2 are NOT the same");

		//9. Check if String 1 and String 2 are the same (case insensitive)
		if(s1.equalsIgnoreCase(s2))
			System.out.println("Strings 1 and 2 are the same (case insensitive)");
		else
			System.out.println("Strings 1 and 2 are NOT the same (case insensitive)");
		
		//10. Proving Strings are immutable
		String s = "Keshav";
		s.concat(" Kunver");

		/* If String s properly concatenates, then strings are not immutable.
		*  Else, Strings are immutable.
		*/
		if(s.equals("Keshav Kunver"))
			System.out.println("Strings are NOT immutable!");
		else
			System.out.println("Strings are immutable :O");

	}
}