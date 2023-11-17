package pl.gornik.model;

public class Book extends Product {
    private String author;

    public Book(String title, double count, double price, String author) {
        super(title, count, price);
        this.author = author;
    }

    @Override
    public String displayProduct() {
        return super.displayProduct()+" autor= "+author;
    }
}
