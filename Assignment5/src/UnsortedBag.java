import java.util.ArrayList;

public class UnsortedBag<E> implements IBag<E> {
    private ArrayList<E> data;
//initializing new ArrayList
    public UnsortedBag() {
        this.data = new ArrayList<>();
    }

  //Add Item to bag
    public void add(E item) {
        data.add(item);
    }

//Remove item from bag
    public E remove() {
        return data.remove(0);
    }

    
 //Checking to see if a specific item is in the bag
    public boolean contains(E item) {
        return data.contains(item);
    }

 //checking to see if the bag is empty
    public boolean isEmpty() {
        return data.isEmpty();
    }
}
