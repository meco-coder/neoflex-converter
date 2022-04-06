package neoflex.code.converters;


public class TenToTwo {

    public String convertToTwoFromTen(String usrNumber) {
        return Integer.toBinaryString(Integer.parseInt(usrNumber));
    }

}
