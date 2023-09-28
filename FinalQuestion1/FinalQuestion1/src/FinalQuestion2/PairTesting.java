package FinalQuestion2;

import java.util.ArrayList;

public class PairTesting {
//Creating the pairs that get displayed//
    public static void main(String[] args) {
    	//Creating array list labeled as fruits//
        ArrayList<Pair<String, Integer>> fruits = new ArrayList<>();
        fruits.add(createPair("Apple", 20));
        fruits.add(createPair("Banana", 90));
        fruits.add(createPair("Orange", 1000));
        fruits.add(createPair("Strawberry", 50));
        fruits.add(createPair("Cherry", 75));
        //loop for fruits array//
        for (Pair<String, Integer> pair : fruits) {
            System.out.println(pair.getFirst() + ":" + pair.getSecond());
        }
    }
//creating the pair and returning it to PairImpl//
    private static Pair<String, Integer> createPair(String first, Integer second) {
        return new PairImpl<>(first, second);
    }
}
