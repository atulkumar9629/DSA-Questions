public class EvenDigitElement {
    public static void main(String[] args) {
        int[] arr = {12,134,1456,13333,890980,0};
        int frequency = findFrequency(arr);
        System.out.println("The count of even digits is: "+frequency);

    }
    public static int findFrequency(int[] arr){
        int count = 0;
        for(int x : arr){
            if(evenCheck(x))
                count++;
        }
        return count;
    }
    public static boolean evenCheck(int num){
        int y = digCount(num);
        return y%2 == 0;
    }
    public static int digCount(int n){
        int count = 0;
        if(n==0)return 1;
        while(n>0){
            count++;
            n /= 10;
        }
        return count;
    }
}