import java.util.regex.*;

public class PhoneNumber {

    public boolean validPhoneNumber(String phoneNumber) {
        
        String phoneNumberPattern = "\\(\\d{3}\\) \\d{3}-\\d{4}";
        Pattern pattern = Pattern.compile(phoneNumberPattern);

        Matcher matcher = pattern.matcher(phoneNumber);

        if (matcher.matches()) {
            return true;
        }
        else {
            return false;
        }
    }
}
