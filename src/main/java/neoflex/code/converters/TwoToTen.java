package main.java.neoflex.code.converters;

import java.util.Scanner;

public class TwoToTen {

    public static void convertToTenFromTwo(Scanner userInputString) {

        System.out.print("You number: ");
        String usrNumber = userInputString.nextLine();
        String convert = String.valueOf(Integer.parseInt(usrNumber, 2));
        System.out.println("Result: " + convert);
    }

}
