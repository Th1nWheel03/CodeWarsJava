import Scanning.Scan;

public class App {

    Scan sc = new Scan();

    public void stringSplit() {

        StringSplit ss = new StringSplit();

        String sentence = sc.scanString();
        String[] splitString = ss.stringSplit(sentence);

        for (String t : splitString) {
            System.out.println(t);
        }
        
    }

    public void camelCase() {

        CamelCase cc = new CamelCase();

        String sentence = sc.scanString();

        System.out.println(cc.camelCase(sentence));
    }

    public void validPhoneNumber() {

        PhoneNumber pn = new PhoneNumber();

        String phoneNumber = sc.scanString();

        System.out.println(pn.validPhoneNumber(phoneNumber));
    }
    
    public static void main(String[] args) {

        App app = new App();

        // app.stringSplit();
        // app.camelCase();
        app.validPhoneNumber();
    }
}
