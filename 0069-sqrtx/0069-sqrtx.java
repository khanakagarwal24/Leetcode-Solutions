class Solution {
    public int mySqrt(int x) {
        long start=0;
        long end= x/2 + 1;
        if(x<2){
            return x;
        }
        while(start<=end){
         long mid=(start+end)/2;
         if(mid*mid==x){
              return (int)mid;
           }
           if(mid*mid>x){
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        return (int)end;
    }
}
