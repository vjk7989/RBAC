public class Book {
    private String title;
    private String author;
    private String category;
    private String isbn;
    private double price;
    private int pages;

    // Constructor
    public Book(String title, String author, String category, String isbn, double price, int pages) {
        this.title = title;
        this.author = author;
        this.category = category;
        this.isbn = isbn;
        this.price = price;
        this.pages = pages;
    }

    // Getters
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getCategory() {
        return category;
    }

    public String getIsbn() {
        return isbn;
    }

    public double getPrice() {
        return price;
    }

    public int getPages() {
        return pages;
    }

    // Setters
    public void setTitle(String title) {
        this.title = title;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    // Method to categorize book by genre
    public boolean isGenre(String genre) {
        return this.category.equalsIgnoreCase(genre);
    }

    // Method to categorize book by price range
    public String getPriceCategory() {
        if (price < 10) {
            return "Budget";
        } else if (price >= 10 && price < 20) {
            return "Standard";
        } else if (price >= 20 && price < 50) {
            return "Premium";
        } else {
            return "Luxury";
        }
    }

    // Method to categorize book by length
    public String getBookLength() {
        if (pages < 200) {
            return "Short";
        } else if (pages >= 200 && pages < 400) {
            return "Medium";
        } else {
            return "Long";
        }
    }

    // Method to get book summary
    public String getBookSummary() {
        return "Title: " + title + 
               "\nAuthor: " + author + 
               "\nCategory: " + category + 
               "\nISBN: " + isbn + 
               "\nPrice: $" + price + 
               "\nPages: " + pages + 
               "\nPrice Category: " + getPriceCategory() + 
               "\nBook Length: " + getBookLength();
    }

    // Method to display book info
    public void displayBook() {
        System.out.println("========================================");
        System.out.println(getBookSummary());
        System.out.println("========================================");
    }

    public static void main(String[] args) {
        // Create some book objects
        Book book1 = new Book("The Great Gatsby", "F. Scott Fitzgerald", "Fiction", "978-0743273565", 12.99, 180);
        Book book2 = new Book("Introduction to Algorithms", "Thomas H. Cormen", "Technology", "978-0262033848", 89.99, 1312);
        Book book3 = new Book("Sapiens", "Yuval Noah Harari", "Non-Fiction", "978-0062316097", 18.99, 464);
        Book book4 = new Book("The Hobbit", "J.R.R. Tolkien", "Fantasy", "978-0547928227", 14.99, 310);

        // Display all books
        System.out.println("=== BOOK COLLECTION ===\n");
        book1.displayBook();
        book2.displayBook();
        book3.displayBook();
        book4.displayBook();

        // Categorize by genre
        System.out.println("\n=== BOOKS BY GENRE ===");
        System.out.println("Is book1 Fiction? " + book1.isGenre("Fiction"));
        System.out.println("Is book2 Technology? " + book2.isGenre("Technology"));

        // Show categorization examples
        System.out.println("\n=== PRICE CATEGORIZATION ===");
        System.out.println(book1.getTitle() + " - " + book1.getPriceCategory());
        System.out.println(book2.getTitle() + " - " + book2.getPriceCategory());
        System.out.println(book3.getTitle() + " - " + book3.getPriceCategory());
        System.out.println(book4.getTitle() + " - " + book4.getPriceCategory());

        System.out.println("\n=== LENGTH CATEGORIZATION ===");
        System.out.println(book1.getTitle() + " - " + book1.getBookLength());
        System.out.println(book2.getTitle() + " - " + book2.getBookLength());
        System.out.println(book3.getTitle() + " - " + book3.getBookLength());
        System.out.println(book4.getTitle() + " - " + book4.getBookLength());
    }
}
