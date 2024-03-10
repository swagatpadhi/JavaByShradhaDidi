public class WrapperClass {
    public static void main(String[] args) {
        //primitive data type to object of its corresponding
        // wrapper class -> boxing
        int a = 10;
        Integer b = a;//automatically, so auto-boxing
        System.out.println(b);

        //boxing
        int x = 30;
        Integer y = Integer.valueOf(x);
        System.out.println(y);

        //unboxing
        Integer result = 100;
        int value = result.intValue();
        System.out.println(value);

        /* autoboxing */
        Integer price = 300;
        int finalVal = price;
    }
}
