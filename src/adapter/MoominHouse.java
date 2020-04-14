package adapter;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class MoominHouse {
    public static void main(String[] args) {
        System.out.println("Something odd is happening at Moominvalley. Moominpappa seems rather.. odd");
        List<MoominCharacter> characters = new ArrayList<>();
        MoominCharacter moomintroll = new Moomintroll();
        characters.add(moomintroll);
        MoominCharacter snufkin = new Snufkin();
        characters.add(snufkin);
        MoominCharacter stinky = new Stinky();
        characters.add(stinky);
        MoominCharacter moominpappa = new SkeletorPappa();
        characters.add(moominpappa);

        System.out.println("Let's ask all of their names first!");
        System.out.println("-------------------------------------------------------------");
        int i = 1;
        for (MoominCharacter m : characters) {
            System.out.println(i + " one says their name is " + m.getName());
            i++;
        }
        System.out.println("-------------------------------------------------------------");
        System.out.println("What on earth! Who is SKELETOR?!");
        System.out.println("Let's check their characteristic attributes.");
        System.out.println("-------------------------------------------------------------");
        for(MoominCharacter m : characters) {
            System.out.println(m.getName() + " can be recognised by " + m.getCharacteristic());
        }
        System.out.println("-------------------------------------------------------------");
        System.out.println("Let's ask them all of their super secret moomin names to see if they are who they claim to be.");
        System.out.println("If someone doesn't answer, then they are not who they say they are.");
        System.out.println("-------------------------------------------------------------");
        for(MoominCharacter m : characters) {
            String secretMoominName = m.getVerifiedMoominName(m.getName());
            System.out.println("Secret moomin name of " + m.getName() + " is");
            System.out.println(secretMoominName);
            System.out.println("Oh my, that was long! " + secretMoominName.length() + " characters!");
            boolean valid = true;
            for (char c : secretMoominName.toCharArray()) {
                if(!Character.isLetterOrDigit('m') || !Character.isLetterOrDigit('a')) {
                    valid = false;
                    break;
                }
            }

            if (!valid) {
                System.out.println("The one who claims to be " + m.getName() + " is a fraud!");
            }
        }
        System.out.println();
        System.out.println("I guess Moominpappa wants to be called " + moominpappa.getName() + " now");
    }
}
