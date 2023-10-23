package org.example;


import java.io.FileInputStream;
import java.io.FileNotFoundException;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //Introduction to Store Front
        System.out.println("Welcome to the Mad Monarch Online Store!");

        //User Prompts

        System.out.println("What would you like to do?");
        System.out.println("1) Display available products.");
        System.out.println("2) Display cart.");
        System.out.println("3) Exit");
        System.out.println("Select 1, 2, or 3.");


        Scanner scanner = new Scanner (System.in);
        int userChoice = scanner.nextInt();

        //Products page
        switch(userChoice){
        case 1:
        System.out.println("Enter item 'SKU' to add to cart or type letter to choose option below");
        System.out.println("(S)Search"+ " " +"(C)Cart"+ " " +"(B)Back");
        System.out.println("");
        try {
            //bringing the file into main class
            FileInputStream fis = new FileInputStream("src/main/resources/Inventory.txt");
            Scanner fisScanner = new Scanner(fis);
            //loop created to display text
            while (fisScanner.hasNextLine()) {
                String line = fisScanner.nextLine();
                System.out.println(line);
            }
            Scanner userChoice1 = new Scanner(System.in);
            String option = userChoice1.nextLine().toUpperCase();


        //User input
        Scanner scanner = new Scanner (System.in);
        int userChoice = scanner.nextInt();

        //Switch cases for options 1, 2, and 3
        switch (userChoice) {
            case 1:
                //sub menu for users
                int products; // Declare a new variable for the sub menu

                do {
                    System.out.println("The available products are: ");
                    // Call a method from Andres "cart" class to display available products.
                    // cart.displayAvailableProducts();

                    //User prompts
                    System.out.println("What would you like to do?");
                    System.out.println("1) Search or filter products");
                    System.out.println("2) Add a product to your cart");
                    System.out.println("3) Return to the home page");

                     products = scanner.nextInt(); // User input

                     //If-else statements for options 1, 2, and 3.
                     if(products == 1) {
                         //Add a method to search/filter products
                         //cart.searchOrFilterProducts();

                     } else if (products == 2) {
                         //call method to add products to cart
                         // cart.addProductToCart();

                     } else if (products == 3) {
                         //Return to the main menu
                         break;
                     }


                } while (products != 3); //Do while loop runs until this statement is true

                break;

            case 2:
                int cartCheckout;

                do{
                    System.out.println("The items that are currently in your cart are: " );
                    // Call a method in your "cart" class to display the contents of the cart.
                    // cart.displayCart();

                    //User prompt
                    System.out.println("What would you like to do?");
                    System.out.println("1) Checkout");
                    System.out.println("2) Remove products from your cart");
                    System.out.println("3) Return to the home page");

                     cartCheckout = scanner.nextInt(); // User input

                    if(cartCheckout == 1) {
                        System.out.println("Thanks for shopping today! Bye have a beautiful time!");

                    } else if (cartCheckout == 2) {
                        System.out.println("What products do you want to remove?");
                        //Call a method to remove items
                        //cart.removeItemsFromCart;

                    } else if (cartCheckout == 3 ) {
                        //Return to the main menu
                        break;

                    }

                } while (cartCheckout!= 3);


                break;

            case 3:
                System.out.println("Thanks for shopping with us!");
                break;

            default:
                System.out.println("That is not valid.");
                break;
        }



        }
        catch(FileNotFoundException ex){
            System.out.println("Oops, we ran into a problem.");
        }
    }
    }}