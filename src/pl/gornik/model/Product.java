package pl.gornik.model;

public class Product {
    private String title;
    private double count;
    private double price;

    public Product(String title, double count, double price) {
        this.title = title;
        this.count = count;
        this.price = price;
    }

    public void setCount(double count) {
        this.count = count;
    }

    public double getCount() {
        return count;
    }

    public double getPrice() {
        return price;
    }

    public String getTitle() {
        return title;
    }

    public double countPrice(){
        return (double) (count*price);
    }

    public String displayProduct() {
        return "tytuł= " + title +
                " liczbaSztuk= " + count+
                " cena= " + price + " zł";
    }
    public double sum (){
        return count + price;
    }
}
