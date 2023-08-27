package java_exercise1_solutions;
//Write a function that takes in age as input and returns if that
// person is eligible to vote or not. A person of age > 18 is eligible to vote
import java.util.Scanner;
public class Q5 {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        System.out.println("Please tell your age: ");
        int age = scn.nextInt();
        eligibleForVote(age);
    }

    public static void eligibleForVote(int age) {
        if(age > 18){
            System.out.println("can vote");
        }
        else{
            System.out.println("sorry you can't vote");
        }
    }
}
