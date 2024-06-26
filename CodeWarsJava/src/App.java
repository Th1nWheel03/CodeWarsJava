import Scanning.Scan;

public class App {

    Scan sc = new Scan();

    public void stringSplit() {

        System.out.println("\nKatas => string split\n");

        int count = 1;

        StringSplit ss = new StringSplit();

        String sentence = sc.scanString();
        String[] splitString = ss.stringSplit(sentence);

        for (String t : splitString) {
            System.out.println("Line " + count + " => " + t);
            count += 1;
        }
        
    }

    public void camelCase() {

        System.out.println("\nKatas => camel case\n");

        CamelCase cc = new CamelCase();

        String sentence = sc.scanString();
        String camelCase = cc.camelCase(sentence);

        System.out.println(camelCase + " => camel case of: " + sentence);
    }

    public void validPhoneNumber() {

        System.out.println("\nKatas => valid phone number\n");

        PhoneNumber pn = new PhoneNumber();

        String phoneNumber = sc.scanString();
        Boolean isValid = pn.validPhoneNumber(phoneNumber);

        String response = (isValid == true) ? isValid + " => The phone number: '" + phoneNumber + "' is valid" : isValid + " => The phone number: '" + phoneNumber + "' is false";
        System.out.println(response);
    }

    public void findUnique() {

        System.out.println("\nKatas => find unique number\n");

        FindUniqueNumber fun = new FindUniqueNumber();
        StringBuilder sb = new StringBuilder();

        double[] arr = {1, 1, 1, 2, 1, 1};
        double uniqueNumber = fun.findUnique(arr);

        for (double i : arr) {
            sb.append(i + " ");
        }

        System.out.println(uniqueNumber + " => unique number of: " + sb.toString().trim());
    }

    public void repeatString() {

        System.out.println("\nKatas => repeat string\n");

        RepeatString rs = new RepeatString();

        String string = sc.scanString();
        int repeat = sc.scanInt();

        String repeatString = rs.repeatString(repeat, string);

        System.out.println(repeatString + " => repeat " + repeat + " time: " + string);
    }

    public void noSpace() {

        System.out.println("\nKatas => remove string space\n");

        RemoveStringSpace rss = new RemoveStringSpace();

        String string = sc.scanString();

        String noSpace = rss.noSpace(string);

        System.out.println(noSpace + " => no space of: " + string);
    }
    
    public static void main(String[] args) {

        App app = new App();

        // app.stringSplit();
        // app.camelCase();
        // app.validPhoneNumber();
        // app.findUnique();
        // app.repeatString();
        app.noSpace();
    }
}
