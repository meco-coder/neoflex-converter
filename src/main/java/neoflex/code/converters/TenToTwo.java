package main.java.neoflex.code.converters;

import java.util.Scanner;

public class TenToTwo {

    public static void convertToTwoFromTen(Scanner userInputString) {

        System.out.print("You number: ");
        String usrNumber = userInputString.nextLine();
        String convert = Integer.toBinaryString(Integer.parseInt(usrNumber));
        System.out.println("Result: " + convert);
    }

}
