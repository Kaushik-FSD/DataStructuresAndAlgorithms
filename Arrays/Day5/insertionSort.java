package Arrays.Day5;

public class insertionSort {
    public static void insertionSortAlgo(int arr[], int n){
        for(int i = 1; i<n; i++){
            int temp = arr[i];
            int j = i-1;
            for(; j>=0; j--){
                if(arr[j] > temp){
                    arr[j+1] = arr[j];
                }else{
                    break;
                }
            }
            arr[j+1] = temp;
        }
    }
}
