package Arrays.Day1;

public class findUniqueEle {
    public static int findUniqueElements(int arr[], int n){
        /*
        we can use two for loops to find unique elements, but we can optimize it by using XOR
         */

        int xor = 0;
        for(int ele : arr){
            xor = xor ^ ele;
        }
        return xor;
    }
}
