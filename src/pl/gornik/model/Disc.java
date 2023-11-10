package pl.gornik.model;

public class Disc extends Product{
    private String wykonawca;
    public Disc(String title, double liczbaSztuk, double cena,String wykonawca) {
        super(title, liczbaSztuk, cena);
        this.wykonawca = wykonawca;
    }

    @Override
    public String displayProduct() {
        return super.displayProduct()+" wykonawca= "+wykonawca;
    }
}
