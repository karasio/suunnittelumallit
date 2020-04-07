package chainofresponsibility;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
10.	Chain of Responsibility:
  Yrityksessä työntekijän lähiesimies pystyy hyväksymään
  2% palkankorotuspyynnöt. Pyyntö pitää ohjata yksikön päällikölle, jos se ylittää
  2% mutta on alle 5%. Tätä suuremmat palkankorotuspyynnöt ohjataan yrityksen
  toimitusjohtajalle. Esitä, kuinka ratkaiset työntekijän palkankorotuspyynnön
  käsittelyn Chain of Responsibility –mallilla.
 */
public class Main {
    public static void main(String[] args) {
        // ConcreteHandlers
        ImmediateSupervisor i = new ImmediateSupervisor();
        HeadOfUnit h = new HeadOfUnit();
        Ceo c = new Ceo();
        i.setHandler(h);
        h.setHandler(c);

        try {
            while (true) {
                System.out.println("How big of a pay raise were you thinking of (in percentages)?");
                double x = Double.parseDouble(
                        new BufferedReader(
                                new InputStreamReader(
                                        System.in))
                                .readLine());
                i.handlePayRaise(x);
            }
        } catch (Exception e) {
            System.exit(1);
        }
    }
}
