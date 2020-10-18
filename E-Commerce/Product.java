public class Product
{
	//declare private variables
	private String name;
	private double price;
	private String category;
	private int quantity;
	private char size;
	private String author;
	private String color;

	//no default constructor, no product with default values

	//apparel product constructor
	public Product(String name, double price, String category, int quantity, char size, String color)
	{
		this.name = name;
		this.price = price;
		this.category = category;
		this.quantity = quantity;
		this.size = size;
		this.color = color;
	}

	//books product constructor
	public Product(String name, double price, String category, int quantity, String author)
	{
		this.name = name;
		this.price = price;
		this.category = category;
		this.quantity = quantity;
		this.author = author;
	}

	//soap product constructor
	public Product(String name, double price, String category, int quantity)
	{
		this.name = name;
		this.price = price;
		this.category = category;
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

	public String getCategory()
	{
		return this.category;
	}

	public int getQuantity()
	{
		return this.quantity;
	}
	
	public char getSize()
	{
		return this.size;
	}

	public String getAuthor()
	{
		return this.author;
	}

	public String getColor()
	{
		return this.color;
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

	public void setCategory(String category)
	{
		this.category = category;
	}

	public void setQuantity(int quantity)
	{
		this.quantity = quantity;
	}

	public void setSize(char size)
	{
		this.size = size;
	}

	public void setAuthor(String author)
	{
		this.author = author;
	}

	public void setColor(String color)
	{
		this.color = color;
	}

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