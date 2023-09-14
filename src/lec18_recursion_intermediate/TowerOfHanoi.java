package lec18_recursion_intermediate;

public class TowerOfHanoi {
    public static void main(String[] args) {
        int noOfPlates = 2;
        towerOfHanoi(noOfPlates,"source","helper","destination");
    }
    /*
    1.If more than one plates are on the source, then keep the biggest plate on source and move other plates
      from source to helper by making helper as destination and destination as helper recursively.

    2.Then, move the biggest plate from source to destination.

    3.Finally, move the other plates which are on the helper to destination by making helper as source and
    source as helper recursively.*/
    private static void towerOfHanoi(int noOfPlates, String source, String helper, String destination) {
        if (noOfPlates == 1) {
            System.out.println("move plate " + noOfPlates + " from " + source + " to " + destination);
            return;
        }
        towerOfHanoi(noOfPlates - 1, source,destination,helper);
        System.out.println("move plate "+noOfPlates+" from "+source+ " to "+ destination);
        towerOfHanoi(noOfPlates - 1, helper, source, destination);
    }
}
