package com.BridgeLabz.AddressBook;

import java.util.Scanner;

public class addressbooks {

     public static void main(String[] args) {
	        System.out.println("Welcome to Address Book Program!");
	        
	        String firstName,lastName,address,city,state,emailId;
	        long phoneNumber;
			int Zip;
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
	        Zip=sc.nextInt();
	        
	        System.out.println("Enter phone number");
	        phoneNumber=sc.nextLong();
	        sc.close();
	        
	        
	        //printing output  
	        
	        
	        System.out.println("Name:"+firstName+" "+lastName);
	        System.out.println("Address:"+address);
	        System.out.println("City:"+city);
	        System.out.println("State:"+state);
	        System.out.println("Phone Number:"+ phoneNumber);
	        System.out.println("Email Id:"+emailId);
	         

	}
    }


	     
	    
