package FinalQuestion2;
//PairImpl class implements Pair interface//
public class PairImpl<A, B> implements Pair<A, B> {
	//declaring variables A and B//
    private A firstvalue;
    private B secondvalue;
    //Constructor for A and B//
    public PairImpl(A first, B second) {
        this.firstvalue = first;
        this.secondvalue = second;
    }
    
   //for variable A, return first value//
    public A getFirst() {
        return firstvalue;
    }
    
    //for variable B, return second value//
    public B getSecond() {
        return secondvalue;
    }
    
    //print out A and B variables//
    public String toString() {
        return "[" + firstvalue.toString() + ", " + secondvalue.toString() + "]";
    }
}

