import java.util.Scanner;

public class Fibonacci{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number of Fibonacci terms: ");
        int n = in.nextInt();
        int first =0, second =1;
        System.out.print("Fibonacci Series is: ");
        for (int i = 0; i < n; i++) {
            System.out.print(first+" ");
            int next = first+second;
            first = second;
            second = next;
        }
    }
}