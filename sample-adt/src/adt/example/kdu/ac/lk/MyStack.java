package adt.example.kdu.ac.lk;

public class MyStack implements Stack {

    // store elements of stack
    private final int[] arr;
    // represent top of stack
    private int top;
    // total capacity of the stack
    private final int capacity;

    // Creating a stack
    MyStack(int size) {
        // initialize the array
        // initialize the stack variables
        arr = new int[size];
        capacity = size;
        top = -1;
    }

    @Override
    public void push(int x) {

        if (isFull()) {
            System.out.println("Stack OverFlow");
            // terminates the program
            System.exit(1);
        }

        // insert element on top of stack
        System.out.println("Inserting " + x);
        arr[++top] = x;
    }

    @Override
    public int pop() {

        // if stack is empty
        // no element to pop
        if (isEmpty()) {
            System.out.println("STACK EMPTY");
            // terminates the program
            System.exit(1);
        }

        // pop element from top of stack
        return arr[top--];
    }

    @Override
    public Object top() {
        // if stack is empty
        // no element to pop
        if (isEmpty()) {
            System.out.println("STACK EMPTY");
            // terminates the program
            System.exit(1);
        }
        // pop element from top of stack
        return arr[top];
    }

    @Override
    public Object topAndPop() {
        // if stack is empty
        // no element to pop
        if (isEmpty()) {
            System.out.println("STACK EMPTY");
            // terminates the program
            System.exit(1);
        }
        // pop element from top of stack
        return arr[top--];
    }

    @Override
    public boolean isEmpty() {
        return top == -1;
    }

    // check if the stack is full
    public Boolean isFull() {
        return top == capacity - 1;
    }

    // display elements of stack
    public void printStack() {
        for (int i = 0; i <= top; i++) {
            System.out.print(arr[i] + ", ");
        }
    }
}
