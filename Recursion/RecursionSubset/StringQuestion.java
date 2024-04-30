// package Recursion.RecursionSubset;

import java.util.Scanner;

public class StringQuestion {
    public static void main(String[] args) {
        System.out.println("Enter a string");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        skip("",str);

    }

    static void skip(String p, String up){
        if(up.isEmpty()){
            System.out.println(p);
            return ;

        }

        char ch = up.charAt(0);
        System.out.println(up.substring(1));
        if(ch == 'a'){
            skip(p, up.substring(1));

        }else{
            skip(p+ch, up.substring(1));
        }
        // if
    }
    
}
