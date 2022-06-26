// Java Program for Method overloading
// By using Different Types of Arguments


// Method Overloading: Compile-time polymorphism


// Class 1
// Helper class
class Helper {

	// Method with 2 integer parameters
	static int Multiply(int a, int b)
	{

		// Returns product of integer numbers
		return a * b;
	}

	// Method 2
	// With same name but with 2 double parameters
	static double Multiply(double a, double b)
	{

		// Returns product of double numbers
		return a * b;
	}

	
	// // Multiplication of 3 numbers
    static int Multiply(int a, int b, int c)
    {
 
        // Return product
        return a * b * c;
    }


}

// Class 2
// Main class
class Main {

	// Main driver method
	public static void main(String[] args)
	{

		// Calling method by passing
		// input as in arguments
		System.out.println(Helper.Multiply(2, 4));
		System.out.println(Helper.Multiply(5.5, 6.3));
		System.out.println(Helper.Multiply(2, 7, 3));
	}
}
