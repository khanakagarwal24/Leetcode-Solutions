class Solution {
    public int heightChecker(int[] heights) {
        int n=heights.length;
        int [] expected=Arrays.copyOf(heights,n);
        for(int i=1;i<n;i++){
            int curr=heights[i];
            int prev=i-1;
            while(prev>=0 && curr<heights[prev]){
                heights[prev+1]=heights[prev];
                heights[prev]=curr;
                prev--;
            }
        }
        int count=0;
        for(int i=0;i<n;i++){
            if(expected[i]!=heights[i]){
                count++;
            }
        }
        return count;
    }
}