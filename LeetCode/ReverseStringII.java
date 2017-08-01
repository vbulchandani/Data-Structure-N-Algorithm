/*
Given a string and an integer k, you need to reverse the first k characters for every 2k characters counting from the start of the string. If there are less than k characters left, reverse all of them. If there are less than 2k but greater than or equal to k characters, then reverse the first k characters and left the other as original.
Example:
Input: s = "abcdefg", k = 2
Output: "bacdfeg"
Restrictions:
The string consists of lower English letters only.
Length of the given string and k will in the range [1, 10000]
*/

public class Solution {
    public String reverseStr(String s, int k) {
        char[] words = s.toCharArray();
        if(k < 2)
            return s;
        for(int pos = 0; pos < words.length; pos = pos + 2*k)
        {
            reverseChar(words, pos, Math.min(pos+(k-1), words.length - 1));
        }
        return new String(words);
    }
    
    public void reverseChar(char [] word, int start, int end){
        while(start < end){
            char temp = word[start];
            word[start] = word[end];
            word[end] = temp;
            start++;
            end--;
        }
    }
}