package Arrays.Day5;

public class bubbleSort {
    public static void bubbleSortAlgo(int arr[], int n){
        for(int i = 1; i<n; i++){
            for(int j = 0; j<n-i; j++){
                if(arr[j] > arr[j+1]){
                    Arrays.swapElements.swap(arr, j, j+1);
                }
            }
        }
    }
}
