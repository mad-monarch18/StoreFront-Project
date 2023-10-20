package org.example;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
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



        }
        catch(FileNotFoundException ex){
            System.out.println("Oops, we ran into a problem.");
        }
    }
    }}