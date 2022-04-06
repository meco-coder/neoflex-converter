package neoflex.code.converters;

import java.util.Scanner;

public class TenToSixteen {

    public static void convertToSixteenFromTen(Scanner userInputString) {
        System.out.print("You number: ");
        String usrNumber = userInputString.nextLine();
        String convert = Integer.toHexString(Integer.parseInt(usrNumber));
        System.out.println("Result: " + convert);
    }

}
