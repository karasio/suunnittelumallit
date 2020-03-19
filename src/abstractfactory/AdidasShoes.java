package abstractfactory;


public class AdidasShoes implements Shoes {

    public AdidasShoes() {
    }

    @Override
    public String print() {
        return "shoes by Adidas";
    }
}