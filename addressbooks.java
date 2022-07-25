package com.BridgeLabz.AddressBook;

import java.util.Scanner;

public class addressbooks {
	 String firstName,lastName,address,city,state,zip,emailId;
	 long phoneNumber;
		Scanner scanner = new Scanner(System.in);
	void askUser() {
			System.out.println("Select an action..");
			System.out.println("1. Add a person");
			System.out.println("2. Edit");
			System.out.println("2. Quit");
			int choice = scanner.nextInt();	
		switch(choice) {
		case 1:
			addPerson();
			System.out.println("\n");
			askUser();
			break;
			
			default:
			break;
			
		case 2:
				edit();
				System.out.println("\n");
				askUser();
				break;
	
		}
	}
		void addPerson() {
	       
			Scanner sc=new Scanner(System.in);

			System.out.println("Enter first name: ");
			firstName=sc.nextLine();

			System.out.println("Enter last name: ");
			lastName=sc.nextLine();

	        System.out.println("Enter address: ");
	        address=sc.nextLine();
	        
	        System.out.println("Enter city: ");
	        city=sc.nextLine();
	        
	        System.out.println("Enter state: ");
	        state=sc.nextLine();
	           
	        System.out.println("Enter email id: ");
	        emailId=sc.nextLine();
	                  
	        System.out.println("Enter zip code");
	         zip=sc.next();
	        
	        System.out.println("Enter phone number");
	        phoneNumber=sc.nextLong();
	         
	        
	      
	        System.out.println("Name:"+firstName+" "+lastName);
	        System.out.println("Address:"+address);
	        System.out.println("City:"+city);
	        System.out.println("State:"+state);
	        System.out.println("Phone Number:"+ phoneNumber);
	        System.out.println("Email Id:"+ emailId);
     	}
     	
     	void edit() {
    		System.out.println("What do you want to edit?");
    		System.out.println("1. Address");
    		System.out.println("2. Phone Number");
    		
    		int choice = scanner.nextInt();
    		switch (choice) {
    		case 1:
    			System.out.print("Enter address: ");
    			scanner.nextLine();
    			
    			 address = scanner.nextLine();
    			System.out.print("Enter city, state and zip: ");
    			 city = scanner.next();
    			state = scanner.next();
    			 zip = scanner.next();
    			break;

    		case 2:
    			System.out.println("Enter phone number: ");
    			 phoneNumber = scanner.nextLong();
    			
    			break;
    		}
    		System.out.println("Contact updated successfully");
    		
    		System.out.println("Name:"+firstName+" "+lastName);
 	        System.out.println("Address:"+address);
 	        System.out.println("City:"+city);
 	        System.out.println("State:"+state);
 	        System.out.println("Phone Number:"+ phoneNumber);
 	        System.out.println("Email Id:"+ emailId);
    	}
	    
	        public static void main(String[] args) {
	        	
	        	 System.out.println("Welcome to Address Book Program!\n");
	        	
	        	addressbooks Addressbooks= new addressbooks();
	        	Addressbooks.askUser();
	 
	         
	        
	}
    }


	     
	    
