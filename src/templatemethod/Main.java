package templatemethod;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Game rps = new RockPaperScissors();
        rps.playOneGame(10);
        System.out.println("------------------------");
        rps.playOneGame(5);
        System.out.println("------------------------");
        rps.playOneGame(2);
        System.out.println("------------------------");

        Game bj = new BlackJack();
        bj.playOneGame(5);
        System.out.println("------------------------");
        bj.playOneGame(2);
        System.out.println("------------------------");
        bj.playOneGame(4);
    }
}
