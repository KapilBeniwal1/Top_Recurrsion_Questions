import java.util.*;
public class Reverseprinting {
    public static void main(String[] args) {

        //print numbers in reverse
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // start
        int end = sc.nextInt();
        printReverse(n,end);
    }
    static void printReverse(int n , int end){
        if(n==end) {
            System.out.println(end);
            return;
        }
        System.out.println(n);
        printReverse(n-1 , end);
    }
}
