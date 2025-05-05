public class Ceiling {
    // return the index of smallest no >= target
    public static int ArrayCeiling(int[] arr, int target){
        if(target > arr[arr.length-1]){
            return -1;
        }
        int start = 0;
        int end = arr.length-1;
        while(start <= end){
            int mid = start+(end-start)/2;
            if(target < arr[mid]){
                end = mid-1;
            }else if(target > arr[mid]){
                start = mid+1;
            }else{
                return mid;
            }
        }
        return start;
    }

    public static void main(String[] args) {
        int[] arr = {2,5,7,9,13,16,19};
        int target = 4;
        int ans = ArrayCeiling(arr, target);
        System.out.println(ans);
    }
}



/*
Goal:
Find the index of the smallest number in the array that is greater than or equal to the target (i.e., the ceiling of the target).

Given:
java
Copy
Edit
int[] arr = {2,5,7,9,13,16,19};
int target = 4;
We need to find the smallest number ≥ 4.

Method:
java
Copy
Edit
public static int ArrayCeiling(int[] arr, int target)
Binary search approach.

Step-by-Step Execution:
Initial check:

java
Copy
Edit
if (target > arr[arr.length - 1])
→ Is 4 > 19? No → proceed.

Initialize:

java
Copy
Edit
start = 0, end = 6 (index of last element)
First iteration of while loop:
start = 0, end = 6

mid = 0 + (6-0)/2 = 3

arr[mid] = 9

target < arr[mid] → 4 < 9 → move end left:

java
Copy
Edit
end = mid - 1 = 2
Second iteration:
start = 0, end = 2

mid = 0 + (2-0)/2 = 1

arr[mid] = 5

4 < 5 → move end left again:

java
Copy
Edit
end = mid - 1 = 0
Third iteration:
start = 0, end = 0

mid = 0 + (0-0)/2 = 0

arr[mid] = 2

4 > 2 → move start right:

java
Copy
Edit
start = mid + 1 = 1
Now start = 1, end = 0 → loop exits.

Return:
java
Copy
Edit
return start;  // which is 1
arr[1] = 5 → which is the ceiling of 4.

Output:
java
Copy
Edit
System.out.println(ans);  // prints: 1
 */