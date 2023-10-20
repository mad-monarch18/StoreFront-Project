package org.example;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Enter item 'SKU' to add to cart");
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
        }
        catch(FileNotFoundException ex){
            System.out.println("Oops, we ran into a problem.");
        }
    }
    }