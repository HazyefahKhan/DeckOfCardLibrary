import java.util.HashMap;


// Allows the user to assign their desired value to each card type.
public class TypeInfo {
    private HashMap<Type, Integer> types = new HashMap<>();

    // User-defined type and value mapping
    public TypeInfo(int aceValue, int twoValue, int threeValue, int fourValue, int fiveValue, int sixValue, int sevenValue , int eightValue , int nineValue
        , int tenValue, int jackValue, int queenValue , int kingValue){
        types.put(Type.ACE, aceValue);
        types.put(Type.TWO, twoValue);
        types.put(Type.THREE, threeValue);
        types.put(Type.FOUR, fourValue);
        types.put(Type.FIVE, fiveValue);
        types.put(Type.SIX, sixValue);
        types.put(Type.SEVEN, sevenValue);
        types.put(Type.EIGHT, eightValue);
        types.put(Type.NINE, nineValue);
        types.put(Type.TEN, tenValue);
        types.put(Type.JACK, jackValue);
        types.put(Type.QUEEN, queenValue);
        types.put(Type.KING, kingValue);
    }

    // Returns type and value mapping
    public HashMap<Type, Integer> getTypeInfo(){
        return this.types;
    }
}


