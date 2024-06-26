package Scanning;
import java.util.Scanner;

public class Scan {

    Scanner sc = new Scanner(System.in);

    public String scanString() {

        System.out.println("Enter your sentence:");
        String sentence = sc.nextLine();

        return sentence;
    }

    public int scanInt() {

        System.out.println("Enter your number:");
        int number = sc.nextInt();

        return number;
    }
}
