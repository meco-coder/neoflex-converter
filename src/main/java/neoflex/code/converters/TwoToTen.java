package neoflex.code.converters;


public class TwoToTen {

    public String convertToTenFromTwo(String usrNumber) {
        return String.valueOf(Integer.parseInt(usrNumber, 2));
    }

}
