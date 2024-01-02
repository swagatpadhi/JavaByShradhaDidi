package stack.stackUsingLinkedList;

class Stack{
    //instead of head we'll write top.
    Node top;

    public void push(int value) {
        Node newNode = new Node(value);
        if(top == null) {
            top = newNode;
        }else {
            newNode.next = top;
            top = newNode;
        }
        System.out.println("pushed "+value+" onto the stack.");
    }

    public void pop() {
        if(top == null) {
            System.out.println("underflow, can't delete from an empty stack");
        }else {
            int poppedValue = top.data;
            top = top.next;
            System.out.println("Popped " + poppedValue + " from the stack.");
        }
    }

    public void peek() {
        if(top == null) {
            System.out.println("Can't peek from an empty stack.");
        }else{
            System.out.println("After peeking we got "+top.data);
        }
    }

    public static void main(String[] args) {
        Stack myStack = new Stack();
        myStack.push(5);
        myStack.push(67);
        myStack.push(88);
        myStack.pop();
        myStack.push(99);
        myStack.push(1);
        myStack.peek();
    }
}

class Node{
    int data;
    Node next;
    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

