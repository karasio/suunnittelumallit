package abstractfactory;

public class AdidasShirt implements Shirt {

    public AdidasShirt() {
    }

    @Override
    public String print() {
        return "shirt by Adidas";
    }
}