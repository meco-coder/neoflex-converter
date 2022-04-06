package neoflex.code;

import neoflex.code.converters.TenToSixteen;
import neoflex.code.converters.TenToTwo;
import neoflex.code.converters.TwoToTen;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        converter();
    }

    public static void converter() {
        printMenu();
        Scanner userInputString = new Scanner(System.in);
        String converterNumber = userInputString.nextLine();
        switch (converterNumber) {
            case "1" -> TenToSixteen.convertToSixteenFromTen(userInputString);
            case "2" -> TenToTwo.convertToTwoFromTen(userInputString);
            case "3" -> TwoToTen.convertToTenFromTwo(userInputString);
            case "0" -> System.out.println();
            default -> throw new RuntimeException();
        }
    }

    public static void printMenu() {
        System.out.println("Please enter converter and press Enter.");
        System.out.println("1 - base 10 to base 16");
        System.out.println("2 - base 10 to base 2");
        System.out.println("3 - base 2 to base 10");
        System.out.println("0 - Exit");
        System.out.print("Your choice: ");
    }

}
