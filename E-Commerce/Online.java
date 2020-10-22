import java.util.Scanner;
import java.util.ArrayList;

public class Online
{
	//static attributes
	static ArrayList<Product> items = new ArrayList<Product>();
	static double totalAmount = 0.0;
	static int userInput = 9;

	public static void main(String[] args)
	{
		//Apparel object
		items.add(new Apparel("Business Women's Long Sleeve Top",65.39,4,'L',"Blue"));

		//Book object
		items.add(new Book("The Art of Computer Programming", 190.54,9,"Donald E. Kruth",
					"Education", "9788-429-1266-48"));

		//Apparel object
		items.add(new Apparel("Men's Business Casual Shirt",57.10,2,'M',"Teal"));

		//Bath object
		items.add(new Bath("Organic Turmeric Soap",11.25,1));

		//Book object
		items.add(new Book("Head First Design Pattern",37.35,3,"Eric Freeman"));

		Scanner scan;

		while(true)
		{
			scan = new Scanner(System.in);
			System.out.println("Enter the product index (0 to 4) you want to buy. To exit the shopping cart, enter any number other than 0 to 4");
			
			//outputs possible selections
			for(int i = 0; i < items.size(); i++)
			{
				System.out.println(i + " : " + items.get(i).getName());
			}

			/*
			* Can also implement above for loop as for-each loop as shown below:
			*
			* int index = 0;
			* for (Product p : products)
			  {
				System.out.println(index + " : " + p.getName());
				index++;
			  }
			*
			*/

			//try to get user input and make sure it is an integer
			try
			{
				userInput = scan.nextInt();
			}
			catch(Exception InputMismatchException)
			{
				System.out.println("Invalid input, exiting the shopping cart! Your total amount is " 
						+ totalAmount);

				//close Scanner and breaks while loop
				scan.close();
				break;
			}

			//checks if index is inbounds or not
			try
			{
				Product temp = items.get(userInput);
			}
			catch(Exception IndexOutOfBoundsException)
			{
				System.out.println("\nThank you for shopping with us! The total amount is " + totalAmount);

				//close Scanner and breaks while loop
				scan.close();
				break;
			}

			//check if product can be bought
			if(items.get(userInput).buy())
			{
				System.out.println("Your purchase was successful");

				totalAmount += items.get(userInput).getPrice();
			}
			else
			{
				System.out.println("Sorry! This product is out of stock.");
			}	
		}
	}
}