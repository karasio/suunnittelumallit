package decorator;

import java.util.ArrayList;
import java.util.List;

public class Ristorante {
    public static void main(String[] args) {
        Pizza[] menu = {
                new Pineapple(new Chicken(new Feta(new Base()))),
                new Tunafish(new Onion(new Mozzarella(new Base()))),
                new Voner(new Olive(new Onion(new Base()))),
                new Chicken(new Feta(new Mozzarella(new Base())))
        };

        System.out.println("Welcome to Marios! What may we get you?");
        System.out.println("-----------------------------------------------------------------------------------------------");
        int i = 1;
        for (Pizza p : menu) {
            System.out.print(i + ": ");
            printMenu(p);
            i++;
        }

    }

    public static void printMenu(Pizza p) {
        System.out.println(p.getDescription());
        System.out.print("Price: ");
        System.out.println(String.format("%.2f", p.getPrice()));
        System.out.println("-----------------------------------------------------------------------------------------------");
    }

}