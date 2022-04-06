package neoflex.code.converters;


public class TwoToTen {

    public final String convertToTenFromTwo(String usrNumber) {
        try {
            return String.valueOf(Integer.parseInt(usrNumber, 2));
        } catch (Exception e) {
            throw new NumberFormatException("Need number in base-2");
        }
    }

}
