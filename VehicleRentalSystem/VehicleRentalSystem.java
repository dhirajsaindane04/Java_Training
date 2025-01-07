package VehicleRentalSystem;

// Base Vehicle Class
class Vehicle {
    private String vehicleType;
    private String numberPlate;
    private double rentalPricePerDay;

    // Constructor
    public Vehicle(String vehicleType, String numberPlate, double rentalPricePerDay) {
        this.vehicleType = vehicleType;
        this.numberPlate = numberPlate;
        this.rentalPricePerDay = rentalPricePerDay;
    }

    // Getters
    public String getVehicleType() {
        return vehicleType;
    }

    public String getNumberPlate() {
        return numberPlate;
    }

    public double getRentalPricePerDay() {
        return rentalPricePerDay;
    }

    // Method to calculate rental cost
    public double calculateRentalCost(int days) {
        return rentalPricePerDay * days;
    }

    // Display vehicle details
    public void displayDetails() {
        System.out.println("Vehicle Type: " + vehicleType);
        System.out.println("Number Plate: " + numberPlate);
        System.out.println("Rental Price Per Day: $" + rentalPricePerDay);
    }
}

// Subclass: Car
class Car extends Vehicle {
    private int numberOfDoors;

    public Car(String numberPlate, double rentalPricePerDay, int numberOfDoors) {
        super("Car", numberPlate, rentalPricePerDay);
        this.numberOfDoors = numberOfDoors;
    }

    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Number of Doors: " + numberOfDoors);
    }
}

// Subclass: Bike
class Bike extends Vehicle {
    private boolean hasGear;

    public Bike(String numberPlate, double rentalPricePerDay, boolean hasGear) {
        super("Bike", numberPlate, rentalPricePerDay);
        this.hasGear = hasGear;
    }

    public boolean hasGear() {
        return hasGear;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Has Gear: " + (hasGear ? "Yes" : "No"));
    }
}

// Subclass: Truck
class Truck extends Vehicle {
    private double loadCapacity;

    public Truck(String numberPlate, double rentalPricePerDay, double loadCapacity) {
        super("Truck", numberPlate, rentalPricePerDay);
        this.loadCapacity = loadCapacity;
    }

    public double getLoadCapacity() {
        return loadCapacity;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Load Capacity: " + loadCapacity + " tons");
    }
}

// Main Class
public class VehicleRentalSystem {
    public static void main(String[] args) {
        // Create vehicles
        Vehicle car = new Car("ABC1234", 50.0, 4);
        Vehicle bike = new Bike("BIKE567", 15.0, true);
        Vehicle truck = new Truck("TRK890", 100.0, 10.0);

        // Display details and calculate rental cost
        System.out.println("Car Details:");
        car.displayDetails();
        System.out.println("Total Rental Cost for 5 days: $" + car.calculateRentalCost(5));
        System.out.println();

        System.out.println("Bike Details:");
        bike.displayDetails();
        System.out.println("Total Rental Cost for 3 days: $" + bike.calculateRentalCost(3));
        System.out.println();

        System.out.println("Truck Details:");
        truck.displayDetails();
        System.out.println("Total Rental Cost for 7 days: $" + truck.calculateRentalCost(7));
    }
}


