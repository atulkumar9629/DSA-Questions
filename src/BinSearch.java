public class BinSearch {
    public static int binarySearch(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;

        while(start<=end){
            // find the middle element
            // int mid = (start+end)/2; might be possible that this value exceeds the int range in Java
            int mid = start+(end-start)/2;
            if(target < arr[mid]){
                end = mid-1;
            }else if(target > arr[mid]){
                start = mid+1;
            }else{
                // answer found
                return mid;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {2,4,8,9,12,45,90};
        int target = 4;
        int answer = binarySearch(arr, target);
        System.out.println(answer);
    }
}
