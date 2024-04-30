

import java.util.ArrayList;

public class LetterCombination {

    public static void main(String[] args) {

        ArrayList <String> ans = letterCombinationdd("", "23");
        System.out.println(ans);
        
    }
    static ArrayList<String> letterCombinationdd(String p , String up){
        if(up.isEmpty()){
            ArrayList <String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        int digit = up.charAt(0) - '0';

        ArrayList<String> ans = new ArrayList<>();

        for (int i = (digit-1)*3; i < digit*3 ; i++) {

            char ch = (char)('a'+i);

         ans.addAll(letterCombinationdd(p+ch, up.substring(1)));

            
            
        }
        return ans;


    }
    
}
