package linkedList;

public class Runner {
    public static void main(String[] args){
        LL list = new LL();
        list.addFirst("swagat");
        list.addLast("salman");
        list.addLast("kartik aryan");
        list.addLast("kohli");
        list.deleteFirst();
        list.deleteLast();
        list.addLast("bobby deol");
        list.addLast("rk");
        list.traverse();
        System.out.println();
        list.size();
    }
}
