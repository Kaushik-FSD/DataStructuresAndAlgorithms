package Arrays.Day9;

public class fibo {

    public static int nthFibonacchi(int n){
        if(n == 0 || n == 1)
            return n;

        int ans = nthFibonacchi(n-1) + nthFibonacchi(n-2);

        return ans;
    }
}
