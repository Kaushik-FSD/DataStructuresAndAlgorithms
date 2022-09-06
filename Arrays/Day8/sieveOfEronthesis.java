package Arrays.Day8;
import java.util.*;

public class sieveOfEronthesis {

    //to count the prime numbers from 0 to N -> T.C = O(n*log(log n))
    public int countPrimes(int n) {

        if(n <= 1){
            return 0;
        }
        boolean arr[] = new boolean[n+1];
        Arrays.fill(arr, true);

        arr[0] = false;
        arr[1] = false;
        int c = 0;
        for(int i = 2; i<n; i++){
            if(arr[i] == true){
                c++;
            }

            for(int j = 2*i; j<n; j = j+i){
                arr[j] = false;
            }
        }
        return c;
    }
}
