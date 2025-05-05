public class Floor {
    public static int ArrayFloor(int[] arr, int target){
            int start = 0;
            int end = arr.length-1;
            while(start <= end){
                int mid = start+(end-start)/2;
                if(target > arr[mid]){
                    start = mid+1;
                }else if (target < arr[mid]){
                    end = mid -1;
                }else{
                    return mid;
                }
            }
            return end;
        }
    public static void main(String[] args) {
        int[] arr = {2, 4, 5, 9, 14, 16, 18};
        int target = 1;
        int ans = ArrayFloor(arr, target);
        System.out.println(ans);
    }

}


