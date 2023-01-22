public class sumOfNnaturalNumber {
    public static void main(String[] args) {
        int n = 1;
        int ans = sum(n);
        System.out.println("Sum of 0 to "+n+" is : "+ans);
    }
    static int sum(int n){
        if(n==1 || n== 0) return n;
        return n + sum(n-1);
    }
}
