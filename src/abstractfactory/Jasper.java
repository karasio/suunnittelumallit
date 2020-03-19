package abstractfactory;

public class Jasper {
    AbstractFactory factory;

    public Jasper(AbstractFactory factory) {
        this.factory = factory;

        Cap cap;
        Jeans jeans;
        Shirt shirt;
        Shoes shoes;

        cap = factory.createCap();
        jeans = factory.createJeans();
        shirt = factory.createShirt();
        shoes = factory.createShoes();
        
        System.out.println(cap.print() + ", " + jeans.print() + ", " + shirt.print() + " and " + shoes.print());
    }
}
