public class MountainArray {
    public static void main(String[] args) {
        int[] arr = {3,5,7,9,8,6,4,2};
        System.out.println(peakElement(arr));
    }
    public static int peakElement(int[] arr){
        int start = 0;
        int end = arr.length-1;
        while(start<end){
            int mid = start+(end-start)/2;
            if(arr[mid]>arr[mid+1]){
                //we are in descending part of the array
                end = mid;
            }else{
                //we are in the ascending part of the array
                start = mid+1;
            }
        }
        return arr[end]; //or start as both are equal by then.
    }
}