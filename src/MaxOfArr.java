import java.util.Scanner;

public class MaxOfArr {
    public static int Max(int[] arr){
        int maxVal = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(maxVal<arr[i]){
                maxVal = arr[i];
            }
        }
        return maxVal;
    }

    public static void main(String[] args) {
        System.out.print("Enter the elements of the array: ");
        Scanner in = new Scanner(System.in);
        int[] maxArr = new int[5];
        for (int i = 0; i < maxArr.length ; i++) {
            maxArr[i] = in.nextInt();
        }
        System.out.println(Max(maxArr));
    }
}