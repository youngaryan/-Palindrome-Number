import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

class Solution {
    public boolean isPalindrome(int x) {
        boolean palindrome = false;
        List<Integer> i1 = new ArrayList<>();
        List<Integer> i2 = new ArrayList<>();

        String intStr = Integer.toString(x);

        for (int i = 0; i < intStr.length(); i++) {
            i1.add((int) intStr.charAt(i));
        }
        for (int i = intStr.length()-1; i>=0 ;i--) {
            i2.add((int) intStr.charAt(i));
        }

        for (int i = 0; i < intStr.length() ; i++) {
            if (!Objects.equals(i1.get(i), i2.get(i))) {
                palindrome = false;
                break;
            }
            else
                palindrome=true;

        }
        return palindrome;
    }
}