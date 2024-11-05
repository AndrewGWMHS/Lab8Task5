import java.util.Scanner;

public class RegExMagic {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String ssn = InputHelper.getRegExString(scan, "Enter your SSN", "\\d{3}-\\d{2}-\\d{4}");
        System.out.println("Your SSN is: " + ssn);

        String mNumber = InputHelper.getRegExString(scan, "Enter your student m number", "(M|m)\\d{5}");
        System.out.println("Your student m number is: " + mNumber);

        String menu = InputHelper.getRegExString(scan, "Menu:  O  -  Open    S  -  Save    V  -  View    Q  -  Quit", "[OoSsVvQq]");
        System.out.println("You choose: " + menu);
    }
}
