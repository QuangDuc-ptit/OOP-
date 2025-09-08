import java.util.ArrayList;
import java.util.Scanner;

class Book {
    private String id;
    private String title;
    private String author;
    private double price;

    public Book(String id, String title, String author, double price) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public String getId() { return id; }
    public String getTitle() { return title; }
    public String getAuthor() { return author; }
    public double getPrice() { return price; }

    public void display() {
        System.out.printf("ID: %s | Title: %s | Author: %s | Price: %.2f\n",
                id, title, author, price);
    }
}

// Chương trình chính
public class BookList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Book> bookList = new ArrayList<>();
        int choice;

        do {
            System.out.println("\n===== MENU =====");
            System.out.println("1. Add book");
            System.out.println("2. Show all books");
            System.out.println("3. Search book by title");
            System.out.println("4. Remove book by ID");
            System.out.println("0. Exit");
            System.out.print("Your choice: ");
            choice = sc.nextInt();
            sc.nextLine(); // bỏ ký tự Enter

            switch (choice) {
                case 1: // add book
                    System.out.print("Enter ID: ");
                    String id = sc.nextLine();
                    System.out.print("Enter title: ");
                    String title = sc.nextLine();
                    System.out.print("Enter author: ");
                    String author = sc.nextLine();
                    System.out.print("Enter price: ");
                    double price = sc.nextDouble();

                    bookList.add(new Book(id, title, author, price));
                    System.out.println("Book added!");
                    break;

                case 2: // show all
                    System.out.println("\n--- BOOK LIST ---");
                    for (Book b : bookList) {
                        b.display();
                    }
                    break;

                case 3: // search by title
                    System.out.print("Enter book title to search: ");
                    String searchTitle = sc.nextLine();
                    boolean found = false;
                    for (Book b : bookList) {
                        if (b.getTitle().equalsIgnoreCase(searchTitle)) {
                            b.display();
                            found = true;
                        }
                    }
                    if (!found) System.out.println("Book not found!");
                    break;

                case 4: // remove by id
                    System.out.print("Enter book ID to remove: ");
                    String removeId = sc.nextLine();
                    Book bookToRemove = null;
                    for (Book b : bookList) {
                        if (b.getId().equals(removeId)) {
                            bookToRemove = b;
                            break;
                        }
                    }
                    if (bookToRemove != null) {
                        bookList.remove(bookToRemove);
                        System.out.println("Book removed!");
                    } else {
                        System.out.println("Book not found!");
                    }
                    break;

                case 0:
                    System.out.println("Exiting program!");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }
        } while (choice != 0);

        sc.close();
    }
}
