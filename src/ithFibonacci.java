public class ithFibonacci {
    public static void main(String[] args) {
        //find ith fibonacci number
        // addtion of it's previos two number
        //0th       1th     2nd     3rd     4th     5th     6th     7th     8th     9th
        // 0        1       1       2       3       5       8       13      21      34
        int n = 9 ;
        int ans = fibo(n);
        System.out.println(ans);
    }
    static int fibo(int n){
        //Base condition
        if(n==0) return 0 ;
        if(n==1) return 1 ;
        if(n==2) return 1 ;
        return fibo(n-1) + fibo(n-2);
    }
}
