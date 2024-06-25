import java.util.Scanner;

public class Scanning {

    public String scanString() {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your sentence:");
        String sentence = sc.nextLine();

        sc.close();
        return sentence;
    }
}
