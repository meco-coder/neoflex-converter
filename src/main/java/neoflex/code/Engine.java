package neoflex.code;

import neoflex.code.converters.TenToSixteen;
import neoflex.code.converters.TenToTwo;
import neoflex.code.converters.TwoToTen;

import java.util.Scanner;

public class Engine {

    public static void resultConverter(Scanner userInputString, String converterNumber) {
        System.out.print("Your number: ");
        String usrNumber = userInputString.nextLine();
        switch (converterNumber) {
            case "1" -> System.out.println("Result: " + new TenToSixteen().convertToSixteenFromTen(usrNumber));
            case "2" -> System.out.println("Result: " + new TenToTwo().convertToTwoFromTen(usrNumber));
            case "3" -> System.out.println("Result: " + new TwoToTen().convertToTenFromTwo(usrNumber));
            default -> throw new RuntimeException("Not found converter");
        }
    }

}
