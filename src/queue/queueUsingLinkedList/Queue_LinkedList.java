package queue.queueUsingLinkedList;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class Queue_LinkedList {
    Node f;
    Node r;

    public void enqueue(int value) {
        Node newNode = new Node(value);
        if(f == null) {
            f = newNode;
            r = newNode;
        }else {
            r.next = newNode;
            r = newNode;
        }
        System.out.println(value + " enqueued.");
    }

    public void dequeue() {
        if(f == null ) {
            System.out.println("Underflow, can't enqueue to the queue.");
        }else {
            int data = f.data;
            f = f.next;
            System.out.println(data + " dequeued.");
        }
    }

    public void frontPeek() {
        if(f == null) {
            System.out.println("Can't peek from an empty queue.");
        }else {
            System.out.println("after peeking: "+f.data);
        }
    }

    public void displayQueue(){
        if(f == null) {
            System.out.println("Queue is empty.");
        }else {
            Node currNode = f;
            System.out.print("Queue is:");
            while(currNode != null) {
                System.out.print(currNode.data+" ");
                currNode = currNode.next;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Queue_LinkedList myQueue = new Queue_LinkedList();
        myQueue.enqueue(5);
        myQueue.enqueue(7);
        myQueue.enqueue(9);
        myQueue.displayQueue();
        myQueue.dequeue();
        myQueue.frontPeek();
        myQueue.displayQueue();

        myQueue.dequeue();
        myQueue.dequeue();
        myQueue.displayQueue();
    }
}

