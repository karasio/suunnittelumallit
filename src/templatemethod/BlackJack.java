package templatemethod;

import java.util.*;
/*
BlackJack where the game ends if the sum of cards on any player reaches or exceeds 21
 */

public class BlackJack extends Game{
    private List<Integer> deck;
    private int cardTakenIndex;
    private boolean endOfGame;
    private List<Hand> players;
    private Hand hand;
    private boolean firstRound;
    private List<Integer> droppedOutPlayers;

    @Override
    void initializeGame() {
        System.out.println("This is BlackJack!");
        // create and shuffle a deck of cards
        deck = new ArrayList<>();
        for (int i = 0; i < 4; i++) {
            for (int j = 1; j < 14; j++) {
                deck.add(j);
            }
        }
        Collections.shuffle(deck);

        cardTakenIndex = 0;
        endOfGame = false;
        players = new ArrayList<>();
        firstRound = true;
        droppedOutPlayers = new ArrayList<>();
    }

    @Override
    void makePlay(int player) {
        // if player is out, skip their turn
        for (int i : droppedOutPlayers) {
            if (player == i) {
                return;
            }
        }

        // create players card list & a new Hand for this round
        List<Integer> cards = new ArrayList<>();
        hand = new Hand(player);

        // if player already exists, use old values from List players
        for (Hand h : players) {
            if (player == h.getPlayerNumber()) {
                firstRound = false;
                cards = h.getCards();
                hand = h;
            }
        }

        // if only one player left, end game
        if (droppedOutPlayers.size() == (players.size()-1) && !firstRound) {
            endOfGame = true;
        }

        // if nearing 21, stop playing
        if (hand.calculateSum() > 17) {
            droppedOutPlayers.add(player);
            return;
        }

        // take a card from deck
        cards.add(deck.get(cardTakenIndex));
        cardTakenIndex++;

        // shuffle a new deck of cards, if running out
        if (cardTakenIndex > 51) {
            System.out.println("Shuffling a new deck of cards");
            Collections.shuffle(deck);
            cardTakenIndex = 0;
        }

        // set players cards to Hand Object
        hand.setCards(cards);
        System.out.println((hand.getPlayerNumber()+1) + ": " + hand.getCards().toString() + " sum: " + hand.calculateSum());
        // if first round, add player to list of players
        if (firstRound) {
            players.add(hand);
        }

        // if sum of hand is 21, player stops taking new cards -> add to disqualifiedPlayers
        if (hand.calculateSum() == 21) {
            droppedOutPlayers.add(player);
        }

        // if player goes over 21, player loses -> add to disqualifiedPlayers
        if (hand.calculateSum() > 21) {
            droppedOutPlayers.add(player);
        }
    }

    @Override
    boolean endOfGame() {
        return endOfGame;
    }

    @Override
    void printWinner() {
        List<Integer> sums = new ArrayList<>();

        // add values to possible winners list
        for (Hand h : players) {
            if (h.getSum() <= 21) {
                sums.add(h.calculateSum());
            }
        }

        // find out the biggest sum
        int biggest = 0;
        for (int sum : sums) {
            if (biggest <= sum) {
                biggest = sum;
            }
        }

        // find out winner's player numbers and create a string of those
        String winnerNumbers = "";
        for (int i = 0; i < players.size(); i++) {
            if (players.get(i).getSum() == biggest) {
                winnerNumbers += (players.get(i).getPlayerNumber()+1) + " ";
            }
        }

        // if everyone went over 21, everyone is a loser, else print winners and winning sum
        if (biggest == 0) {
            System.out.println("Everybody lost");
        } else {
            System.out.println("Winner(s) of the game:\nPlayer(s) number: " + winnerNumbers + "\nwith sum of " + biggest);
        }
    }

}

class Hand{
    private int playerNumber;
    private List<Integer> cards;
    private int sum;

    public Hand(int playerNumber) {
        this.playerNumber = playerNumber;
        cards = new ArrayList<>();
        sum = 0;
    }

    public int getPlayerNumber() {
        return playerNumber;
    }

    public List<Integer> getCards() {
        return cards;
    }

    public void setCards(List<Integer> cards) {
        this.cards = cards;
    }

    public int calculateSum() {
        sum = 0;
        for (Integer card : cards) {
            sum += card;
        }
        return sum;
    }

    public int getSum() {
        return sum;
    }
}


