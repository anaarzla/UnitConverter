package main;

import java.util.Scanner;

public class Converter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in); //used to get input
        int menuSelection = 0;
        double userQuanity = 0;

        //Main Menu
        while (menuSelection != 4) {
            //Main Menu options
            System.out.println("Please select an option:");
            System.out.println("1.Cups to Teaspoons");
            System.out.println("2.Miles to Kilometers");
            System.out.println("3.US Gallons to Imperial Gallons");
            System.out.println("4.Quit");

            menuSelection = input.nextInt();

           
            switch (menuSelection) {
                case 1:
                	//Cups to Teaspoons            
                	System.out.println("What is the quantity you would like to convert? ");
                		userQuanity = input.nextFloat();
                		double cToT =(48*userQuanity);
                		System.out.println(userQuanity + " cups is " + cToT + " tsp.");
                    break;
                case 2:    
                	//Miles to Kilometers
                    System.out.println("What is the quantity you would like to convert? ");
                    	userQuanity = input.nextFloat();
                    	double mToK = (userQuanity*1.609344); 
                    	System.out.println(userQuanity + " miles is " + mToK + " km.");
                    break;
                case 3: 	
                	//US Gallons to Imperial Gallons
                    System.out.println("What is the quantity you would like to convert? ");
                    	userQuanity = input.nextFloat();
                    	double gToIg = (userQuanity*0.8326738);
                    	System.out.println(userQuanity + " gallons is " + gToIg+" Imperial Gallons.");
                	break;      	
                default:
                	System.out.println("Thanks for playing!");
                	break;
        }

    } 
}
}
