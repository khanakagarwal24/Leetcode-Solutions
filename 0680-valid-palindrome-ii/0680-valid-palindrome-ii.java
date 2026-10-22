class Solution {
    public boolean validPalindrome(String s) {
        int n=s.length();
        int left=0;
        int right=n-1;
        StringBuilder ans=new StringBuilder(s);
        while(left<right){
            char l=s.charAt(left);
            char r=s.charAt(right);
            if(l==r){
                left++;
                right--;
            }
            else  {
                return isPalindromeRange(s, left + 1, right) ||  isPalindromeRange(s, left, right - 1);
            }
        }
        return true;
    }
    private boolean isPalindromeRange(String s, int i, int j) {
        while (i < j) {
            if (s.charAt(i) != s.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}