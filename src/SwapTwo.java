import java.util.Scanner;

class NumberWrapper {
    int value;

    NumberWrapper(int value) {
        this.value = value;
    }
}

public class SwapTwo {

    static void swap(NumberWrapper a, NumberWrapper b) {
        System.out.println("Before Swap: a = " + a.value + ", b = " + b.value);

        int temp = a.value;
        a.value = b.value;
        b.value = temp;

        System.out.println("After Swap: a = " + a.value + ", b = " + b.value);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int input1 = scanner.nextInt();

        System.out.print("Enter second number: ");
        int input2 = scanner.nextInt();

        NumberWrapper num1 = new NumberWrapper(input1);
        NumberWrapper num2 = new NumberWrapper(input2);

        swap(num1, num2);

        scanner.close();
    }
}
