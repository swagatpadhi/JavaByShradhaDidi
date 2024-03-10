package generics;

import java.util.ArrayList;
import java.util.Arrays;

public class StorageBox<T>{
     T val;
    public void add(T data)  {
        val = data;
    }

    public static void main(String[] args) {
        StorageBox<Integer> box = new StorageBox<Integer>();
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(33);
        box.add(5);//type safe i.e, we must enter integer other than integer will result
        //to compile time error.
        System.out.println(box.val);
    }
}

