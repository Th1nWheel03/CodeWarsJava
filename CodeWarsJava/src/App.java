public class App {

    public void stringSplit() {

        Scanning sc = new Scanning();

        String sentence = sc.scanString();

        System.out.println(sentence);
    }
    
    public static void main(String[] args) {

        App app = new App();

        app.stringSplit();
    }
}
