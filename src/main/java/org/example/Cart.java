package org.example;

import java.util.Scanner;
import java.util.ArrayList;

public class Cart {
        private ArrayList<String> cart;

        public Cart() {
            // Initialize the ArrayList in the constructor
            cart = new ArrayList<>();
        }

        // Method to add an item to the ArrayList
        public void addItem(String item) {
            cart.add(item);
        }
    public void removeItem(String item) {
        cart.remove(item);
    }
    public void displayCart() {
        if (cart.isEmpty()) {
            System.out.println("Your cart is empty.");
        } else {
            System.out.println("Items in your cart:");
            for (String item : cart) {
                System.out.println("- " + item);
            }
        }
    }
}


