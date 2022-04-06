package neoflex.code.converters;

public class TenToSixteen {

    public String convertToSixteenFromTen(String usrNumber) {
        return Integer.toHexString(Integer.parseInt(usrNumber));
    }

}
