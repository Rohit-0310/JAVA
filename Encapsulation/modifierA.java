// Java program to showcase the example
// of public access modifier

// import required packages
import java.io.*;
import java.util.*;

// declaring a public class
class A {

	// declaring method m1
	public void m1() { System.out.println("Hello From public Accessed Modifier"); }
}

class modifierA {
	
	// main method
	public static void main(String[] args)
	{
		// creating an object of type class A
		A a = new A();
		
		// accessing the method m1()
		a.m1();
	}
}
