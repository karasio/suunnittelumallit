package stateandvisitor;

// State // TCPState
public abstract class PokemonState {
    public PokemonState() { }

    public abstract int getHp();
    public abstract void setHp(int hp);
    public abstract int getCp();
    public abstract int getMaxCp();
    public abstract void evolve(Pokemon p, double random);
    public abstract void accept(BonusVisitor v);
    public abstract void activateBonusMode(double bonus);

    public int fight(int hp, int cp, int MAX_CP) {
        // how will the fight end? outcome calculated with random number & combat power to max relation
        double outcome =  Math.random() + cp/MAX_CP*0.2;
        if (outcome < 0.5) {
            System.out.println("You lost!");
            hp = hp - (int) (Math.random() * 10);
        } else {
            System.out.println("You win! Here's 3 candy!");
        }
        return hp;
    }

}
