package observer;

import java.util.Observable;
import java.util.Observer;

/*
4.	Observer: Toteuta luentomateriaalissa (Observer.pdf)
Observer-mallin sovelluksena esitetty hahmotelma digitaalisesta
kellosta Javalla täydentäen koodia puuttuvin osin.
Käytä ratkaisussasi Javan APIsta löytyviä Observer-rajapintaa
ja Observable-luokkaa.
 */

public class Main {
    public static void main(String[] args) {
        System.out.println("Starting clock");
        ClockTimer timer = new ClockTimer();
        timer.addObserver(new Observer() {
            @Override
            public void update(Observable o, Object arg) {
                System.out.println(arg);
            }
        });

        new Thread(timer).start();
    }
}
