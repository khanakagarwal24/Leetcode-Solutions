class Solution {
    public String reverseWords(String s) {
      
        // Split the string by one or more whitespace characters
        String[] words = s.trim().split("\\s+");
        
        StringBuilder sb = new StringBuilder();
        
        // Traverse the words array from end to start
        for (int i = words.length - 1; i >= 0; i--) {
            sb.append(words[i]);
            if (i != 0) {
                sb.append(" ");
            }
        }
        
        return sb.toString();
  

    }
}