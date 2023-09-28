import java.util.ArrayList;

public class SortedBag<E> implements IBag<E> {
    private ArrayList<E> data;

    public SortedBag() {
        this.data = new ArrayList<>();
    }

   //Adding item E to bag
    public void add(E item) {
        int start = 0, end = data.size() - 1;
        int index = -1;
        
        // Applying binary search to find the right position of the item
        while (start <= end) {
            int middle = (start + end) / 2;

            // Compare the item with the current element at middle
            int comparison = data.get(middle).toString().compareToIgnoreCase(item.toString());
            
            // Positioning the item down the list 1,2,3,4,etc
            if (comparison < 0) {
                start = middle + 1;
            }
            // Positioning the item to the front of the list
            else {
                end = middle - 1;
            }
        }
        
        // Inserting the item at the appropriate position
        data.add(start, item);
    }

 //Remove E from the bag
    public E remove() {
        return data.remove(0);
    }

  
    public boolean contains(E item) {
        int start = 0, end = data.size() - 1;
        
        // Applying binary search to see if the item is there
        while (start <= end) {
            int middle = (start + end) / 2;

            // Compare the item with the current element at middle
            int comparison = data.get(middle).toString().compareToIgnoreCase(item.toString());
            
            // If the item is found, return true
            if (comparison == 0) {
                return true;
            }
            // If the item is located after the current element at middle, move to the right side
            else if (comparison < 0) {
                start = middle + 1;
            }
            // If the item should be located before the current element at mid, move to the left side
            else {
                end = middle - 1;
            }
        }
        
        // If the item is not found, return false
        return false;
    }

   //Checks if the bag is empty
    public boolean isEmpty() {
        return data.isEmpty();
    }
}
