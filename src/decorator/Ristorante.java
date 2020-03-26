package decorator;

import java.util.ArrayList;
import java.util.List;

public class Ristorante {
    public static void main(String[] args) {
        List<Pizza> menu = new ArrayList();
        Pizza p1 = new Pineapple(new Chicken(new Feta(new Base())));
        menu.add(p1);
        Pizza p2 = new Tunafish(new Onion(new Mozzarella(new Base())));
        menu.add(p2);
        Pizza p3 = new Voner(new Olive(new Onion(new Base())));
        menu.add(p3);
        Pizza p4 = new Chicken(new Feta(new Mozzarella(new Base())));
        menu.add(p4);

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