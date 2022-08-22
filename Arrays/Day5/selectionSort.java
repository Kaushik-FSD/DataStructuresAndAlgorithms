package Arrays.Day5;

public class selectionSort {
    public static void selectionSortAlgo(int arr[], int n){
        for(int i = 0; i<n-1; i++){
            int minIdx = i;
            for(int j = i+1; j<n; j++){
                if(arr[j] < arr[minIdx])
                    minIdx = j;
            }

            Arrays.swapElements.swap(arr, i, minIdx);
        }
    }
}
