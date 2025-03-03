package adt.example.kdu.ac.lk;

public interface Stack {

    /**
     * Insert a new item into the stack.
     *
     * @param x the item to insert.
     */
    void push(int x);

    /**
     * Remove the most recently inserted item from the stack.
     *
     * @return first item
     */
    int pop();

    /**
     * Get the most recently inserted item in the stack. * Does not alter
     * the stack.
     *
     * @return the most recently inserted item in the stack.
     */
    Object top();

    /**
     * Return and remove the most recently inserted item * from the stack.
     *
     * @return the most recently inserted item in the stack.
     */
    Object topAndPop();

    /**
     * Test if the stack is logically empty.
     *
     * @return true if empty, false otherwise.
     */
    boolean isEmpty();

    /**
     * Printing the stack
     *
     */
    void printStack();

}
