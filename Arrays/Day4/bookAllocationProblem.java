package Arrays.Day4;

public class bookAllocationProblem {
    public int books(int[] A, int B) {

        if(B>A.length){
            return -1;
        }

        int s = 0;
        int sum = 0;
        int ans = -1;
        for(int ele: A){
            sum += ele;
        }
        int e = sum;

        while(s<=e){
            int mid = s + (e-s)/2;
            if(isPossible(A, B, mid)){
                ans = mid;
                e = mid-1;
            }else{
                s = mid+1;
            }
        }
        return ans;
    }

    private static boolean isPossible(int arr[], int m, int mid){
        int studentCount = 1;
        int pageSum = 0;

        for(int i = 0; i<arr.length; i++){
            if(pageSum + arr[i] <= mid){
                pageSum += arr[i];
            }else{
                studentCount++;
                if(studentCount > m || mid < arr[i]){
                    return false;
                }
                pageSum = arr[i];
            }
        }
        return true;
    }
}
