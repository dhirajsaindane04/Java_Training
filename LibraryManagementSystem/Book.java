package LibraryManagementSystem;

public class Book {
    private String title;
    private String author;
    private String ISBN;
    private boolean isAvailable;

    public Book(String title, String author, String ISBN) {
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
        this.isAvailable = true;
    }

    public String getTitle() {
        return title;
    }

    public void borrowBook() {
        if (isAvailable) {
            isAvailable = false;
            System.out.println("You have successfully borrowed " + title);
        } else {
            System.out.println(title + " is currently unavailable.");
        }
    }

    public void returnBook() {
        isAvailable = true;
        System.out.println("You have successfully returned " + title);
    }

    public void displayDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("ISBN: " + ISBN);
        System.out.println("Availability: " + (isAvailable ? "Available" : "Not Available"));
    }
}
