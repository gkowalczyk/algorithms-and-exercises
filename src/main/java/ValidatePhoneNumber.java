import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidatePhoneNumber {

    boolean validatePhoneNr(String number) {
        if (number.length() != 9) {
            return false;
        }
        Pattern pattern = Pattern.compile("[0-9]+");
        Matcher matcher = pattern.matcher(number);
        return matcher.matches();
    }
    public static void main(String[] args) {
        ValidatePhoneNumber validatePhoneNumber = new ValidatePhoneNumber();
        System.out.println(validatePhoneNumber.validatePhoneNr("123-56589"));
    }
}
