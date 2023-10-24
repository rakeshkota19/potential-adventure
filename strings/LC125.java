package strings;

public class LC125 {
    public boolean isAlphaNumeric(char c) {
        if ( ( c >= 'a' && c <= 'z') ||
                ( c >= 'A' && c <= 'Z') ||
                ( c >= '0' && c <= '9') )
            return true;

        return false;
    }

    public boolean isPalindrome(String s) {
        int len = s.length();
        int low = 0, high = len - 1;

        while(low <= high) {

            if (!isAlphaNumeric(s.charAt(low))) {
                low++;
            }
            else if (!isAlphaNumeric(s.charAt(high))) {
                high--;
                continue;
            }
            else {

                if (Character.toLowerCase(s.charAt(low)) !=
                        Character.toLowerCase(s.charAt(high)))
                    return false;
                low++;
                high--;
            }
        }
        return true;
    }
}
