class Solution {
    public boolean isPalindrome(int x) {
        
    long rev=0;
    int no=0;
    int temp=x;
    if(x<0){
        return false;
    }
    while(x>0){
        no=x%10;
        rev=rev*10+no;
        x/=10;
    }
    return temp==rev;
    }
}
    
