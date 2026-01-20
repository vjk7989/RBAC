public class Book {
    private String title;
    private String author;
    private String category;
    private double price;
    private int pages;

    public Book(String title, String author, String category, double price, int pages) {
        this.title = title;
        this.author = author;
        this.category = category;
        this.price = price;
        this.pages = pages;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public boolean isFiction() {
        return category.equalsIgnoreCase("Fiction");
    }

    public boolean isNonFiction() {
        return category.equalsIgnoreCase("Non-Fiction");
    }

    public boolean isMystery() {
        return category.equalsIgnoreCase("Mystery");
    }

    public void displayInfo() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Category: " + category);
        System.out.println("Price: $" + price);
        System.out.println("Pages: " + pages);
    }

    public String categorizeBook() {
        if (pages > 500) {
            return category + " (Long Read)";
        } else if (pages > 200) {
            return category + " (Medium Read)";
        } else {
            return category + " (Quick Read)";
        }
    }
}