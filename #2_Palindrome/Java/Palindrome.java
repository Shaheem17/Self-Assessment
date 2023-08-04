public class Palindrome {

    public boolean isPalindromeByString(int x){
        String integerString = Integer.toString(x);
        int left = 0;
        int right = integerString.length() - 1;
        while(left < right){
            if(integerString.charAt(left) != integerString.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public boolean isPalindrome(int x){
        if (x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }
        int original = x;
        int reversed = 0;
        while (x > 0) {
            int digit = x % 10;
            reversed = reversed * 10 + digit;
            x /= 10;
        }
        return original == reversed;
    }

}
