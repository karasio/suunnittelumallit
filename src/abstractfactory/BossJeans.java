package abstractfactory;

public class BossJeans implements Jeans {

    public BossJeans() {
    }

    @Override
    public String print() {
        return "jeans by Boss";
    }
}