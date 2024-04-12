import java.util.ArrayList;
import java.util.Scanner;

public class Doctor extends Person {
    private ArrayList<String> availableDate = new ArrayList<>();

    public Doctor(Hospital hospital, String username, String passWord, int money) {
        super(hospital, username, passWord, money);
    }

    @Override
    public void menu(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("1. visit\n2. fill table\n3. logout");
        int choice;
        while(true){
            choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1:
                    visit(scanner);
                    break;
                case 2:
                    fillTable();
                case 3:
                    return;
            }
        }
    }

    public void fillTable(){
        // add availability to hospital
    }
    
    public void visit(Scanner scanner){
        String date = scanner.nextLine();
        ArrayList<Reserve> reservations = hospital.getReservations(username);
        // visit based on date
    }
}
