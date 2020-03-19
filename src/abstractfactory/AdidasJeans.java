package abstractfactory;


public class AdidasJeans implements Jeans {

    public AdidasJeans() {
    }

    @Override
    public String print() {
        return "jeans by Adidas";
    }
}