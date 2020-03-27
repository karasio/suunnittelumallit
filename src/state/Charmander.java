package state;

// ConcreteState1
public class Charmander extends PokemonState {
    private double weight;
    private double height;
    private int hp;
    private int cp;
    private static final int MAX_CP = 840;

    public Charmander(double random) {                           // ranges from according to pokemongo.fandom.com
        height = 0.45 + random * 0.31;              // 0.45 - 0.76 m
        weight = 4.96 + random * 9.35;              // 4.96 - 14.31 kg
        hp = 11 + (int)(random * 94);               // 11-105
        cp = 10 + (int)(random * 830);              // 415 - 840
    }

    @Override
    public String toString() {
        return "Charmander\nHeight = " + String.format("%.2f", height) + "m Weight = " +
                String.format("%.2f", weight) + "kg \nCP = " + cp
                + "\tHP=" + hp;
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
    public int getCp() {
        return cp;
    }

    @Override
    public int getMaxCp() {
        return MAX_CP;
    }

}
