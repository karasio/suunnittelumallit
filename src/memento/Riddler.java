package memento;

// Originator
public class Riddler {

    public Riddler() {
    }

    // SAVE MEMENTO
    public Object joinGame(Player p) {
        System.out.println(p.getPlayerName() + " memento saved - this should happen only once");
        return new Memento((int)(1+Math.random() * 10));
    }

    // LOAD MEMENTO
    public void guess(Object o, Player p, int guessed) {
        System.out.println(p.getPlayerName() + "'s guess " + guessed);
        Memento memento = (Memento) o;
        if (((Memento) o).GUESS == guessed) {
            p.setEndOfGame(((Memento) o).GUESS);
        }
    }

    /*****************************MEMENTO***************************/

    private class Memento {
        private final int GUESS;

        public Memento(int guess) {
            this.GUESS = guess;
        }
    }
}

