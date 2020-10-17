public class Person
{
	//Declaring all necessary variables
	private String firstName;
	private String lastName;
	private char lastNameInitial;

	private int age;

	private double weight; //in pounds
	private int feet;
	private int inches;

	//default constructor
	public Person()
	{
		this.firstName = "";
		this.lastName = "";
		this.lastNameInitial = '\u0000';

		age = 0;

		this.weight = 0.0;

		this.feet = 0;
		this.inches = 0;
	}

	//full name constructor
	public Person(String firstName, String lastName, double weight, int feet, int inches)
	{
		this.firstName = firstName;
		this.lastName = lastName;
		this.weight = weight;
		this.feet = feet;
		this.inches = inches;
	}

	//lastNameInitial constructor
	public Person(String firstName, char lastNameInitial, double weight, int feet, int inches)
	{
		this.firstName = firstName;
		this.lastNameInitial = lastNameInitial;
		this.weight = weight;
		this.feet = feet;
		this.inches = inches;
	}

	//all attributes constructor
	public Person(String firstName, String lastName, char lastNameInitial, int age, double weight, int feet, int inches)
	{
		this.firstName = firstName;
		this.lastName = lastName;
		this.lastNameInitial = lastNameInitial;
		this.age = age;
		this.weight = weight;
		this.feet = feet;
		this.inches = inches;
	} 

	//accessors
	public String getFirstName()
	{
		return this.firstName;
	}

	public String getLastName()
	{
		return this.lastName;
	}

	public char getLastNameInitial()
	{
		return this.lastNameInitial;
	}

	public int getAge()
	{
		return this.age;
	}

	public double getWeight()
	{
		return this.weight;
	}

	public int getFeet()
	{
		return this.feet;
	}

	public int getInches()
	{
		return this.inches;
	}


	//mutators
	public void setFirstName(String firstName)
	{
		this.firstName = firstName;
	}

	public void getLastName(String lastName)
	{
		this.lastName = lastName;
	}

	public void getLastNameInitial(char lastNameInitial)
	{
		this.lastNameInitial = lastNameInitial;
	}

	public void getAge(int age)
	{
		this.age = age;
	}

	public void getWeight(double weight)
	{
		this.weight = weight;
	}

	public void getFeet(int feet)
	{
		this.feet = feet;
	}

	public void getInches(int inches)
	{
		this.inches = inches;
	}

	//function to calculate person's BMI
	public String calculateBMI()
	{
		//converts standard height to only inches
		int heightInInches = (this.feet*12) + this.inches;
		String bmiLevel;

		//standard BMI formula
		double bmi = (this.weight * 703) / (heightInInches * heightInInches);

		if(bmi < 18.5)
			bmiLevel = "Underweight";
		else if(bmi < 24.9)
			bmiLevel = "Normal";
		else if(bmi < 29.9)
			bmiLevel = "Overweight";
		else 
			bmiLevel = "Obese";

		//returns bmi + corresponding evaluation
		return bmi + ": " + bmiLevel;
	}

















}