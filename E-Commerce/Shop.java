/**

* Commenting out since we are now using Online 'main' function




import java.util.Scanner;

public class Shop
{
	//see if shop is open
	static boolean isShopOpen = true;

	//amount in shopping cart
	static double totalAmount = 0.0;
	static int userInput = 9;

	public static void main(String[] args)
	{
		if(!isShopOpen)
			return;
		else
		{
			Product[] products = 
			{
				//0 - Apparel
				new Product("Business Ritual Women's Long Sleeve Top",
							65.39,"Apparel",4,'L',"Blue"),
				//1 - Book
				new Product("The Art of Computer Programming",190.54,
							"Books",9,"Donald E. Knuth"),
				//2 - Apparel
				new Product("Men's Business Casual Shirt",57.10,"Apparel",
							2,'M',"Teal"),
				//3 - Soap
				new Product("Organic Turmeric Soap",11.25,"Bath & Beauty",1),
				//4 - Book
				new Product("Head First Design Pattern",37.35,"Books",3,
							"Eric Freeman")
			};

			Scanner scan = new Scanner(System.in);

			while(true)
			{
				System.out.println("Enter the product index (0 to 4) you want to buy. To exit the shopping cart, enter any number other than 0 to 4");
			
				//outputs possible selections
				for(int i = 0; i < products.length; i++)
				{
					System.out.println(i + " : " + products[i].getName());
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

				/**
				//try to get user input and make sure it is an integer
				try
				{
					userInput = scan.nextInt();
				}
				catch(Exception InputMismatchException)
				{
					System.out.println("Invalid input, exiting the shopping cart! Your total amount is " 
							+ totalAmount);
					break;
				}

				//handles valid index/input (0-4)
				try
				{
					Product temp = products[userInput];
				}
				catch(Exception IndexOutOfBoundsException)
				{
					System.out.println("\nThank you for shopping with us! The total amount is " + totalAmount);
					break;
				}

				//check if product can be bought
				if(products[userInput].buy())
				{
					System.out.println("Your purchase was successful");

					totalAmount += products[userInput].getPrice();
				}
				else
				{
					System.out.println("Sorry! This product is out of stock.");
				}
			}

			scan.close();
		}
		
	}
}
*/