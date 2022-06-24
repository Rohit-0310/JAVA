
// class Area {

// int length;
// int breadth;

// // constructor to initialize values
// Area(int length, int breadth) {
// 	this.length = length;
// 	this.breadth = breadth;
// }

// // method to calculate area
// public void getArea() {
// 	int area = length * breadth;
// 	System.out.println("Area: " + area);
// }
// }

// class Main {
// public static void main(String[] args) {

// 	Area rectangle = new Area(4, 16);
// 	rectangle.getArea();
// }
// }













// // Java Program to illustrate Private Access Modifier

// // Importing input output classes
// import java.io.*;

// // Main class
// public class Main {

// 	// Input custom string
// 	private String name = "Hello From Private Access Modifier";

// 	// Main driver method
// 	public static void main(String[] args)
// 	{

// 		// Creating an object of Main class
// 		Main obj1 = new Main();

// 		// Displaying the object content as created
// 		// above of Main class itself
// 		System.out.println(obj1.name);
// 	}
// }







// Java Program to illustrate Protected Access Modifier

// Importing input output classes
import java.io.*;

// Main class
public class Main {

// Input custom string
protected String name = "Hello From Protected Access Modifier";
	
// Main driver method
public static void main(String[] args) {
	
	// Creating an object of Main class
	Main obj1 = new Main();
	
	// Displaying the object content as created
	// above of Main class itself
	System.out.println( obj1.name );
	
}
}
