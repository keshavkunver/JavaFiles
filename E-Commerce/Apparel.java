public class Apparel extends Product
{
	private char size;
	private String color;

	public Apparel(String name, double price, int quantity, char size, String color)
	{
		super(name,price,quantity);

		this.size = size;
		this.color = color;
	}

	//accessors
	public char getSize()
	{
		return this.size;
	}

	public String getColor()
	{
		return this.color;
	}

	//mutators	
	public void setSize(char size)
	{
		this.size = size;
	}

	public void setColor(String color)
	{
		this.color = color;
	}

	//implemented abstract function
	public void getDetails()
	{
		System.out.println("We sell different kinds of business clothes for both men and woman");
	}

}