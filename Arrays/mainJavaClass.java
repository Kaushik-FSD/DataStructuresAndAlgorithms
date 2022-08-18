package Arrays;

import Arrays.Day1.swapAlternate;

import static Arrays.Day1.sumOfArray.*;
import static Arrays.Day1.reverseArray.*;
import static Arrays.Day1.findUniqueEle.*;

public class mainJavaClass {
    public static void main(String[] args) {
        int arr[] = {2,3,3,5,5};
        int n = arr.length;
//        int sum = sumOfArray(arr, arr.length);
//        System.out.println("The sum of array is: " + sum);
//
//        reverseArr(arr, arr.length);
//        printArr(arr, arr.length);

//        swapAlternate.reverseAlternate(arr, arr.length);
//        printArr(arr, arr.length);

        int findUnique = findUniqueElements(arr, n);
        System.out.println("The unique element is: " + findUnique);
    }

    private static void printArr(int arr[], int n){
        for(int i = 0; i<n; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
