public class Main {
    public static void main(String [] args) {
        String s = "madam";
        boolean isPalindrome = isPalindrome(s);
        System.out.println(isPalindrome); // true
    }

    public static boolean isPalindrome(String s) {
        int length = s.length();
        for (int i = 0; i < length / 2; i++) {
            if (s.charAt(i) != s.charAt(length - 1 - i)) {
                return false;
            }
        }
        return true;
    }
}