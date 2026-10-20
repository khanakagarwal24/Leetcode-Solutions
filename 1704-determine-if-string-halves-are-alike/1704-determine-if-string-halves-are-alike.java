class Solution {
    public boolean halvesAreAlike(String s) {
        int vowel1=0;
        int vowel2=0;
        int h=s.length()/2;
        for(int i=0;i<h;i++){
            char ch1=s.charAt(i);
              char ch2=s.charAt(i+h);
              if(isvowel(ch1)){
                vowel1+=1;
              }
              if(isvowel(ch2)){
                vowel2+=1;
              }
        }
        return vowel2==vowel1;
    }
    private boolean isvowel(char ch1){
        return(ch1=='a'||ch1=='e'||ch1=='i'||ch1=='o'||ch1=='u'||
        ch1=='A'||ch1=='E'||ch1=='I'||ch1=='O'||ch1=='U');
    }
}