package org.example;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        System.out.println("Welcome to the Mad Monarch Online Store!");

        System.out.println("What would you like to do?");
        System.out.println("1) Display available products.");
        System.out.println("2) Display cart.");
        System.out.println("3) Exit");
        System.out.println("Select 1, 2, or 3.");

        Scanner scanner = new Scanner (System.in);
        int userChoice = scanner.nextInt();
        List<Product> productList = Product.loadProductsFromResource("Inventory.txt"); //



        switch(userChoice){
        case 1:
        System.out.println("Search Item by SKU, then add to cart");
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


            String option = scanner.nextLine().toUpperCase();
            switch(option) {
                case "S":
                    System.out.println("Enter Product SKU");
                    String searchInput = scanner.nextLine();
                    Product foundProduct = findProductBySKU(productList, searchInput);
                    if (foundProduct != null) {
                        System.out.println("Found product: ");
                        System.out.println("SKU: " + foundProduct.getSku() + "Product Name: " + foundProduct.getProductName() + "Price: $" + foundProduct.getPrice());
                        System.out.print("Add " + foundProduct.getProductName() + " to your cart? (Y/N): ");
                        String addItemToCart = scanner.next().toUpperCase();
                        switch (addItemToCart) {
                            case "Y":
                                System.out.println(foundProduct.getProductName() + "has been added");
                                break;
                            case "N":
                                System.out.println(foundProduct.getProductName() + "did not go into your cart.");
                                break;
                        }
                    } else {
                        System.out.println("No item found");
                    }

                    break;

                case "C":
                    System.out.println("Items in your cart");
                    break;

                case "B":
                    return;
            }}
        catch(FileNotFoundException ex){
            System.out.println("Oops, we ran into a problem.");
        }


    }

    }}