package Lec17_recursion_lvl_easy;

public class PreAndPostProcessing {
    public static void main(String[] args) {
        print1To5(1);
    }

    private static void print1To5(int i) {
        if(i > 5){
            return;
        }
        System.out.println(i);//pre-processing
        print1To5(i + 1);
        System.out.println(i);//post-processing
    }
}
