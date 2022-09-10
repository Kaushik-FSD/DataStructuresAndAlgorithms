package Arrays.Day9;

public class saydigit {
    static String arr[] = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
    public static void sayDigit(int n){

        if(n == 0)
            return;

        int digit = n % 10;
        n = n/10;

        sayDigit(n);

        System.out.print(arr[digit] + " ");
    }
}
