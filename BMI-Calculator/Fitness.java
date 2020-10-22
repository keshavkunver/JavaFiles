public class Fitness
{
	public static void main(String[] args)
	{
		//object 1
		Person tom = new Person("Tom",'H',152.5,5,6);

		//object 2
		Person leslie = new Person("Leslie","Knope",'K',32,122.9,4,11);

		//object 3
		Person ron = new Person("Ron","Swanson",222.2,6,0);

		//object 4
		Person april = new Person("April","Ludgate",110.5,5,5);

		//print each person's BMI information using toString() method
		System.out.println(tom.toString());
		System.out.println(leslie.toString());
		System.out.println(ron.toString());
		System.out.println(april.toString());

		//System.out.println(tom.getFirstName() + ": " + tom.calculateBMI());
		//System.out.println(leslie.getFirstName() + ": " + leslie.calculateBMI());
		//System.out.println(ron.getFirstName() + ": " + ron.calculateBMI());
		//System.out.println(april.getFirstName() + ": " + april.calculateBMI());
	}
}