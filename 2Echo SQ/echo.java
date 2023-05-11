
import java.util.Scanner;

public class echo {
    public static void main(String[] args)

    {
        String inData;
        Scanner scanner = new Scanner(System.in); // Scanner from java.util package to read input

        System.out.println("Enter Data : ");
        inData = scanner.nextLine(); // to read a line of string

        System.out.println("You entered : " + inData);
    }
}