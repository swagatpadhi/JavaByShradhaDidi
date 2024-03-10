public class WrapperClasses {
    public static void main(String[] args) {
        Integer wrapper = 15;//auto-boxing
        int c = wrapper;//auto-unboxing
        System.out.println("after boxing: "+ wrapper);
        System.out.println("after unboxing: "+c);
    }
}
