// Java Program to illustrate Private Access Modifier

// Importing input output classes
import java.io.*;

// Main class
public class ModifierB {

	// Input custom string
	private String name = "Geeks for Geeks";

	// Main driver method
	public static void main(String[] args)
	{

		// Creating an object of Main class
		ModifierB obj1 = new ModifierB();

		// Displaying the object content as created
		// above of Main class itself
		System.out.println(obj1.name);
	}
}
