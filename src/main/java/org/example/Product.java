package org.example;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
    public class Product {
        private String sku;
        private String productName;
        private double price;
        private String department;

        //Constructor
        public Product(String name, double price) {
        }

        //Getters & Setters
        public String getSku() {
            return sku;
        }

        public void setSku(String sku) {
            this.sku = sku;
        }

        public String getProductName() {
            return productName;
        }

        public void setProductName(String productName) {
            this.productName = productName;
        }

        public double getPrice() {
            return price;
        }

        public void setPrice(double price) {
            this.price = price;
        }

        public String getDepartment() {
            return department;
        }

        //Constructor
        public Product(String sku, String productName, double price, String department) {
            this.sku = sku;
            this.productName = productName;
            this.price = price;
            this.department = department;
        }

        public void setDepartment(String department) {
            this.department = department;
        }

        public static List<Product> loadProductsFromResource(String resourcePath) {
            List<Product> productList = new ArrayList<>();

            try {
                ClassLoader classLoader = Product.class.getClassLoader();
                InputStream inputStream = classLoader.getResourceAsStream(resourcePath);

                if (inputStream != null) {
                    Scanner scanner = new Scanner(inputStream);

                    while (scanner.hasNextLine()) {
                        String line = scanner.nextLine();
                        String[] parts = line.split(",");

                        if (parts.length == 2) {
                            String name = parts[0].trim();
                            double price = Double.parseDouble(parts[1].trim());
                            Product product = new Product(name, price);
                            productList.add(product);
                        }
                    }

                    scanner.close();
                } else {
                    System.out.println("Resource file not found: " + resourcePath);
                }
            } catch (Exception e) {
                System.out.println("An error occurred while reading the file: " + e.getMessage());
            }

            return productList;
        }

        public static void main(String[] args) {
            List<Product> productList = Product.loadProductsFromResource("products.txt");

            
            for (Product product : productList) {
                System.out.println("SKU: " + product.getSku() +
                        ", Product Name: " + product.getProductName() +
                        ", Price: $" + product.getPrice() +
                        ", Department: " + product.getDepartment());
            }
        }
    }



