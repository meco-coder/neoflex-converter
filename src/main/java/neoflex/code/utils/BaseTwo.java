package neoflex.code.utils;


public class BaseTwo {

    public final String convertToTwoFromTen(String usrNumber) {
        try {
            return Integer.toBinaryString(Integer.parseInt(usrNumber));
        } catch (Exception e) {
            throw new NumberFormatException("Need number in base-10");
        }
    }

}
