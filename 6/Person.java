public class Person {
    /*
     * fields:
     * hospital
     * user-pass(user without space)
     * money
     * token collection(patient)
     * methods:
     * menu(override)
     * reserve - pay - charge
     * visit
     * getToken
     */
    protected Hospital hospital;
    protected String username;
    protected String passWord;
    protected int money;
    // money getter/setter

    public Person(Hospital hospital, String username, String passWord, int money) {
        this.hospital = hospital;
        this.username = username;
        this.passWord = passWord;
        this.money = 0;
    }

    public void menu() {

    }
}
