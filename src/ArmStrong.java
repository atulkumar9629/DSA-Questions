import java.util.Scanner;

public class ArmStrong {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Please enter the number you wish to check: ");
        int n = in.nextInt();
        int original = n;
        int numSum = 0;
        while(n>0){
            int rem = n%10;
            numSum += rem*rem*rem;
            n /= 10;
        }
        if(numSum==original){
            System.out.println("The given number is an armstrong number.");
        }else{
            System.out.println("The given number is not an armstrong number.");
        }
    }
}
