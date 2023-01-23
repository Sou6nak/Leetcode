import java.util.*;
public class Coin_change_2 {
    public int count(int[] coins, int amount, int index) {
        if (amount == 0) {
            return 1;
        }
        if (amount < 0 || index >= coins.length) {
            return 0;
        }
        int ways = 0;
        ways += count(coins, amount - coins[index], index);
        ways += count(coins, amount, index + 1);
        return ways;
    }
    public static void main(String[] args){
        int []arr = {1,2,5};
        int target = 5;
        int []dp=new int[target+1];
        Arrays.fill(dp,-1);
    
        int take=new Coin_change_2().count(arr,target,0);
        System.out.println(take);
    }
    
}
