import java.util.Arrays;
import java.util.Scanner;
public class SwapTwoArray {
    public static void SwapTwo(int[] arr, int one, int two){
        int temp = arr[one];
        arr[one] = arr[two];
        arr[two] = temp;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the two numbers: ");
        int x = in.nextInt();
        int y = in.nextInt();
        int[] revArr = {x,y};
        SwapTwo(revArr, 0, 1);
        System.out.println(Arrays.toString(revArr));
        in.close();
    }
}