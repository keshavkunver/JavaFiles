public abstract class Product
{
	//declare private variables
	private String name;
	private double price;
	private int quantity;


	//one constructor
	public Product(String name, double price, int quantity)
	{
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}

	//accessor functions
	public String getName()
	{
		return this.name;
	}

	public double getPrice()
	{
		return this.price;
	}

	public int getQuantity()
	{
		return this.quantity;
	}
	
	//mutator functions
	public void setName(String name)
	{
		this.name = name;
	}

	public void setPrice(double price)
	{
		this.price = price;
	}

	public void setQuantity(int quantity)
	{
		this.quantity = quantity;
	}


	//declare abstract function to be initialized in sub-classes
	abstract void getDetails();

	//check if item can be bought
	public boolean buy()
	{
		if(this.quantity > 0)
		{
			this.quantity--;
			return true;
		}
		return false;
	}
}