package com.BridgeLabz.AddressBook;

import java.util.Scanner;

public class addressbooks {
	
	void askUser() {
		Scanner scanner = new Scanner(System.in);	
			System.out.println("Select an action..");
			System.out.println("1. Add a person");
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
	
		}
	}
	
     	void addPerson() {
	       
	       String firstName,lastName,address,city,state,emailId;
	       
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
	        int Zip=sc.nextInt();
	        
	        System.out.println("Enter phone number");
	        long phoneNumber=sc.nextLong();
	         
	        
	      
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


	     
	    
