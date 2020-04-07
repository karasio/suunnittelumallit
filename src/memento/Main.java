package memento;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        List<Player> players = new ArrayList<>();

        Riddler r = new Riddler();
        for (int i = 0; i < 5; i++) {
            Player p = new Player(r);
            players.add(p);
            p.start();
        }

        for (Player p : players) {
            try {
                p.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
