class Solution {
    public int minSteps(String s, String t) {
         int[] ans=new int[26];
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            ans[ch-'a']++;
        }
        for(int i=0;i<t.length();i++){
            char ch=t.charAt(i);
            ans[ch-'a']--;
        }
        int count=0;
         for(int i=0;i<ans.length;i++){
            if(ans[i]>0){
                count+=ans[i];
            }
         }
         return count;
    }
}