package builder;

import java.util.List;
import java.util.Set;

/*
14.	Builder: Kirjoita ohjelma, jossa rakennat kerroshampurilaisen
Builder-mallin mukaisesti. Toteuta vähintään kaksi konkreettista
builderia (Hesburger ja McDonalds). Toteuta builderit siten, että
kummallakin on eri tietorakenne hampurilaisen koostamiseksi. Toisella
esim. List, johon tallennetaan hampurilaisen osat olioina (määrittele
osille omat luokat, esim. salaattia voisi edustaa konkreettisen
builderin päässä class JäävuoriSalaatti, josta luodaan ilmentymä
listaan) ja toisella StringBuilder, jossa osia edustavat merkkijonot.
Builderilla on getBurger()-metodi, joka palauttaa hampurilaisen
sellaisena tietorakenteena, jona se on luotu.
 */
public class Main {
    public static void main(String[] args) {
        Wolt wolt = new Wolt();

        Builder mcd = new McDonalds();
        wolt.setBuilder(mcd);
        wolt.constructBurger();
        System.out.println("Order received at McDonald's");
        Object bicmac = wolt.getBurger();
        System.out.println("Order complete");
        System.out.println("Here's your burger, it includes: ");
        System.out.println(bicmac);
        System.out.println("--------------------");

        Builder hesburger = new Hesburger();
        wolt.setBuilder(hesburger);
        wolt.constructBurger();
        System.out.println("Order received at Hesburger");
        Object doubleBurger = wolt.getBurger();
        System.out.println("Order complete");
        System.out.println("Here's your burger, it includes: ");
        System.out.println(doubleBurger);
        System.out.println("--------------------");

        Builder bk = new BurgerKing();
        wolt.setBuilder(bk);
        wolt.constructBurger();
        System.out.println("Order received at Burger King");
        Object tripleStackBurger = wolt.getBurger();
        System.out.println("Order complete");
        System.out.println("Here's your burger, it includes: ");
        System.out.println(tripleStackBurger);
    }
}
