package memento;

// Caretaker
public class Player extends Thread{

    private String[] names = {"John", "Lisa", "Marcus", "Bertie", "Ulrike", "Sandy"};
    private String playerName;

    private Object obj;
    private Riddler r;

    private volatile boolean endOfGame = false;
    private static int i = 0;
    private volatile int guess = 1;

    public Player(Riddler r) {
        playerName = names[i];
        i++;
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
        return playerName;
    }
}
