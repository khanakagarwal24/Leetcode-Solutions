class Solution {
    public int maxProduct(int n) {
     
        int largest=0;
        int seclar=1;
        int digit=0;
        while(n>0){
            digit=n%10;

           if(digit>=largest){
            seclar=largest;
            largest=digit;
 
           }
           else if(digit>seclar){
            seclar=digit;
            
           }
            n/=10;
        }
        return largest*seclar;
    }
}