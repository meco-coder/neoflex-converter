package neoflex.code;

import neoflex.code.utils.BaseSixteen;
import neoflex.code.utils.BaseTwo;
import neoflex.code.utils.BaseTen;

import java.util.Scanner;

public class Converter {

    private Scanner userInputString;

    private String converterNumber;

    public final void setUserInputString(Scanner userInputString) {
        this.userInputString = userInputString;
    }

    public final void setConverterNumber(String converterNumber) {
        this.converterNumber = converterNumber;
    }

    public final Scanner getUserInputString() {
        return userInputString;
    }

    public final String getConverterNumber() {
        return converterNumber;
    }

    public final void resultConverter() {
        System.out.print("Your number: ");
        String usrNumber = userInputString.nextLine();
        switch (converterNumber) {
            case "1" -> System.out.println("Result: " + new BaseSixteen().convertToSixteenFromTen(usrNumber));
            case "2" -> System.out.println("Result: " + new BaseTwo().convertToTwoFromTen(usrNumber));
            case "3" -> System.out.println("Result: " + new BaseTen().convertToTenFromTwo(usrNumber));
            default -> throw new RuntimeException("Not found converter");
        }
    }

}
