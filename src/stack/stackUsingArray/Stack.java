package stack.stackUsingArray;

public class Stack {
    int max_size = 5;
    int top;
    int[] s;

    Stack() {
        s = new int[max_size];
        top = -1;
    }

    public void push(int data) {
        if (top == max_size - 1) {
            System.out.println("stack overflow, can't push onto a full stack.");
        } else {
            top = top + 1;
            s[top] = data;
            System.out.println("Pushed " + data + " onto stack.");
        }
    }

    public void pop() {
        if (top == -1) {
            System.out.println("stack underflow, can't pop from an empty stack.");
        } else {
            int x = s[top];
            top = top - 1;
            System.out.println(x + " got popped from the stack");
        }
    }

    public void peek() {
        if (top == -1) {
            System.out.println("Can't peek from an empty stack.");
        } else {
            System.out.println(s[top] + " is at top.");
        }
    }

    public static void main(String[] args) {
        Stack myStack = new Stack();
        myStack.push(5);
        myStack.push(89);
        myStack.push(43);
        myStack.pop();
        myStack.push(55);
        myStack.peek();
    }
}

