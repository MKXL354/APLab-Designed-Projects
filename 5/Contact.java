public class Contact {
    //contact class
    private String group;
    private String email;
    private String firstName;
    private String lastName;
    private PhoneNumber phoneNumber = new PhoneNumber();
    private Address address = new Address();


    public Contact(String group, String email, String firstName, String lastName, PhoneNumber phoneNumber,
                   Address address){
        this.group = group;
        this.email = email;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.address = address;
    }

    public Contact() {
    }
    public Contact(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setPhoneNumber(PhoneNumber phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public PhoneNumber getPhoneNumber(){
        return  phoneNumber;
    }
    public String getFirstName(){
        return firstName;
    }
    public String getLastName(){
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public Address getAddress() {
        return address;
    }

    public String getGroup(){
        return group;
    }
    public String toString() {
        return "First name: " + firstName + " Last name: " + lastName + " Group: " + group +
                " Email: " + email + " Phone number: " + phoneNumber.toString() + " Address: " + address.toString();
    }

}
