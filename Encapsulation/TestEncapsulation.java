
class Encapsulate {
	// private variables declared
	// these can only be accessed by
	// public methods of class
    
	private String Name;
	private int Roll;
	private int Age;

	// get method for age to access
	public int getAge() { return Age; }

	// get method for name to access
	// private variable Name
	public String getName() { return Name; }

	// get method for roll to access
	// private variable Roll
	public int getRoll() { return Roll; }

	// set method for age to access
	// private variable age
	public void setAge(int newAge) { Age = newAge; }

	// set method for name to access
	// private variable Name
	public void setName(String newName)
	{
		Name = newName;
	}

	// set method for roll to access
	// private variable Roll
	public void setRoll(int newRoll) { Roll = newRoll; }
}

public class TestEncapsulation {
	public static void main(String[] args)
	{
		Encapsulate obj = new Encapsulate();

		// setting values of the variables
		obj.setName("Rohit Kumar");
		obj.setAge(22);
		obj.setRoll(167);

		// Displaying values of the variables
		System.out.println("Name: " + obj.getName());
		System.out.println("Age: " + obj.getAge());
		System.out.println("Roll: " + obj.getRoll());

		// Direct access of Roll is not possible
		// due to encapsulation
		// System.out.println(" roll: " +
		// obj.Name);
	}
}
