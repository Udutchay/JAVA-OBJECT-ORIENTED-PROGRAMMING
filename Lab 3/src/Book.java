//POSTLAB CHALLENGE 
public class Book {
    private String title;
    private String author;
    private boolean borrowed;
    private static int totalBooksCreated = 0;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.borrowed = false;
        totalBooksCreated++;
    }
    public void borrow() {
        if (borrowed) {
            System.out.println("Refused: '" + title + "' is already borrowed.");
        } else {
            borrowed = true;
            System.out.println("Successfully borrowed: '" + title + "'");
        }
    }
    public void returnBook() {
        if (!borrowed) {
            System.out.println("Refused: '" + title + "' is not currently borrowed.");
        } else {
            borrowed = false;
            System.out.println("Successfully returned: '" + title + "'");
        }
    }


    public static int getTotalBooksCreated() {
        return totalBooksCreated;
    }

    @Override
    public String toString() {
        return "Book Title: " + title + " | Author: " + author + " | Borrowed: " + borrowed;
    }

    public static void main(String[] args){
        Book book1 = new Book("Java Programming", "John Doe");
        Book book2 = new Book("Data Structures", "Jane Smith");
        Book book3 = new Book("Database Systems", "Alan Turing");
        Book book4 = new Book("Algorithms", "Ada Lovelace");

        System.out.println("--- Initial States ---");
        System.out.println(book1);
        System.out.println(book2);

        System.out.println("\n--- Testing Borrowing & Returning ---");
        book1.borrow();
        book1.borrow();
        book1.returnBook();
        book1.returnBook();

        book2.borrow();

        System.out.println("\n--- Final States ---");
        System.out.println(book1);
        System.out.println(book2);
        System.out.println(book3);
        System.out.println(book4);

        // Display static count
        System.out.println("\nTotal books ever created: " + Book.getTotalBooksCreated());
    }
}