

import java.util.ArrayList;

public class Solution {


    public static void main(String[] args) {
        ArrayList<String> ans  = letterCombinations("544");
        System.out.println(ans);

    }
    static ArrayList<String> letterCombinations(String digits) {
        if(digits.isEmpty()){
            return new ArrayList<>();
        }

        ArrayList<String> ans = new ArrayList<>();

        ans.add("");

        final String[] digitToLetters = {"",    "",    "abc",  "def", "ghi",
                                     "jkl", "mno", "pqrs", "tuv", "wxyz"};

        for(final char d : digits.toCharArray()){
            ArrayList<String> temp  = new ArrayList<>();
            for(String s : ans){
                for(char c : digitToLetters[d-'0'].toCharArray()){
                    temp.add(s+c);
                }
            }
            ans = temp;
        }               


        return ans;              





        
        
    }
}
