import java.util.HashMap;

// Allows the user to assign their desired value to each suit.
public class SuitInfo {
    private HashMap<Suit, Integer> suits = new HashMap<>();

     // User-defined suit and value mapping
    public SuitInfo(int diamondValue, int heartValue, int clubValue, int spadeValue){
        suits.put(Suit.DIAMOND, diamondValue);
        suits.put(Suit.HEART, heartValue);
        suits.put(Suit.CLUB, clubValue);
        suits.put(Suit.SPADE, spadeValue);
    }

    // Returns suit and value mapping
    public HashMap<Suit, Integer> getSuitInfo(){
        return this.suits;
    }
}

