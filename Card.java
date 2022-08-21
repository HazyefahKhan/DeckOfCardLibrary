public class Card implements Comparable<Card>{

    // attributes for Card class
    private Type type;
    private int value;
    private Suit suit;
    private int suitValue;

    // Initialize Card
    public Card(Type type, int value, Suit suit, int suitValue){
        this.type = type;
        this.value = value;
        this.suit = suit;
        this.suitValue = suitValue;
    }

    // return Value of Card
    public int getValue(){
        return value;
    }

    // return Suit
    public Suit getSuit(){
        return suit;
    }

    // return Type
    public Type getType(){
        return type;
    }

    // return Suit Value
    public int getSuitValue(){
        return suitValue;
    }

    // Compare this card to another card
    // If values are equal, compare suit values
    // Else just compare values alone
    public int compareTo(Card comparedCard) {
        
        if (this.getValue() == comparedCard.getValue()){
            if(this.getSuit() == comparedCard.getSuit()){
                return 0;
            } else if (this.getSuitValue() < comparedCard.getSuitValue()) {
                return -1;
            } else {
                return 1;
            }   
        }

        if (this.getValue() < comparedCard.getValue()) {
            return -1;
        } else {
            return 1;
        }
    }
}
