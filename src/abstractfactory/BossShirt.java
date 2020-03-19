package abstractfactory;

public class BossShirt implements Shirt {

    public BossShirt() {
    }


    @Override
    public String print() {
        return "shirt by Boss";
    }
}