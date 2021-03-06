package neoflex.code;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        run();
    }

    public static void run() {
        printMenu();
        Scanner userInputString = new Scanner(System.in);
        String converterNumber = userInputString.nextLine();
        Converter converter = new Converter();
        converter.setUserInputString(userInputString);
        switch (converterNumber) {
            case "1" -> converter.setConverterNumber("1");
            case "2" -> converter.setConverterNumber("2");
            case "3" -> converter.setConverterNumber("3");
            case "0" -> System.out.println();
            default -> throw new RuntimeException("Not found converter");
        }
        converter.runConverter();
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
