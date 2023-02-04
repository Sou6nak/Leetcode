import java.util.ArrayList;
import java.util.HashSet;

public class Unique_substring {
    public static void main(String[] args) {
        String s = "abacaba";
        ArrayList<String> obj = sub(s);
        System.out.println(obj);
        int cnt=0;
        for(String i:obj){
            if(uni(i)){
                cnt++;
                System.out.println(i);
            }
        }
        // return cnt;
    }
    static ArrayList<String> sub(String s){
        ArrayList<String> arr = new ArrayList<>();
        for(int i=0;i<s.length();i++){
            for(int k=i;k<s.length();k++){
                arr.add(s.substring(i, k+1));
            }
        }
        return arr;
    }

    static boolean uni(String s){
        HashSet<Character> hs = new HashSet<>();
        for(int i=0;i<s.length();i++){
            if(!hs.contains(s.charAt(i)))
                hs.add(s.charAt(i));
            else
                return false;
        }
        return true;
    }
    
}
