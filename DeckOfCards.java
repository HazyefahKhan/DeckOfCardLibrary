import java.util.ArrayList;
import java.util.HashMap;
import java.util.Collections;

// Class to represent a Deck of Cards
public class DeckOfCards {
    private ArrayList<Card> deck;

    // Intialize Deck of Cards
    public DeckOfCards(SuitInfo suitInfo, TypeInfo typeInfo){
        // List to hold deck
        this.deck = new ArrayList<>();
        // HashMaps to store suit, type values given by user
        HashMap<Suit, Integer> suits = suitInfo.getSuitInfo();
        HashMap<Type, Integer> types = typeInfo.getTypeInfo();

        // Create a deck of 52 cards in order
        for (Suit suit: suits.keySet()){
            for (Type type: types.keySet()){
                this.deck.add(new Card(type, types.get(type), suit, suits.get(suit)));
            }
        } 
    }

    // User can choose to shuffle deck of cards
    public void shuffleDeck() {
        Collections.shuffle(this.deck);
    }

    // Deal a number of cards to a hand
    public Hand deal(int numberOfCards){
        Hand hand = new Hand();
        
        for (int i = 0; i < numberOfCards; i++){
            Card toRemove = this.deck.get(this.deck.size()-1);
            hand.add(toRemove);
            this.deck.remove(toRemove);
        }

        return hand;
    }
}
