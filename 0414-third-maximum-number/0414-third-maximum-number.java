class Solution {
    public int thirdMax(int[] nums) {
        long l=Long.MIN_VALUE;
        long s=Long.MIN_VALUE;
        long t=Long.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            long curr=nums[i];
            if(curr>l){
                t=s;
                s=l;
                l=curr;
            }
            if(curr>s && curr!=l){
                 t=s;
                s=curr;
            }
            if(curr>t&& curr!=s && curr!=l){
                t=curr;
            }
        }
        if(t==Long.MIN_VALUE){
            return (int) l;
        }
        else{
return (int) t;
        }
        
    }
}