class Solution {
    public boolean judgeCircle(String moves) {
       int[ ]arr=new int[4];
       for(int i=0;i<moves.length();i++){
        char ch=moves.charAt(i);
        if(ch=='D'){
            arr[0]++;
        }
        else if(ch=='L'){
            arr[1]++;
        }
        else if(ch=='R'){
            arr[2]++;
        }
        else if(ch=='U'){
            arr[3]++;
        }
       }
       if(arr[0]!=arr[3] || arr[1]!=arr[2]){
        return false;
       }
       return true;
    }
}