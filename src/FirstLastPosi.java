public class FirstLastPosi {
    public static void main(String[] args) {
        int[] num = {5, 7, 7, 8, 8, 10};
        int target = 8;
        int[] result = searchRange(num, target);
        System.out.println("[" + result[0] + ", " + result[1] + "]");
    }

    public static int[] searchRange(int[] num, int target) {
        int[] ans = {-1, -1};
        ans[0] = search(num, target, true);
        /*
        This condition checks whether the target was found at all.
        If ans[0] == -1, it means the target is not present in the array,
        so no need to find the last position.
        If the target was found, we proceed to find the last occurrence.
         */
        if (ans[0] != -1) {
            ans[1] = search(num, target, false);
        }
        return ans;
    }

    public static int search(int[] num, int target, boolean findStartIndex) {
        int ans = -1;
        int start = 0;
        int end = num.length - 1;
        while(start <= end) {
            int mid = start + (end - start) / 2;

            if (target < num[mid]) {
                end = mid - 1;
            } else if (target > num[mid]) {
                start = mid + 1;
            } else {
                ans = mid;
                if (findStartIndex) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return ans;
    }
}