package composite;

public class Main {

    public static void main(String[] args) {
        System.out.println("Price comparison when using components from 1 factory only:");
        // using Dell factory
        FactoryBuilder factoryBuilder = new FactoryBuilder(new Dell());
        System.out.println("\tDell price in total " + String.format("%.2f",factoryBuilder.getTotalPrice()) + "€");
        // using HP factory
        factoryBuilder.changeFactory(new Hp());
        System.out.println("\tHP price in total " + String.format("%.2f",factoryBuilder.getTotalPrice()) + "€");

        // custom build computer
        System.out.println("Custom parts from both factories:");
        CustomBuilder customBuilder = new CustomBuilder();
        System.out.println("\tCustom built computer price in total " + String.format("%.2f",customBuilder.getTotalPrice()) + "€");
    }
}