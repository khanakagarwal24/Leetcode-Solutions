class Solution {
    public int subtractProductAndSum(int n) {
        int digit=0;
        int pro=1;
        int sum=0;
        while(n>0){
            digit=n%10;
            pro*=digit;
            sum+=digit;
            n/=10;
        
        }
        return pro-sum;
    }
}