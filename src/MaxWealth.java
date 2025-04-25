public class MaxWealth {
    public static void main(String[] args) {
        int[][] arr = {
                {1,2,3},
                {4,8,9},
                {3,8,4}
        };
        int output = maximumWealth(arr);
        System.out.println(output);
    }
    public static int maximumWealth(int[][] arr){
        int ans = Integer.MIN_VALUE;
        for(int person = 0; person < arr.length; person++){
            int rowSum = 0;
            for(int account = 0; account < arr[person].length; account++){
                rowSum += arr[person][account];
            }
            // Now we have sum of accounts of person
            // Now check with overall answer
            if(rowSum > ans){
                ans = rowSum;
            }
        }
        return ans;
    }
}
