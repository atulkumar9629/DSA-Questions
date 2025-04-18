import java.util.Scanner;

public class LargeOfThree {
    public static void main(String[] args) {
        System.out.print("Please enter the three numbers: ");
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        int y = in.nextInt();
        int z = in.nextInt();
        int max = (x>y)?(x>z?x:z):(y>z?y:z);
        System.out.println("The largest of the three numbers is : " + max);

    }
}
