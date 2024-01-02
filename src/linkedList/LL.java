package linkedList;

public class LL {
    Node head;

    public void addFirst(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        }else{
            newNode.next = head;
            head = newNode;
        }

    }

    public void addLast(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node currNode = head;
            while (currNode.next != null) {
                currNode = currNode.next;
            }
            currNode.next = newNode;
        }
    }

    public void traverse() {
        if (head == null) {
            System.out.println("Linked-List is empty.");
        } else {
            Node currNode = head;
            while(currNode != null){
                System.out.print(currNode.data+"-->");
                currNode = currNode.next;
            }
            System.out.print("null");
        }
    }
}
