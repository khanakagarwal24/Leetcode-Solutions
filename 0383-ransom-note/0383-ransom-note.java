class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int fre[]=new int[26];
        
        for(int i=0;i<magazine.length();i++){
            char ch1=magazine.charAt(i);
            fre[ch1-'a']+=1;
        }for(int i=0;i<ransomNote.length();i++){
            char ch1=ransomNote.charAt(i);
            fre[ch1-'a']-=1;
            if(fre[ch1-'a']<0){
                return false;
            }
        }
        return true;
    }
}