import java.util.Scanner;

public class SwitchExample{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the name of a fruit: ");
        String str = in.next();
        switch (str) {
            case "Apple" -> System.out.println("Red in color and sweet in taste and expensive.");
            case "Orange" -> System.out.println("Orange in color and sour in taste and less expensive.");
            case "Banana" -> System.out.println("Yellow in color and cylindrical in shape and cheapest fruit.");
            default -> System.out.println("Please enter a valid fruit name.");
        }

    }
}