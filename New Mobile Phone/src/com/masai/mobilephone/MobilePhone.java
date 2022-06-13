package com.masai.mobilephone;

import java.util.ArrayList;

public class MobilePhone {
	
//	private String myNumber;
	private ArrayList<Contact> contacts = new ArrayList<>();
	
	
//	public MobilePhone(String myNumber) {
//		this.myNumber = myNumber;
//	}


	public void addNewContact(Contact contact) {
		contacts.add(contact);
	}
	public String toString() {
		return String.format("Contact List: [%s]", contacts);
	}
	
}
