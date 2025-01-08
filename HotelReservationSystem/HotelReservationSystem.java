package HotelReservationSystem;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// Room.java
class Room {
    private int roomNumber;
    private String roomType;
    private boolean isAvailable;
    private double pricePerNight;

    public Room(int roomNumber, String roomType, double pricePerNight) {
        this.roomNumber = roomNumber;
        this.roomType = roomType;
        this.isAvailable = true;
        this.pricePerNight = pricePerNight;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public String getRoomType() {
        return roomType;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void bookRoom() {
        if (isAvailable) {
            isAvailable = false;
            System.out.println("Room " + roomNumber + " has been successfully booked.");
        } else {
            System.out.println("Sorry, Room " + roomNumber + " is not available.");
        }
    }

    public double calculateTotalCharges(int nights) {
        return nights * pricePerNight;
    }

    @Override
    public String toString() {
        return "Room Number: " + roomNumber + ", Type: " + roomType + ", Price per Night: $" + pricePerNight + ", Available: " + (isAvailable ? "Yes" : "No");
    }
}

// Hotel.java
class Hotel {
    private List<Room> rooms;

    public Hotel() {
        rooms = new ArrayList<>();
    }

    // Add rooms to the hotel
    public void addRoom(Room room) {
        rooms.add(room);
    }

    // Display all rooms in the hotel
    public void displayRooms() {
        System.out.println("Available Rooms in the Hotel:");
        for (Room room : rooms) {
            System.out.println(room);
        }
    }

    // Check room availability by room number
    public Room checkRoomAvailability(int roomNumber) {
        for (Room room : rooms) {
            if (room.getRoomNumber() == roomNumber) {
                return room.isAvailable() ? room : null;
            }
        }
        return null; // Room not found
    }

    // Book a room by room number
    public boolean bookRoom(int roomNumber, int nights) {
        Room room = checkRoomAvailability(roomNumber);
        if (room != null) {
            room.bookRoom();
            double totalCharges = room.calculateTotalCharges(nights);
            System.out.println("Total charges for booking " + nights + " night(s): $" + totalCharges);
            return true;
        } else {
            System.out.println("Sorry, Room " + roomNumber + " is not available or does not exist.");
            return false;
        }
    }
}

public class HotelReservationSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Hotel hotel = new Hotel();

        // Add some rooms to the hotel
        hotel.addRoom(new Room(101, "Single", 100));
        hotel.addRoom(new Room(102, "Double", 150));
        hotel.addRoom(new Room(103, "Suite", 250));

        boolean running = true;
        while (running) {
            System.out.println("\nHotel Reservation System:");
            System.out.println("1. View Rooms");
            System.out.println("2. Book Room");
            System.out.println("3. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    hotel.displayRooms();
                    break;
                case 2:
                    System.out.print("Enter room number to book: ");
                    int roomNumber = scanner.nextInt();
                    System.out.print("Enter number of nights: ");
                    int nights = scanner.nextInt();
                    hotel.bookRoom(roomNumber, nights);
                    break;
                case 3:
                    System.out.println("Exiting the system. Thank you for using the Hotel Reservation System.");
                    running = false;
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }

        scanner.close();
    }
}

