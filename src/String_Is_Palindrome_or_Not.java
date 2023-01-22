import java.util.Scanner;
public class String_Is_Palindrome_or_Not {
        public static boolean isPalindrome(String s) {
            if (s.length() == 0 || s.length() == 1) {
                return true;
            }
            if (s.charAt(0) == s.charAt(s.length() - 1)) {
                return isPalindrome(s.substring(1, s.length() - 1));
            }
            return false;
        }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string:");
        String s = sc.nextLine();
        if (isPalindrome(s)) {
            System.out.println(s + " is a palindrome.");
        } else {
            System.out.println(s + " is not a palindrome.");
        }
    }
}
/*
checking the first and last characters
of the string. If they are the same, it calls the same method with the substring of
the input string without the first and last characters. If they are different, it
returns false.
The main method uses a Scanner object to take input from the user, and calls the
isPalindrome method with the input string. The result of the method (true or false)
 is used to print whether the input string is a palindrome or not.
 */


