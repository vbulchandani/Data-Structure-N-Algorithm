/*
Implement strStr().

Returns the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.
*/


public class Solution {
    public int strStr(String haystack, String needle) {
        if(needle.length()==0)
            return 0;
        if(needle.length()>haystack.length())
            return -1;
        int threshold = haystack.length() - needle.length();
        int difference = needle.length();
        for(int pos=0; pos<=threshold; pos++){
            if(haystack.substring(pos,pos+difference).equals(needle))
                return pos;
        }
        return -1;
    }
}