class Solution {
    public int majorityElement(int[] nums) {
       
        int n=nums.length;
        int count=1;
        int ans=nums[0];
        for(int i=1;i<n;i++){
            if(nums[i]==ans){
                count++;
            }
            else {
                count--;
            }
            if(count==0){
                ans=nums[i];
                count++;
            }
        }
        return ans;
    }
}