// import java.util.*;
// Min-heap implementation
/**
 * Min Heap implemetation
 * 
 * @author Jaineel Nandu
 * @version 20201204
 *
 * @param <T>
 *            Generic parameter so we can use it in multiple ways.
 */
public class MinHeap<T extends Comparable<T>> {
    private T[] heapArray; // Pointer to the heap array
    private int max; // Maximum size of the heap
    private int size; // Number of things now in heap

    /**
     * Contructor that generates a Min Heap with given maximum size.
     * 
     * @param maximum
     *            Maximim size of the heap to construct.
     */
    @SuppressWarnings("unchecked")
    MinHeap(int maximum) {
        heapArray = (T[])new Comparable[maximum];
        max = maximum;
        size = 0;
    }


    /**
     * Gets the current filled
     * 
     * @return
     *         int: num of items in heap
     */
    // Return current size of the heap
    public int heapSize() {
        return size;
    }


    /**
     * Restores the max value and size value
     */
    public void restoreMaxSize() {
        max = heapArray.length;
        size = max;
    }


    /**
     * Tells if heap is full
     * 
     * @return
     *         boolean: true if heap is full.
     */
    public boolean isHeapFull() {
        return size == max;
    }


    /**
     * Tells if the heap has just been initialized.
     * 
     * @return
     *         boolean: true if the tree is null.
     */
    public boolean isNull() {
        return heapArray[0] == null;
    }


    /**
     * Tells if the position is a leaf.
     * 
     * @param pos
     *            int: position of the record in the heap array.
     * @return
     *         boolean: true if the position is a leaf.
     */
    // Return true if pos a leaf position, false otherwise
    public boolean isLeaf(int pos) {
        /*
            Implementation hidden, contact Author
        */
        return false;
    }


    /**
     * Gets the leftchild of the current position.
     * 
     * @param pos
     *            position of the node of which we want the leftchild.
     * @return
     *         int, leftchild of a number
     */
    // Return position for left child of pos
    public int leftChild(int pos) {
        /*
            Implementation hidden, contact Author
        */
        return 0;
    }


    /**
     * Parent of the current position
     * 
     * @param pos
     *            int: position of the child.
     * @return
     *         int: position of its parent.
     */
    // Return position for parent
    private int parent(int pos) {
        /*
            Implementation hidden, contact Author
        */
        return 0;
    }


    /**
     * Insert a single record.
     * 
     * @param record
     *            Record to be inserted
     */
    // Insert val into heap
    void insert(T record) {
        /*
            Implementation hidden, contact Author
        */
    }


    /**
     * Inserts a block of data into the heap and heapify it.
     * 
     * @param records
     *            Records to be inserted in the heap.
     */
    void insertBlock(T[] records) {
        /*
            Implementation hidden, contact Author
        */
    }


    /**
     * Helper funtion to build the heap properly.
     */
    // Heapify contents of Heap
    public void buildHeap() {
        for (int i = size / 2 - 1; i >= 0; i--) {
            siftdown(i);
        }
    }


    /**
     * Swaps p1 and p2 in array
     * 
     * @param array
     *            array for the swap to happen.
     * @param p1
     *            index of first item
     * @param p2
     *            index of second item
     */
    public void swap(T[] array, int p1, int p2) {
        /*
            Implementation hidden, contact Author
        */
    }


    /**
     * Checks where an element should be placed
     * 
     * @param pos
     *            elements position to be shifted down.
     */
    // Put element in its correct place
    private void siftdown(int pos) {
        /*
            Implementation hidden, contact Author
        */
    }


    /**
     * Returns the minimum value from the heap array and doesn't destroy it.
     * 
     * @return
     *         Minimum Record
     */
    public T getMin() {
        return heapArray[0];
    }


    /**
     * Returns the minimum value and destroys lives by putting them in prison.
     * 
     * @return
     *         Minim record.
     */
    // Remove and return maximum value
    public T removeMin() {
        /*
            Implementation hidden, contact Author
        */
        return heapArray[size];
    }


    /**
     * Returns the string form of the heap.
     * 
     * @return
     *         String: heap as string
     */
    public String toString() {
        String ret = "";
        /*
            Implementation hidden, contact Author
        */
        return ret;
    }


    /**
     * Inserts without reducing heap numbers.
     * 
     * @param replacement
     *            Data to replace
     */
    public void goodInsert(T replacement) {
        /*
            Implementation hidden, contact Author
        */

    }


    /**
     * Inserts by reducing heap numbers
     * 
     * @param replacement
     *            Data to replace
     */
    public void badInsert(T replacement) {
        /*
            Implementation hidden, contact Author
        */

    }


    /**
     * Returns the maximum size value
     * 
     * @return
     *         int: maximum size of the heap.
     */
    public int heapMax() {
        return max;
    }
}
