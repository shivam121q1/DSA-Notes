import java.util.ArrayList;

public class Permutation {

    public static void main(String[] args) {

        perm("", "abc");
        ArrayList<String> ans  = permArray("", "abc");
        System.out.println(ans);
        
    }

    static void perm(String p, String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }

        
        char ch = up.charAt(0);

        for(int i = 0 ; i <=p.length() ; i ++){
            String f = p.substring(0, i);
            String s = p.substring(i,p.length());
            perm(f+ch+s, up.substring(1));
        }

    }
    static ArrayList<String> permArray(String p, String up){
        if(up.isEmpty()){
            ArrayList<String>  list = new ArrayList<>();
            list.add(p);
            return list;
        }

        ArrayList<String>  ans = new ArrayList<>();


        
        char ch = up.charAt(0);

        for(int i = 0 ; i <=p.length() ; i ++){
            String f = p.substring(0, i);
            String s = p.substring(i,p.length());
              ans.addAll(permArray(f+ch+s, up.substring(1)));
        }
        return ans;

    }
    
}
