package templatemethod;

import java.util.*;

public class RockPaperScissors extends Game {
    private boolean endOfGame;
    private List<String> playerOptions;
    private static Map<Integer, String> playersChoice;
    private static Map<Integer, String> playerWins;

    @Override
    void initializeGame() {
        playerOptions = new ArrayList<>(Arrays.asList("rock", "paper", "scissors"));
        playersChoice = new HashMap();
        playerWins = new HashMap<>();
        endOfGame = false;
    }

    @Override
    void makePlay(int player) {
        if (playersChoice.containsKey(player)) {
            endOfGame = true;
        } else {
            int random = (int) (Math.random() * 3);
            playersChoice.put(player, playerOptions.get(random));
            System.out.println((player+1) + ": " + playersChoice.get(player));
        }
    }

    @Override
    boolean endOfGame() {
        return endOfGame;
    }

    @Override
    void printWinner() {
        System.out.println("Calculating winner");
        String winString = "";
        for (int i = 0; i < playersChoice.size(); i++) {
            String playerToCompareWith = playersChoice.get(i);
            String comparedPlayer;
            for (int j = 0; j < playersChoice.size(); j++) {
                if (i == j) {
                    continue;
                }
//                System.out.println(i + " & " +j);
                comparedPlayer = playersChoice.get(j);
                if (!playerWins.containsKey(i)) {
                    playerWins.put(i, "");
                }
                if (playerToCompareWith.equals("rock") && comparedPlayer.equals("scissors")
                        || playerToCompareWith.equals("scissors") && comparedPlayer.equals("paper")
                        || playerToCompareWith.equals("paper") && comparedPlayer.equals("rock")) {
                    playerWins.put(i, playerWins.get(i)+"W");
                }
            }
            if (i != 0) {
                winString += "W";
            }
        }

//        System.out.println(playerWins.entrySet());
//        System.out.println(winString);
        for (int k = 0; k < playerWins.size(); k++) {
            if (playerWins.get(k).equals(winString)) {
                System.out.println("\tWinner is player number " + (k+1) + " with " + playersChoice.get(k));
                return;
            }
        }
        System.out.println("Nobody won");
    }
}
