package chainofresponsibility;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// ConcreteHandler3
public class Ceo extends Handler {
    private double factor = 10;
    private String newWage;


    public Ceo() { }

    @Override
    public void handlePayRaise(double percentage) {
        if (percentage <= factor) {
            System.out.println("Please explain why you think you've earned a raise?");
            String s = "";
            try {
                s = new BufferedReader(
                        new InputStreamReader(
                                System.in))
                        .readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            if (s.length() > 25 && s.contains("hard worker")) {
                System.out.println("Well all right now.");
                super.print(WAGE * (1 + percentage / 100), "Chief Executive Officer, Mrs. Andersson");
                return;
            }

        }
        System.out.println("That is absurd! You can't be expected to be paid that much for your effort.");

    }

}
