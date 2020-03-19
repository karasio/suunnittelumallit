package abstractfactory;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {


    public static void main(String[] args) throws IOException {

        AbstractFactory bossFactory = new BossFactory();
        AbstractFactory adidasFactory = new AdidasFactory();

        System.out.println("Jasper is a student and is wearing: ");
        Jasper jasper = new Jasper(adidasFactory);

        System.out.println("Jasper is an engineer and now he's wearing");
        jasper = new Jasper(bossFactory);
    }
}