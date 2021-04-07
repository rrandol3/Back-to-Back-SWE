package root.Primitives;

public class Primitives {
    public static void main(String[] args) {
        System.out.println(isPalindrome(1111));
    }

    // Check if a number is a palindrome
    public static Boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        // gets total digits
        double log = Math.log10(x);
        int totalDigits = (int) (Math.floor(log)) + 1;
        int mask = (int) Math.pow(10, totalDigits - 1);

        for (int i = 0; i < (totalDigits / 2); i++) {
            int mostSignificantDigit = x / mask;// this gets first digit on the left
            int onesPlaceDigit = x % 10;// this gets the first digit on the right
            if (mostSignificantDigit != onesPlaceDigit) {
                return false;
            }
            x %= mask;// removes most significant digit
            x /= 10;// removes ones place digit
            mask /= 100;// removes 2 0's from mask since we just lost 2 digits
        }
        return true;
    }

    // Reverse Bits
    public static int reverseBits(int x) {

        return 1;
    }
}
