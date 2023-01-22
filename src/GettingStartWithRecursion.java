import java.util.*;
public class GettingStartWithRecursion {
    public static void main(String[] args) {
      // print 1 to 5 numbers using recursion
        Scanner sc = new Scanner (System.in);
        int start = sc.nextInt();
        int end = sc.nextInt();
        int n = start ;
        print(n , end);
    }
    static void print(int n , int end){
       if(n==end) {
           System.out.println(end);
           return;
       }
            System.out.println(n);
            print(n+1 , end);
    }
}