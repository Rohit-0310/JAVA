package com.masai.arraylist;

public class MobilePhoneRunner {

	public static void main(String[] args) {
		MobilePhone contact1 = new MobilePhone("Bob", 31415926, 16180339);
		MobilePhone contact2 = new MobilePhone("Alice", 16180339);
		MobilePhone contact3 = new MobilePhone("Tom", 11235813);
		MobilePhone contact4 = new MobilePhone("Jane", 23571113);
		
		System.out.println(contact1);
		
		contact1.addNewContact(11235813);
		System.out.println(contact1);
		
		
		contact1.removeContact(1);
		
		
		System.out.println(contact1);
		
	}

}
