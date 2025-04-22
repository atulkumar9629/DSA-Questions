import java.util.Scanner;

public class FindInArr {
    public static int elementSearch(int[] arr, int target){
        if(arr.length==0)
            return -1;
        for (int i = 0; i < arr.length; i++) {
            if(target==arr[i]){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Please enter the elements of the array: ");
        int[] arr = new int[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }
        System.out.print("Enter the element you wish to search: ");
        int k = in.nextInt();
        int ans = elementSearch(arr, k);
        if(ans==-1){
            System.out.println("Element not found in the array.");
        }else{
            System.out.println("Element found at "+ans+" index.");
        }
    }
}