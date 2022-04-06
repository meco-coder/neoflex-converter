package neoflex.code.converters;

public class TenToSixteen {

    public final String convertToSixteenFromTen(String usrNumber) {
        try {
            return Integer.toHexString(Integer.parseInt(usrNumber));
        } catch (Exception e) {
            throw new NumberFormatException("Need number in base-10");
        }
    }

}
