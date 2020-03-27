package state;

// Context // TCPConnection
public class Pokemon implements Runnable{
    private PokemonState state;
    private double random;
    private int candy = 0;

    public Pokemon() {
        random = Math.random();
        this.state = new Charmander(random);
    }

    public PokemonState getState() {
        return state;
    }

    @Override
    public String toString() {
        return state.toString() + "\t\t\tCandy = " + candy;
    }

    public Pokemon evolve() {
        if (candy >= 25 && state instanceof Charmander) {
            candy = candy - 25;
            state =  new Charmeleon(random);
            System.out.println("Pokemon evolved!");
            System.out.println(state + "\t\t\tCandy = " + candy);
        } else if (candy >= 100 && state instanceof Charmeleon) {
            candy = candy - 100;
            state = new Charizard(random);
            System.out.println("Pokemon evolved!");
            System.out.println(state + "\t\t\tCandy = " + candy);
        } else {
            System.out.println("Not enough candy to evolve :(");
        }
        return this;
    }

    public int fight() {
        int hp = state.getHp();
        int cp = state.getCp();
        int MAX_CP = state.getMaxCp();
        int newHp = state.fight(hp, cp, MAX_CP);
        if (hp == newHp) {
            candy += 3;
        } else {
            state.setHp(newHp);
        }
        System.out.println(state.toString() + "\t\t\tCandy = " + candy);
        return newHp;
    }

    @Override
    public void run() {
        while (true) {
            candy++;
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
