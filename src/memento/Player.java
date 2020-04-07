package memento;

// Caretaker
public class Player extends Thread{

    private String[] names = {"Janne", "Liisa", "Timo", "Bertta", "Ulrike"};
    private Object obj;
    String playerName;
    private Riddler r;
    private volatile boolean endOfGame = false;
    private static int i = 0;
    private volatile int guess = 1;

    public Player(Riddler r) {
        this.playerName = getPlayerName();
        this.r = r;
    }

    @Override
    public void run() {
        obj = r.joinGame(this);
        while (!endOfGame) {
            r.guess(obj, this, guess);
            guess++;
        }
    }

    public void setEndOfGame(int mystery) {
        System.out.println("\t" +playerName + " ended the game! The correct number was " + mystery);
        this.endOfGame = true;
    }

    public String getPlayerName() {
        String name = names[i];
        i++;
        return name;
    }
}
