package com.masai.arraylist;

import java.util.ArrayList;

public class MobilePhone {
	private String name;
	private ArrayList<Integer> contacts = new ArrayList<Integer>();

	
	public MobilePhone(String name, int... contacts) {
		this.name = name;
		for(int contact: contacts)
		{
			this.contacts.add(contact);
			
		}
	}


	
	
	public String toString() {
		return name+ " " + contacts;
	}




	public void addNewContact(int i) {
		contacts.add(i);
		
	}




	public void removeContact(int i) {
		contacts.remove(i);
		
	}
	
	
	
}
