import java.util.Scanner;
public class Prime {
    public static void main(String[] args) {
        System.out.println("Enter the number: ");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        if(x<=1){
            System.out.println("Neither prime nor composite.");
        }
        for(int c = 2; c*c <= x; c++){
            if(x%c==0){
                System.out.println("Not a prime number.");
            }
        }
        System.out.println("The given number is a prime number.");
    }
}