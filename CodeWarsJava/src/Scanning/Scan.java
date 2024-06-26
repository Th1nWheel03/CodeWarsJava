package Scanning;
import java.util.Scanner;

public class Scan {

    Scanner sc = new Scanner(System.in);

    public String scanString() {

        System.out.println("Enter your sentence:");
        String sentence = sc.nextLine();

        return sentence;
    }
}
