import java.util.HashMap;

public class Optimal_partitions {
    public static void main(String[] args) {
        System.out.println(new Optimal_partitions().ways("abacaba")+1);
    }
    int ways(String s){
        int left=0,right=0;
        HashMap<Character,Integer> hm = new HashMap<>();
        int cnt=0;
        for(int i=0;i<s.length();i++){
            
            if(hm.containsKey(s.charAt(i)) && left<=hm.get(s.charAt(i))){
                left = hm.get(s.charAt(i))+1;
                cnt++;
            }
             
            hm.put(s.charAt(i),i);
            right++;
        }
        return cnt;
    }
}
