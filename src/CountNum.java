import java.util.Scanner;

public class CountNum{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Please enter the number: ");
        int x = in.nextInt();
        System.out.print("Enter the digit you wish to check occurrence of: ");
        int y = in.nextInt();
        int count = 0;
        while(x>0){
            int rem = x%10;
            if(rem == y){
                count++;
            }
            x /= 10;
        }
        System.out.print("The number of occurrences of the digit in the number is: "+ count);
    }
}