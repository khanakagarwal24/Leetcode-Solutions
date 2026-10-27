class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] ans=new int[2];
        ans[0]=first(nums,target);
        ans[1]=last (nums, target);
        return ans;
    }
 int first (int[] nums,int target){
            int start=0;
            int end=nums.length-1;
            int ans=-1;
            while(start<=end){
            int mid=(start+end)/2;
            if( target==nums[mid]){
               ans=mid;
               end=mid-1;
            }
            else if(nums[mid]>target){
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        return ans;
 }

         int last (int[] nums,int target){
            int start=0;
            int end=nums.length-1;
            int ans=-1;
            while(start<=end){
            int mid=(start+end)/2;
            if( target==nums[mid]){
               ans=mid;
               start=mid+1;
            }
            else if(nums[mid]>target){
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        return ans;
 }
}
