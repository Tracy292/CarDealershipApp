package com.pluralsight;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class main {
    public static Scanner userInput = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("..........Welcome to your Dealership application!............");
        System.out.println("what are we doing Today???" +
                " please choose one of these options");
        System.out.println("1. SEll");
        System.out.println("2. LEASE");
        System.out.print("your option here: ");
        int choice = userInput.nextInt();
         if (choice == 1){
             System.out.println("..................Welcome to the Sales page.............");
        System.out.println("How would you like to search?");
        System.out.println("1. VIN");
        System.out.println("2. Make ");
        System.out.println("3. Model");
        System.out.println("4. Price ");
        System.out.println("5. Color");
        System.out.println("6. Mileage");
        System.out.println("7. Vehicle Type");
        System.out.print("Choose an option: ");
        int SalesSearch = userInput.nextInt();

        ArrayList<Vehicle> inventory = new ArrayList<>();

        try (FileReader fileReader = new FileReader("src/main/resources/inventory.csv");
             BufferedReader bufReader = new BufferedReader(fileReader)) {

            bufReader.readLine();

            String input;
            while ((input = bufReader.readLine()) != null) {
                String[] fileSplit = input.split("\\|");
                String vin = fileSplit[0];
                int year = Integer.parseInt(fileSplit[1]);
                String make = fileSplit[2];
                String model = fileSplit[3];
                String vehicleType = fileSplit[4];
                String color = fileSplit[5];
                int odometer = Integer.parseInt(fileSplit[6]);
                double price = Double.parseDouble(fileSplit[7]);

                Vehicle vehicle = new Vehicle(vin, year, make, model, vehicleType, color, odometer, price);
                inventory.add(vehicle);
            }
        } catch (IOException | NumberFormatException e) {
            e.printStackTrace();
        }

        Dealership dealership = new Dealership("", "", "");

        switch (SalesSearch) {
            case 1:
                System.out.print("Enter VIN: ");
                String vin = userInput.next();
                System.out.println(dealership.searchByVin(inventory, vin));
                System.out.print("Would you like to start a contract with this vin?(true/false): ");
                boolean startContract = userInput.nextBoolean();
                 if (startContract){
                     SalesContract salesContract = new SalesContract();
                 }
                break;
            case 2:
                System.out.print("Enter Make: ");
                String make = userInput.next();
                System.out.println(dealership.searchByMake(inventory, make));
                break;
            case 3:
                System.out.print("Enter Model: ");
                String model = userInput.next();
                System.out.println(dealership.searchByModel(inventory, model));
                break;
            case 4:
                System.out.print("Enter Min Price: ");
                double minPrice = userInput.nextDouble();
                System.out.print("Enter Max Price: ");
                double maxPrice = userInput.nextDouble();
                System.out.println(dealership.searchByPriceRange(inventory, minPrice, maxPrice));
                break;
            case 5:
                System.out.print("Enter Color: ");
                String color = userInput.next();
                System.out.println(dealership.searchByColor(inventory, color));
                break;
            case 6:
                System.out.print("Enter Maximum Mileage: ");
                double maxMileage = userInput.nextDouble();
                System.out.println(dealership.searchByMaxMileage(inventory, maxMileage));
                break;
            case 7:
                System.out.print("Enter Vehicle Type: ");
                String vehicleType = userInput.next();
                System.out.println(dealership.searchByVehicleType(inventory, vehicleType));
                break;
            default:
                System.out.println("Invalid choice!");
        }

        userInput.close();
    }else if (choice == 2) {
             System.out.println("..................Welcome to the Leasing page.............");
             System.out.println("How would you like to search?");
             System.out.println("1. VIN");
             System.out.println("2. Make ");
             System.out.println("3. Model");
             System.out.println("4. Price ");
             System.out.println("5. Color");
             System.out.println("6. Mileage");
             System.out.println("7. Vehicle Type");
             System.out.print("Choose an option: ");
             int choice2 = userInput.nextInt();

             ArrayList<Vehicle> inventory = new ArrayList<>();

             try (FileReader fileReader = new FileReader("src/main/resources/inventory.csv");
                  BufferedReader bufReader = new BufferedReader(fileReader)) {

                 bufReader.readLine();

                 String input;
                 while ((input = bufReader.readLine()) != null) {
                     String[] fileSplit = input.split("\\|");
                     String vin = fileSplit[0];
                     int year = Integer.parseInt(fileSplit[1]);
                     String make = fileSplit[2];
                     String model = fileSplit[3];
                     String vehicleType = fileSplit[4];
                     String color = fileSplit[5];
                     int odometer = Integer.parseInt(fileSplit[6]);
                     double price = Double.parseDouble(fileSplit[7]);

                     Vehicle vehicle = new Vehicle(vin, year, make, model, vehicleType, color, odometer, price);
                     inventory.add(vehicle);
                 }
             } catch (IOException | NumberFormatException e) {
                 e.printStackTrace();
             }

             Dealership dealership = new Dealership("", "", "");

             switch (choice2) {
                 case 1:
                     System.out.print("Enter VIN: ");
                     String vin = userInput.next();
                     System.out.println(dealership.searchByVin(inventory, vin));
                     break;
                 case 2:
                     System.out.print("Enter Make: ");
                     String make = userInput.next();
                     System.out.println(dealership.searchByMake(inventory, make));
                     break;
                 case 3:
                     System.out.print("Enter Model: ");
                     String model = userInput.next();
                     System.out.println(dealership.searchByModel(inventory, model));
                     break;
                 case 4:
                     System.out.print("Enter Min Price: ");
                     double minPrice = userInput.nextDouble();
                     System.out.print("Enter Max Price: ");
                     double maxPrice = userInput.nextDouble();
                     System.out.println(dealership.searchByPriceRange(inventory, minPrice, maxPrice));
                     break;
                 case 5:
                     System.out.print("Enter Color: ");
                     String color = userInput.next();
                     System.out.println(dealership.searchByColor(inventory, color));
                     break;
                 case 6:
                     System.out.print("Enter Maximum Mileage: ");
                     double maxMileage = userInput.nextDouble();
                     System.out.println(dealership.searchByMaxMileage(inventory, maxMileage));
                     break;
                 case 7:
                     System.out.print("Enter Vehicle Type: ");
                     String vehicleType = userInput.next();
                     System.out.println(dealership.searchByVehicleType(inventory, vehicleType));
                     break;
                 default:
                     System.out.println("Invalid choice!");
             }

             userInput.close();
         }
}
}




