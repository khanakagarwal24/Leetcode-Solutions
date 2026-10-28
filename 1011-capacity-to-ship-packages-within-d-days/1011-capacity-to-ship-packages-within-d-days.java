class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int max=0;
        int min=0;
        for (int i:weights){
            min=Math.max(i,min);
            max+=i;
        }
        int ans=max;
        while(min<=max){
            int cap=(min+max)/2;
            int taken_days=1;
            int curr=0;
            for(int i:weights){
                curr+=i;
                if(curr>cap){
                    taken_days++;
                    curr=i;
                }
            }
            if(taken_days<=days){
                ans=cap;
                max=cap-1;
            }
            else{
                min=cap+1;
            }
        }
        return ans;
    }
}