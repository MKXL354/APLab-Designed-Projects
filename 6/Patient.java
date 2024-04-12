import java.util.Scanner;

public class Patient extends Person {
    public Patient(Hospital hospital, String username, String passWord, int money) {
        super(hospital, username, passWord, money);
    }

    @Override
    public void menu() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1. reserve\n2. charge account\n3. logout");
        int choice;
        while (true) {
            choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1:
                    reserve(scanner);
                    break;
                case 2:
                    chargeAccount();
                case 3:
                    return;
            }
        }
    }

    public void chargeAccount() {

    }

    public void reserve(Scanner scanner) {
        // reserve based on a table received from Hospital
    }
}
