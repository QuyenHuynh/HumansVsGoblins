import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validators {

    static boolean validName;
    static boolean validHowtoPlay;

    public static void validNameCheck(String name) throws CustomException {
        //match for only letters and white space
        Pattern pattern = Pattern.compile("^[a-zA-Z\\\\s]*$");
        Matcher matcher = pattern.matcher(name.trim());

        if (name.isBlank()) {
            System.out.println("Blank input. Enter a name.");
            throw new CustomException();
        }
        if (matcher.matches()) {
            validName = true;
        } else {
            System.out.println("No special characters or numbers. Try again.");
            throw new CustomException();
        }
    }

    static void validHowtoPlayCheck(String input) throws CustomException {
        if (input.isBlank()) {
            System.out.println("Blank input. Enter 'y' or 'n'.");
        }

        if (input.trim().equals("y") || input.trim().equals("n")) {
            validHowtoPlay = true;
        } else {
            System.out.println("Not a valid input. Try again.");
            throw new CustomException();
        }
    }

}

class CustomException extends Exception {
    public CustomException() {
        // Call constructor of parent Exception
        super();
    }
}
