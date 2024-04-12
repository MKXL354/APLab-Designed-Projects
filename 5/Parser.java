public class Parser {
    private String command;

    public Parser(String command) {
        this.command = command;
    }
    public void parse(){
        boolean turn = true;
        PhoneBook personPhoneBook = new PhoneBook();
        while (turn) {
            if (command.contains("contacts -a")) {
                String[] info = command.split(" ");
                personPhoneBook.addContact(info[2], info[3]);
            }
            else if (command.contains("contacts -r")) {
                String[] info = command.split(" ");
                personPhoneBook.deleteContact(info[2], info[3]);
            } else if (command.contains("show -g")) {
                String[] info = command.split(" ");
                personPhoneBook.printTheDetailsOfTheGroup(info[2], info[3]);
            } else if (command.contains("show -c")) {
                String[] info = command.split(" ");
                personPhoneBook.printContact(info[2]);

            }
            else if(command.contains("show")){
                personPhoneBook.showAllContacts();
            }
            else if (command.contains("exit")) {
                System.out.println("Bye Bye!");
                turn = false;
            }
            else {
                System.out.println("Invalid!");
            }
        }
    }
}
