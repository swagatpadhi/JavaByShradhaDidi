package linkedList;

public class LL {
    Node head;

    public void addFirst(String data) {
        Node newNode = new Node(data);
        //condition for no node at all.
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

    public void deleteFirst(){
        if(head == null){
            System.out.println("linked list is empty.");
        }else {
            head = head.next;
        }
    }

    public void deleteLast(){
        if(head == null){
            System.out.println("linked list is empty");
        }
        else{
            Node currNode = head;
            while(currNode.next.next != null){
                currNode = currNode.next;
            }
            currNode.next = null;
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

    public void size(){
        if(head == null){
            System.out.println("size is 0");
        } else if (head.next == null) {
            System.out.println("size is 1");
        }else{
            Node currNode = head;
            int i = 1;
            while(currNode.next != null){
                currNode = currNode.next;
                i++;
            }
            System.out.println("size is "+i);
        }
    }
}
