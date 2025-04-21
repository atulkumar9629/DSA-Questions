import java.util.Arrays;
import java.util.Scanner;

public class RevArr {
    public static void SwapIndex(int[] arr, int one, int two){
        int temp = arr[one];
        arr[one] = arr[two];
        arr[two] = temp;
    }
    public static void Reversed(int[] arr){
        int start = 0;
        int end = arr.length-1;
        while(start<end){
            SwapIndex(arr, start, end);
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        System.out.print("Enter the elements of the array: ");
        Scanner in = new Scanner(System.in);
        int[] revArr = new int[5];
        for (int i = 0; i < revArr.length; i++) {
            revArr[i] = in.nextInt();
        }
        Reversed(revArr);
        System.out.println(Arrays.toString(revArr));
    }
}