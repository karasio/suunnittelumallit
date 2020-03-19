package abstractfactory;

public class BossFactory implements AbstractFactory {


    public BossFactory() {
    }


    public Jeans createJeans() {
        return new BossJeans();
    }

    public Shirt createShirt() {
        return new BossShirt();
    }

    public Cap createCap() {
        return new BossCap();
    }

    public Shoes createShoes() {
        return new BossShoes();
    }

}