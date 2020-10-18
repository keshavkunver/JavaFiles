import java.util.Scanner;

public class Shop
{
	public static void main(String[] args)
	{
		Product[] products = new Product[5];

		//Apparel
		products[0] = new Product("Business Ritual Women's Long Sleeve Top",
						65.39,"Apparel",4,'L',"Blue");

		//Book
		products[1] = new Product("The Art of Computer Programming",190.54,
						"Books",9,"Donald E. Knuth");

		//Apparel
		products[2] = new Product("Men's Business Casual Shirt",57.10,"Apparel",
						2,'M',"Teal");

		//Soap
		products[3] = new Product("Organic Turmeric Soap",11.25,"Bath & Beauty",1);

		//Book
		products[4] = new Product("Head First Design Pattern",37.35,"Books",3,
						"Eric Freeman");


		//amount in shopping cart
		double totalAmount = 0.0;
		int userInput = 9;

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

			//check if 0 <= int <= 4
			if(userInput >= 0 && userInput <= 4)
			{
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
			//invalid input
			else
			{
				System.out.println("\nThank you for shopping with us! The total amount is " + totalAmount);
				break;
			}
		}

		//scan.close();
	}
}