package singleton;

import java.io.FileInputStream;
import java.lang.reflect.Method;
import java.util.Properties;

/*
5.	Singleton: Mieti jokin konkreettinen sovellustilanne,
 jossa Singleton-mallista olisi hyötyä. Esitä sovelluksen
 toteutus Javalla. Ks. toteutusvihjeet wikipediasta. Voit
 esim. toteuttaa abstraktin tehtaan singletonina. Voit
 hyödyntää lisäksi reflektiota.
 */
public class Main {
    public static void main(String[] args) {
        Class c = null;
        GameCharacterFactory factory = null;

        Properties properties = new Properties();
        try {
            properties.load(new FileInputStream("./src/singleton/properties"));
        } catch (Exception e) {
            System.out.println("FILE read does not work");
            e.printStackTrace();
        }

        // first with Pokemon factory
        try {
            c = Class.forName(properties.getProperty("PF"));
            Method factoryMethod = c.getDeclaredMethod("getInstance");
            factory = (GameCharacterFactory) factoryMethod.invoke(null, null);
        } catch (Exception e) {
            e.printStackTrace();
        }

        IMainCharacter mc = factory.createMainCharacter();
        IEnemyCharacter ec = factory.createEnemyCharacter();

        System.out.println("First characters to be introduced:");
        System.out.print("Main character " + mc.toString());
        System.out.print(" & ");
        System.out.println(ec.toString());

        // then with SuperMarioFactory
        try {
            c = Class.forName(properties.getProperty("SMF"));
            Method factoryMethod = c.getDeclaredMethod("getInstance");
            factory = (GameCharacterFactory) factoryMethod.invoke(null, null);
        } catch (Exception e) {
            e.printStackTrace();
        }

        mc = factory.createMainCharacter();
        ec = factory.createEnemyCharacter();

        System.out.println("And the second set of characters are: ");
        System.out.print("Main character " + mc.toString());
        System.out.print(" & ");
        System.out.println(ec.toString());

        // enum version of Singleton -- MixerFactory
        try {
            c = Class.forName(properties.getProperty("MF"));
            Method factoryMethod = c.getDeclaredMethod("getInstance");
            factory = (GameCharacterFactory) factoryMethod.invoke(null, null);
        } catch (Exception e) {
            e.printStackTrace();
        }

        mc = factory.createMainCharacter();
        ec = factory.createEnemyCharacter();

        System.out.println("And the third set of characters are: ");
        System.out.print("Main character " + mc.toString());
        System.out.print(" & ");
        System.out.println(ec.toString());

    }
}
