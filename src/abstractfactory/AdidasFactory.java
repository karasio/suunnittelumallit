package abstractfactory;


public class AdidasFactory implements AbstractFactory {

    public AdidasFactory() {
    }


    public Jeans createJeans() {
        return new AdidasJeans();
    }

    public Shirt createShirt() {
        return new AdidasShirt();
    }


    public Cap createCap() {
        return new AdidasCap();
    }

    public Shoes createShoes() {
        return new AdidasShoes();
    }

}