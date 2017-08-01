public class Solution {
    public String reverseWords(String s) {
        char [] words = s.toCharArray();
        int i = 0;
        int pos = 0;
        while(pos < words.length){
            if(words[pos] == ' ')
            {
                reverseChar(words, i, pos-1);
                i = pos + 1;
            }
            pos++;
        }
        reverseChar(words,i, words.length - 1);
        return new String(words);
        
    }
    
    
    public void reverseChar(char[] s, int start, int end){
        while(start <  end){
            char temp  = s[start];
            s[start] =  s[end];
            s[end] = temp;
            start++;
            end--;
        }
    }
}
