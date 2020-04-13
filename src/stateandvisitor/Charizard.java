package stateandvisitor;

// ConcreteState3
public class Charizard extends PokemonState {
    private double height;
    private double weight;
    private int hp;
    private int cp;
    private final static int MAX_CP = 2476;


    public Charizard(double random) {       // ranges from according to pokemongo.fandom.com
        height = 1.49 + random * 0.47;      // 1.49 - 1.96 m
        weight = 90.5 + random * 128;       // 90.5 - 137.5 kg
        hp = 17 + (int)(random * 141);      // 17 - 158
        cp = 10 + (int)(random * 2376);     // 10 - 2476
    }

    @Override
    public int getCp() {
        return cp;
    }

    @Override
    public int getMaxCp() {
        return MAX_CP;
    }

    @Override
    public void evolve(Pokemon p, double random) {
        System.out.println("Highest form");
    }

    @Override
    public void accept(BonusVisitor v) {
        v.visit(this);
    }

    @Override
    public void activateBonusMode(double bonus) {
        hp = (int)(hp * bonus);
        cp = (int)(hp * bonus);
    }

    @Override
    public int getHp() {
        return hp;
    }

    @Override
    public void setHp(int hp) {
        this.hp = hp;
    }

    @Override
    public String toString() {
        return "Charizard\nHeight = " + String.format("%.2f", height) + "m Weight = " +
                String.format("%.2f", weight) + "kg \nCP = " + cp
                + "\tHP=" + hp;
    }
}
