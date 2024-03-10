 class Car {

}

class BMW extends Car{

}

public class T{

}

class Run{
    public static void main(String[] args) {
        BMW bmw = new BMW();
//        upcasting.Storing subclass
//         instance in superclass variable.
        Car c = bmw;
        //downcasting.
        BMW b = (BMW) c;

    }
}
