public class Address {
    private String zipCode;
    private String country;
    private String city;

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getZipCode() {
        return zipCode;
    }

    public String getCountry() {
        return country;
    }

    public String getCity() {
        return city;
    }

    public  String toString(){
        return  "" + zipCode + " " + country + " " + city;
    }
}
