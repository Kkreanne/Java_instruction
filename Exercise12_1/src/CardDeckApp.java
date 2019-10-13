import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

public class CardDeckApp {

    public static void main(String[] args) {
        System.out.println("DECK");
        List<String> deck = getDeck();
        displayCards(deck);

        System.out.println("SHUFFLED DECK");
        shuffleDeck(deck);
        displayCards(deck);

        int count = 2;
        System.out.println("HAND OF " + count + " CARDS");
        List<String> hand = dealCards(deck, count);
        displayCards(hand);
    }

    private static List<String> getDeck() {
        //String[] suits = {"Spades", "Hearts", "Diamonds", "Clubs"};
        //String[] ranks = {"Ace", "2", "3", "4", "5", "6", "7", 
          //  "8", "9", "10", "Jack", "Queen", "King"};        

    	List<String> suits = new ArrayList<>();
    	suits.addAll(Arrays.asList("Spades", "Hearts", "Diamonds", "Clubs"));
    	List<String> ranks = new ArrayList<>();
    	ranks.addAll(Arrays.asList("Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"));
    	
        //String[] deck = new String[52];
        List<String> deck = new ArrayList<>(52);
    	int i = 0;
        for (String suit : suits) {
            for (String rank : ranks) {
                deck.add(rank + " of " + suit);
                i++;
            }
        }
        return deck;
    }

    private static void displayCards(List<String> deck) {
        System.out.print("|");        
        for (String card : deck) {
            System.out.print(card + "|");
        }
        System.out.println();        
    }

    private static void shuffleDeck(List<String> deck) {
        for (int i = 0; i < deck.size(); i++) {
            //String savedCard = deck[i];
        	String savedCard;
        	deck.add(savedCard);
            int randomIndex = (int) (Math.random() * deck.size()-1);
            //deck[i] = deck[randomIndex];
            deck.add(randomIndex);
            deck[randomIndex] = savedCard;
        }
    }

    private static String[] dealCards(String[] deck, int count) {
        String[] hand = Arrays.copyOfRange(deck, 0, count);
        return hand;
    }
}