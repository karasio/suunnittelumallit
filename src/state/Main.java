package state;

/*
7.	State: Määrittele pelihahmo ja sille kolme kehitysastetta.
Toteuta eri kehitysasteet State-mallin mukaisesti.
Pelihahmo voisi olla esim. Pokemon-hahmo Charmander,
jonka kaksi muuta kehitysastetta ovat Charmeleon ja Charizard.
Määrittele pelihahmolle vähintään kolme erilaista toimintoa
(metodia) siten, että käyttäytyminen riippuu pelihahmon tilasta.
 */
public class Main {

    public static void main(String[] args) {
        char select;
        Pokemon p = new Pokemon();

//        new Thread(p).start();
        Thread t = new Thread(p);
        t.start();

        System.out.println("Welcome to play CLI Charmander!");
        System.out.println("Aim of the game is to evolve your Pokemon to the highest level.");
        System.out.println("You can earn candy in two ways:");
        System.out.println("Fight with a mysterious Pokemon and if you win, you get 3 candy");
        System.out.println("If you lose, you get no candy and you lose health points");
        System.out.println("If you do nothing, you'll earn some candy just by existing");
        System.out.println("You can evolve Charmander to Charmeleon with 25 candy");
        System.out.println("and Charmeleon to Charizard with 100 candy");
        System.out.println("Once you evolve, your pokemon gets stronger and bigger");
        System.out.println("                       )/_\n" +
                "             _.--..---\"-,--c_\n" +
                "        \\L..'           ._O__)_\n" +
                ",-.     _.+  _  \\..--( /           \n" +
                "  `\\.-''__.-' \\ (     \\_      \n" +
                "    `'''       `\\__   /\\\n" +
                "                ')\n");

        System.out.println("A new Pokemon just hatched!");
        System.out.println(p);
        while (true) {
            System.out.println("--------------------------------------------------------------------------------------------");
            System.out.println("What do you do? Choose number:");
            System.out.print("\t1. Evolve");
            System.out.print("\t\t2. Fight");
            System.out.print("\t\t3. Print stats");
            System.out.print("\t\t4. Restart game");
            System.out.println("\t\t5. End game");
            System.out.println("--------------------------------------------------------------------------------------------");

            select = ReadInput.merkki();
            switch (select) {
                case '1':
                    Pokemon returned = p.tryEvolve();
                    if (returned.getState() instanceof Charizard) {
                        System.out.println("CONGRATS! YOU WIN! Want to play again? Y/N");
                        System.out.println("" +
                                "         .* *.               `o`o`\n" +
                                "         *. .*              o`o`o`o      ^,^,^\n" +
                                "           * \\               `o`o`     ^,^,^,^,^\n" +
                                "              \\     ***        |       ^,^,^,^,^\n" +
                                "               \\   *****       |        /^,^,^\n" +
                                "                \\   ***        |       /\n" +
                                "    ~@~*~@~      \\   \\         |      /\n" +
                                "  ~*~@~*~@~*~     \\   \\        |     /\n" +
                                "  ~*~@smd@~*~      \\   \\       |    /     #$#$#        .`'.;.\n" +
                                "  ~*~@~*~@~*~       \\   \\      |   /     #$#$#$#   00  .`,.',\n" +
                                "    ~@~*~@~ \\        \\   \\     |  /      /#$#$#   /|||  `.,'\n" +
                                "_____________\\________\\___\\____|_/______/_________|\\/\\___||______");
                        boolean something = true;
                        while (something) {
                            char newGame = Character.toUpperCase(ReadInput.merkki());
                            switch (newGame) {
                                case 'Y':
                                    t.stop();
                                    p = new Pokemon();
                                    t = new Thread(p);
                                    t.start();
                                    System.out.println("New game starting!");
                                    something = false;
                                    break;
                                case 'N':
                                    System.out.println("Sorry to see you go! Thx for playing");
                                    System.exit(-1);
                                default:
                                    System.out.println("Choice not recognised. Y = Yes new game plz! N = Get me outta here!");
                            }
                        }
                    }
                    break;
                case '2':
                    int healthPoints = p.fight();
                    if (healthPoints < 1) {
                        System.out.println("Sorry mate, you died! Play again? Y/N");
                        boolean something = true;
                        while (something) {
                            char newGame = Character.toUpperCase(ReadInput.merkki());
                            switch (newGame) {
                                case 'Y':
                                    t.stop();
                                    p = new Pokemon();
                                    t = new Thread(p);
                                    t.start();
                                    System.out.println("New game starting!");
                                    something = false;
                                    break;
                                case 'N':
                                    System.out.println("Sorry to see you go! Thx for playing");
                                    System.exit(-1);
                                default:
                                    System.out.println("Choice not recognised. Y = Yes new game plz! N = Get me outta here!");
                            }
                        }
                    }
                    break;
                case '3':
                    System.out.println(p);
                    break;
                case '4':
                    t.stop();
                    p = new Pokemon();
                    t = new Thread(p);
                    t.start();
                    System.out.println("New game starting!");
                    break;
                case '5':
                    System.out.println("Thanks for playing!");
                    System.exit(-1);
                default:
                    System.out.println("Your choice was not recognised, try again.");
                    break;
            }
        }
    }
}
