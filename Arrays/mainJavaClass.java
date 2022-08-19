package Arrays;

import Arrays.Day1.swapAlternate;

import static Arrays.Day1.sumOfArray.*;
import static Arrays.Day1.reverseArray.*;
import static Arrays.Day1.findUniqueEle.*;

public class mainJavaClass {
    public static void main(String[] args) {
        int arr[] = {5,1,2,3,4,2};
        int n = arr.length;
//        int sum = sumOfArray(arr, arr.length);
//        System.out.println("The sum of array is: " + sum);
//
//        reverseArr(arr, arr.length);
//        printArr(arr, arr.length);

//        swapAlternate.reverseAlternate(arr, arr.length);
//        printArr(arr, arr.length);

//        int findUnique = findUniqueElements(arr, n);
//        System.out.println("The unique element is: " + findUnique);

        int dupNumber = Arrays.Day2.duplicateInArray.dupInArray(arr, n);
        System.out.println(dupNumber);
    }

    private static void printArr(int arr[], int n){
        for(int i = 0; i<n; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
