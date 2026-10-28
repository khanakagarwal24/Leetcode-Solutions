class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        
        int max=0;
        int min=1;
       
        for (int i:piles){
            max=Math.max(max, i);
        }
        int ans=max;
        while(min<=max){
            int speed=(min+max)/2;
            long thours=0;
            for(int j=0;j<piles.length;j++){
                 thours+=(long)(speed + piles[j]-1)/speed;
            }
                if( thours<=h){
              ans=speed;
              max=speed-1;
                }
                else{
                min=speed+1;
                }
            
        }
        return ans;
    }
}