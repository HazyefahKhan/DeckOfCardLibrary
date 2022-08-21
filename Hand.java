import java.util.ArrayList;

// Hand Class to represent a users hand
public class Hand{
    // List to store users hand
    private ArrayList<Card> hand;

    // Hand constructer
    public Hand(){
        this.hand = new ArrayList<>();
    }

    // Add card to hand array lsit
    public void add(Card card){
        this.hand.add(card);
    }

    // Return current hand
    public ArrayList<Card> getHand(){
        return this.hand;
    }

    // Print user's hand
    public void print(){
        for (Card card: this.hand){
            System.out.println(card.toString());
        }
    }

}
