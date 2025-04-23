import java.util.Scanner;

public class SearInChar{
    public static boolean Search(String str, char target){
        if(str.isEmpty())
            return false;
        for (int i = 0; i < str.length(); i++) {
            if(target==str.charAt(i))
                return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String str = in.next();
        System.out.print("Please enter the character you wish to check: ");
        char ch = in.next().trim().charAt(0);
        boolean ans = Search(str, ch);
        if(ans)
            System.out.println("Character found in the string.");
        else
            System.out.println("Character not found in the string.");
    }

}