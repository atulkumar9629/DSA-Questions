public class BinSearch2 {
    public static int descSearch(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;
        while(start<=end){
            int mid = start+(end-start)/2;
            if(target>arr[mid]){
                end = mid-1;
            }else if(target < arr[mid]){
                start = mid+1;
            }else{
                return mid;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {99,78,45,34,23,19,14,7,2,0};
        int target = 78;
        int answer = descSearch(arr, target);
        System.out.println(answer);
    }
}
