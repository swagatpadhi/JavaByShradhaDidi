package linkedList;

public class Runner {
    public static void main(String[] args){
        LL list = new LL();
        list.addFirst("Swagat");
        list.addLast("cool");
        list.addLast("boy");
        list.deleteFirst();
        list.traverse();
        System.out.println();
        list.addFirst("Kabir");
        list.deleteLast();
        list.traverse();
    }
}
