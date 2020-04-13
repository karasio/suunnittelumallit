package stateandvisitor;

// ConcreteState2
public class Charmeleon extends PokemonState {
    private double height;
    private double weight;
    private int hp;
    private int cp;
    private static final int MAX_CP = 1417;

    public Charmeleon(double random) {      // ranges from according to pokemongo.fandom.com
        height = 1.02 + random * 0.37;      // 1.02 - 1.39m
        weight = 15.59 + random * 16.39;    // 15.59 - 31.98 kg
        hp = 14 + (int)(random * 117);      // 14 - 131
        cp = 10 + (int)(random * 1317);     // 10 - 1417
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
    public int getHp() {
        return hp;
    }

    @Override
    public void setHp(int hp) {
        this.hp = hp;
    }

    @Override
    public String toString() {
        return "Charmeleon\nHeight = " + String.format("%.2f", height) + "m Weight = " +
                String.format("%.2f", weight) + "kg \nCP = " + cp
                + "\t HP=" + hp;
    }

    @Override
    public void evolve(Pokemon p, double random) {
        p.setState(new Charizard(random));
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
}
