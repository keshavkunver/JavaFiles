public class Bath extends Product
{
	//no private attributes

	public Bath(String name, double price, int quantity)
	{
		super(name,price,quantity);
	}

	public void getDetails()
	{
		System.out.println("We sell organic bath products!");
	}
}