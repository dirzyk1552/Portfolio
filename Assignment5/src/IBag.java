//Interface IBag
public interface IBag<E> {
//method to add "item" or E to the bag
public void add(E item);
//method to remove E from the bag
public E remove();
//method to see if an item is in the bag
public boolean contains(E item);
//method to check if the bag is empty
public boolean isEmpty();

}