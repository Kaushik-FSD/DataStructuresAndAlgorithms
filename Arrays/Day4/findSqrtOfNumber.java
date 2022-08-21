package Arrays.Day4;

public class findSqrtOfNumber {
    public static double mySqrt(int x) {
        int ans =  binarySearch(x);
        double precisionAns = findPrecision(x, 3, ans);
        return precisionAns;
    }

    //This function basically finds the decimal points after the perfect sqrt of a number
    private static double findPrecision(int n, int precision, int tempSol){
        double factor = 1;
        double ans = tempSol;

        for(int i = 0; i<precision; i++){
            factor = factor/10;
            for(double j = ans; j*j<n; j += factor){
                ans = j;
            }
        }
        return ans;
    }

    public static int binarySearch(int n){

        if(n == 0) return 0;
        // we are keeping start = 1 because zero can't be a answer as sqrt(0) = 0;
        int s = 1;
        int e = n;
        int ans = -1;

        while(s <= e){
            int mid = s + (e-s)/2;
            if(mid == n/mid){ //mid * mid == n
                ans = mid;
                return ans;
            }else if(mid < n/mid){
                ans = mid;
                s = mid + 1;
            }else{
                e = mid-1;
            }
        }
        return ans;
    }
}
