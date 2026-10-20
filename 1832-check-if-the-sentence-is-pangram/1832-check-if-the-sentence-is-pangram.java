class Solution {
    public boolean checkIfPangram(String sentence) {
        Set<Character> Hash_set = new HashSet<>();
        for(int i=0;i<sentence.length();i++){
            char ch=sentence.charAt(i);
            Hash_set.add(ch);
        }
        return Hash_set.size()==26;
    }
}