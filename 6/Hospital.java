import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Hospital {
    /*
     * collections:
     *  person
     *  reservation
     * methods:
     *  login
     *  sign-up staff
     *  sign-up patient
     *  exit
     */
    HashMap<String, Person> persons = new HashMap<>();
    HashMap<String, ArrayList<Reserve>> reservations = new HashMap<>();

    

    private void login(Scanner scanner) {
        String userName = scanner.nextLine();
        String passWord = scanner.nextLine();
        String search = userName + " " + passWord;
        persons.get(search).menu();
    }

    private void signUpStaff() {
        // 
    }

    private void signUpPatient() {
        // 
    }

    private void displayMenu() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1. login\n2. sign-up staff\n3. sign-up patient\n4. exit");
        int choice;
        while(true){
            choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1:
                    login(scanner);
                    break;
                case 2:
                    signUpStaff();
                    break;
                case 3:
                    signUpPatient();
                    break;
                case 4:
                    scanner.close();
                    return;
            }
        }
    }

    public static void main(String[] args) {
        Hospital hospital = new Hospital();
        hospital.displayMenu();
    }

    public ArrayList<Reserve> getReservations(String doctorUserName) {
        return reservations.get(doctorUserName);
    }

    public void fillTable(){
        // Fill table based on doctors
    }
}
