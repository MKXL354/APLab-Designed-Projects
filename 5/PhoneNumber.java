public class PhoneNumber {
    private   String countryCode;
    private  String number;

    public void setNumber(String number) {
        if (number.length() == 12)
            this.number = number;
        else
            System.out.println("invalid!");
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public  String toString(){
        return  "" + countryCode + number;
    }
}
