package abstractfactory;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {


    public static void main(String[] args) throws IOException {

        AbstractFactory bossFactory = new BossFactory();
        AbstractFactory adidasFactory = new AdidasFactory();
        Cap cap;
        Jeans jeans;
        Shirt shirt;
        Shoes shoes;

        System.out.println("Jasper is studying");
        cap = adidasFactory.createCap();
        jeans = adidasFactory.createJeans();
        shirt = adidasFactory.createShirt();
        shoes = adidasFactory.createShoes();
        System.out.println("Jasper is wearing:");
        System.out.println(cap.print());
        System.out.println(jeans.print());
        System.out.println(shirt.print());
        System.out.println(shoes.print());

        System.out.println("Jasper graduated as an engineer");

        cap = bossFactory.createCap();
        jeans = bossFactory.createJeans();
        shirt = bossFactory.createShirt();
        shoes = bossFactory.createShoes();

        System.out.println("Jasper is wearing:");
        System.out.println(cap.print());
        System.out.println(jeans.print());
        System.out.println(shirt.print());
        System.out.println(shoes.print());
    }
}