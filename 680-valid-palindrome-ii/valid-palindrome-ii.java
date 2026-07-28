class Solution {

            private boolean isPalindromeInRange(String s, int start, int end) {
    while (start < end) {
        if (s.charAt(start) != s.charAt(end)) {
            return false;
        }
        start++;
        end--;
    }
    return true;
}

    public boolean validPalindrome(String s) {


 int front = 0, end = s.length() - 1;
    while (front < end) {
        if (s.charAt(front) != s.charAt(end)) {
            return isPalindromeInRange(s, front+1, end) || isPalindromeInRange(s, front, end-1);
        }
        front++;
        end--;
    }
    return true;
        
    }
}