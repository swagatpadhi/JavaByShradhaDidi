package queue.queueUsingArray;

public class Queue_Array {
    int f = -1;
    int r = -1;
    //array size basically
    int arrSize = 5;
    int[] q;

    Queue_Array() {
        q = new int[arrSize];
    }

    public void enqueue(int data) {
        //overflow condition checking
        if (r == arrSize - 1) {
            System.out.println("overflow, can't enqueue in a full queue");
        } else {
            if (f == -1 && r == -1) {
                f = 0;
                r = 0;
                q[r] = data;
                System.out.println(data + " enqueued");
            } else {
                r++;
                q[r] = data;
                System.out.println(data + " enqueued");
            }
        }
    }

    public void dequeue() {
        if (r == -1) {
            System.out.println("underflow, can't dequeue in an empty queue.");
        }else {
            int deqElement = q[f];
            f++;
            System.out.println(deqElement + " dequeued");
        }
    }

    public static void main(String[] args) {
        Queue_Array myQueue = new Queue_Array();
        myQueue.enqueue(5);
        myQueue.enqueue(7);
        myQueue.enqueue(99);
        myQueue.dequeue();
        myQueue.enqueue(87);
        myQueue.dequeue();
    }
}
