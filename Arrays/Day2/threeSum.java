package Arrays.Day2;

import java.util.*;

public class threeSum {
    public static ArrayList<ArrayList<Integer>> findTripletSum(int arr[], int n, int K){
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();

        for(int i = 0; i<n-2; i++){
            int low = i+1;
            int high = n-1;

            while(low < high){
                if(arr[i] + arr[low] + arr[high] == K){
                    ArrayList<Integer> res = new ArrayList<>();
                    res.add(arr[i]);
                    res.add(arr[low]);
                    res.add(arr[high]);
                    ans.add(res);

                    //skipping the same low and high elements
                    int x = arr[low];
                    int y = arr[high];
                    while(low < high && arr[low] == x)
                        low++;

                    while(low < high && arr[high] == y)
                        high--;
                }else if(arr[i] + arr[low] + arr[high] < K)
                    low++;
                else
                    high--;
            }
            //skipping the same i-th elements
            while(i+1 < n && arr[i] == arr[i+1])
                i++;
        }

        return ans;
    }
}
