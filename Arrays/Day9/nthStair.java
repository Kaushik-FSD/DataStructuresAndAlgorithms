package Arrays.Day9;

public class nthStair {

    // count ways to reach the n-th stair. (possible jumps are 1 jump and 2 jumps)
    public static int jumpNthStair(int n){
        if(n < 0)
            return 0;

        if(n == 0)
            return 1;

        int ans = jumpNthStair(n-1) + jumpNthStair(n-2);

        return ans;
    }
}
