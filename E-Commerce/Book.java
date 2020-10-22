public class Book extends Product
{
	private String author;
	private String genre;
	private String isbn;

	public Book(String name, double price, int quantity, String author)
	{
		//call Product class constructor
		super(name,price,quantity);

		this.author = author;
	}

	public Book(String name, double price, int quantity, String author, String genre, String isbn)
	{
		super(name,price,quantity);

		this.author = author;
		this.genre = genre;
		this.isbn = isbn;
	}

	//accessors
	public String getAuthor()
	{
		return this.author;
	}

	public String getGenre()
	{
		return this.genre;
	}

	public String getIsbn()
	{
		return this.isbn;
	}

	//mutators
	public void setAuthor(String author)
	{
		this.author = author;
	}

	public void setGenre(String genre)
	{
		this.genre = genre;
	}

	public void setIsbn(String isbn)
	{
		this.isbn = isbn;
	}

	//implemented abstract function
	public void getDetails()
	{
		System.out.println("We sell books that'll make you smarter at programming");
	}
}

	
