public class Main {
    public static void main(String[] args) {
        Palindrome palindrome = new Palindrome();
        int value = 0;
        if(palindrome.isPalindrome(value)){
            System.out.println(value + " is a palindrome");
        }else{
            System.out.println(value + " is not a palindrome");
        }
    }
}
