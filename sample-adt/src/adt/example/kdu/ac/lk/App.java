package adt.example.kdu.ac.lk;

public class App {

    public static void main(String[] args) {

        Stack customStack = new MyStack(5);

        customStack.push(1);
        customStack.push(2);
        customStack.push(3);

        System.out.print("Stack: ");
        customStack.printStack();
        // remove element from stack
        customStack.pop();
        System.out.println("\nAfter popping out");
        customStack.printStack();
    }
}
