import java.util.Scanner;

public class ReverseNum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Please enter the number you wish to reverse: ");
        int n = in.nextInt();
        int original = n;
        int rev = 0;
        while(n>0){
            rev = (rev*10) + (n%10);
            n /= 10;
        }
        System.out.print("The reverse of "+original+"is: "+rev);
    }
}
