package pl.gornik.model;

public class Toy extends Product{
    private String minimalAge;

    public Toy(String title, double liczbaSztuk, double cena, String minimalAge) {
        super(title, liczbaSztuk, cena);
        this.minimalAge = minimalAge;
    }

    @Override
    public String displayProduct() {
        return super.displayProduct() + " minimalnyWiek= "+minimalAge;
    }
}
