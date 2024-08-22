//QUESTION-->
//Given an array of strings words, return the first palindromic string in the array. If there is no such string, return an empty string "".

// A string is palindromic if it reads the same forward and backward.

//ANSWER-->
import java.util.*;
class Solution {
    private boolean isPalindrome(String str){
        int i=0;
        int j=str.length()-1;
        while(i<j){
            if(str.charAt(i)!=str.charAt(j))
                return false;
                i++;
                j--;
            
        }
            return true;
    }
    public String firstPalindrome(String[] words) {
        for(String word:words){
            if(isPalindrome(word)){

                return word;
            }
        }
        return"";
    }
}