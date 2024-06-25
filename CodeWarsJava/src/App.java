import Scanning.Scan;

public class App {

    public void stringSplit() {

        Scan sc = new Scan();

        String sentence = sc.scanString();

        System.out.println(sentence);
    }
    
    public static void main(String[] args) {

        App app = new App();

        app.stringSplit();
    }
}
