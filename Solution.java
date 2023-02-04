public class Solution {
    public static void main(String[] args) {
        int [] arr = {2,3,4};
        System.out.println(new Solution().maxproduct(arr));
    }
    public int maxproduct(int[] nums){
        int mini = 100, maxx = -100,ans = 1000000;
        for(int i:nums){
            if(i<0){
                int temp = maxx;
                maxx = mini;
                mini = temp;
            }
            maxx = Math.max(maxx*i,i);
            mini = Math.min(i,i*mini);
            ans = Math.min(ans,Math.min(mini,maxx));

        }
        return ans;
    }
}
