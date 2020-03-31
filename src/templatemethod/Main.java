package templatemethod;

public class Main {
    public static void main(String[] args) {
        Game rps = new RockPaperScissors();
        System.out.println("With 10 players");
        rps.playOneGame(10);
        System.out.println("------------------------");
        System.out.println("With 5 players");
        rps.playOneGame(5);
        System.out.println("------------------------");
        System.out.println("With 2 players");
        rps.playOneGame(2);
    }
}
