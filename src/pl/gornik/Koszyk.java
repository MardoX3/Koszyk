package pl.gornik;

import pl.gornik.model.Book;
import pl.gornik.model.Disc;
import pl.gornik.model.Product;
import pl.gornik.model.Toy;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Koszyk {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();
        products.add(new Book("HarryPotter", 50, 32.99, "J.K. Rowling"));
        products.add(new Book("Tak trzeba żyć", 432, 41.39, "Sławomir Mentzen"));
        products.add(new Book("Medusa, czyli 23 kilometry do…", 65, 18.93, "Meduska"));
        products.add(new Book("CHŁOPKI. OPOWIEŚĆ O NASZYCH BABKACH Twarda", 82, 39.67, "Meduska"));
        Toy toy1 = new Toy("Action Figure 1", 8, 12.50, "3+");
        Toy toy2 = new Toy("Educational Toy", 15, 18.99, "5+");
        Toy toy3 = new Toy("Plush Toy", 10, 14.99, "2+");
        Toy toy4 = new Toy("Building Blocks", 20, 24.99, "4+");
        Disc disc1 = new Disc("Music Album 1", 3, 29.99, "Some Artist 1");
        Disc disc2 = new Disc("Concert Recording", 5, 34.49, "Another Artist");
        Disc disc3 = new Disc("Greatest Hits", 8, 27.99, "Famous Band");
        Disc disc4 = new Disc("Instrumental Collection", 6, 31.99, "Instrumentalist");

        products.add(toy1);
        products.add(toy2);
        products.add(toy3);
        products.add(toy4);
        products.add(disc1);
        products.add(disc2);
        products.add(disc3);
        products.add(disc4);
        List<Product> koszyk = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        boolean check = true;
        double sum = 0;
        while (check) {
            System.out.println("------------------------------");
            System.out.println("Czy chcesz dodac jakis product do koszyka TAK czy NIE lub wpisz KOSZYK");
            System.out.println("------------------------------");
            String choice = scanner.nextLine();

            switch (choice.toLowerCase()) {
                case "tak":
                    for (Product product : products) {
                        System.out.println(product.displayProduct());
                    }
                    System.out.println("------------------------------");
                    System.out.println("Wpisz product ktory chcesz wybrac");
                    String choice2 = scanner.nextLine();
                    for (int i = 0; i < products.size(); i++) {
                        if (choice2.equals(products.get(i).getTitle())) {
                            System.out.println("------------------------------");
                            System.out.println("ile sztuk chcesz dodac");
                            int choice3 = Integer.parseInt(scanner.nextLine());
                            System.out.println("Dodaje "+choice3+" sztuki" + products.get(i).getTitle() + "  do koszyka");
                            System.out.println("------------------------------");
                            if (products.get(i).getCount() == 0) {
                                System.out.println("------------------------------");
                                System.out.println("produkt nie istnieje");
                                System.out.println("------------------------------");
                                products.remove(i);
                            }
                            else  {
                                products.get(i).setCount(products.get(i).getCount() - choice3);
                                koszyk.add(products.get(i));
                                sum = sum + products.get(i).sum();
                            }
                        }
                    }
                    break;

                case "nie":
                    System.out.println("------------------------------");
                    System.out.println("Podsumowanie cena za produkty wynosi: ");
                    System.out.println(sum+" zł");
                    System.out.println("------------------------------");
                    check = false;
                    break;
                case "koszyk":
                    System.out.println("------------------------------");
                    System.out.println("Produkty w twoim koszyku: ");
                    System.out.println("------------------------------");
                    for (Product Koszyk : koszyk) {
                        System.out.println(Koszyk.displayProduct());
                    }
                    System.out.println("------------------------------");
                    System.out.println(sum+" zł");
                    break;
                default:
                    System.out.println("------------------------------");
                    System.out.println("Niepoprawny wybór. Spróbuj jeszcze raz.");
                    System.out.println("------------------------------");

            }
        }
    }
}

