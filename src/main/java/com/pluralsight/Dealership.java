package com.pluralsight;
import java.util.ArrayList;

public class Dealership {
    private String name;
    private String address;
    private String phoneNumber;

    public Dealership(String name, String address, String phoneNumber) {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    public ArrayList<String> searchByVin(ArrayList<Vehicle> inventory, String vin) {
        ArrayList<String> matchingVehicles = new ArrayList<>();
        for (Vehicle vehicle : inventory) {
            if (vehicle.getVin().equalsIgnoreCase(vin)) {
                matchingVehicles.add(getVehicleInfo(vehicle));
            }
        }
        return matchingVehicles;
    }

    public ArrayList<String> searchByMake(ArrayList<Vehicle> inventory, String make) {
        ArrayList<String> matchingVehicles = new ArrayList<>();
        for (Vehicle vehicle : inventory) {
            if (vehicle.getMake().equalsIgnoreCase(make)) {
                matchingVehicles.add(getVehicleInfo(vehicle));
            }
        }
        return matchingVehicles;
    }

    public ArrayList<String> searchByModel(ArrayList<Vehicle> inventory, String model) {
        ArrayList<String> matchingVehicles = new ArrayList<>();
        for (Vehicle vehicle : inventory) {
            if (vehicle.getModel().equalsIgnoreCase(model)) {
                matchingVehicles.add(getVehicleInfo(vehicle));
            }
        }
        return matchingVehicles;
    }

    public ArrayList<String> searchByPriceRange(ArrayList<Vehicle> inventory, double minPrice, double maxPrice) {
        ArrayList<String> matchingVehicles = new ArrayList<>();
        for (Vehicle vehicle : inventory) {
            if (vehicle.getPrice() >= minPrice && vehicle.getPrice() <= maxPrice) {
                matchingVehicles.add(getVehicleInfo(vehicle));
            }
        }
        return matchingVehicles;
    }

    public ArrayList<String> searchByColor(ArrayList<Vehicle> inventory, String color) {
        ArrayList<String> matchingVehicles = new ArrayList<>();
        for (Vehicle vehicle : inventory) {
            if (vehicle.getColor().equalsIgnoreCase(color)) {
                matchingVehicles.add(getVehicleInfo(vehicle));
            }
        }
        return matchingVehicles;
    }

    public ArrayList<String> searchByMaxMileage(ArrayList<Vehicle> inventory, double maxMileage) {
        ArrayList<String> matchingVehicles = new ArrayList<>();
        for (Vehicle vehicle : inventory) {
            if (vehicle.getOdometer() <= maxMileage) {
                matchingVehicles.add(getVehicleInfo(vehicle));
            }
        }
        return matchingVehicles;
    }

    public ArrayList<String> searchByVehicleType(ArrayList<Vehicle> inventory, String vehicleType) {
        ArrayList<String> matchingVehicles = new ArrayList<>();
        for (Vehicle vehicle : inventory) {
            if (vehicle.getVehicleType().equalsIgnoreCase(vehicleType)) {
                matchingVehicles.add(getVehicleInfo(vehicle));
            }
        }
        return matchingVehicles;
    }

    private String getVehicleInfo(Vehicle vehicle) {
        return "VIN: " + vehicle.getVin() +
                ", Year: " + vehicle.getYear() +
                ", Make: " + vehicle.getMake() +
                ", Model: " + vehicle.getModel() +
                ", Vehicle Type: " + vehicle.getVehicleType() +
                ", Color: " + vehicle.getColor() +
                ", Odometer: " + vehicle.getOdometer() +
                ", Price: " + vehicle.getPrice();
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }
}


