import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class PhoneBook {
    ArrayList<Contact> contacts = new ArrayList<Contact>();
    Scanner scanner = new Scanner(System.in);

    public void addContact(String firstName, String lastName){
        Contact contact = new Contact();
        contact.setFirstName(firstName);
        contact.setLastName(lastName);
        Iterator<Contact> iterator = contacts.iterator();
        while (iterator.hasNext()){
            Contact thisContact = iterator.next();
            if (thisContact.getFirstName().equals(contact.getFirstName()) &&
                    thisContact.getLastName().equals(contact.getLastName())){
                System.out.println("Already exists!");
                return;
            }
        }
//        for (int i = 0; i < contacts.size();i++){
//            if (contacts.get(i).getFirstName().equals(contact.getFirstName()) &&
//                    contacts.get(i).getLastName().equals(contact.getLastName())){
//                System.out.println("Already exists!");
//                return;
//            }
//        }

        System.out.println("Enter the contact's group:");
        contact.setGroup(scanner.next());
        System.out.println("Enter the contact's email:");
        contact.setEmail(scanner.next());
        System.out.println("Enter the contact's country code:");
        contact.getPhoneNumber().setCountryCode(scanner.next());
        System.out.println("Enter the contact's phone number:");
        contact.getPhoneNumber().setNumber(scanner.next());
        System.out.println("Enter the contact's zip code:");
        contact.getAddress().setZipCode(scanner.next());
        System.out.println("Enter the contact's country:");
        contact.getAddress().setCountry(scanner.next());
        System.out.println("Enter the contact's city:");
        contact.getAddress().setCity(scanner.next());

        contacts.add(contact);
        System.out.println("Contact Saved!");
    }
    public void deleteContact(String firstName, String lastName){
        Contact contact = new Contact();
        contact.setFirstName(firstName);
        contact.setLastName(lastName);
        Iterator<Contact> iterator = contacts.iterator();
        while (iterator.hasNext()){
            Contact thisContact = iterator.next();
            if (thisContact.getFirstName().equals(contact.getFirstName()) &&
                    thisContact.getLastName().equals(contact.getLastName())){
                iterator.remove();
                System.out.println("Found and deleted!");
                return;
            }
        }
//        for (int i=0; i< contacts.size();i++){
//            if (contacts.get(i).getFirstName().equals(contact.getFirstName()) &&
//                    contacts.get(i).getLastName().equals(contact.getLastName())){
//                contacts.remove(i);
//                System.out.println("Found and deleted!");
//                return;
//            }
//        }
//        System.out.println("Not found!");
    }
    public void printTheDetailsOfTheGroup(String searchType, String searchWord){
        int flag = 0;
        String search = searchType.toLowerCase();
        if (search.equals("group")){
            for (int i = 0; i < contacts.size(); i++) {
                if(contacts.get(i).getGroup().equals(searchWord)){
                    System.out.println(contacts.get(i).toString());
                    flag = 1;
                }
            }
        } else if (search.equals("country")) {
            for (int i = 0; i < contacts.size(); i++) {
                if(contacts.get(i).getAddress().getCountry().equals(searchWord)){
                    System.out.println(contacts.get(i).toString());
                    flag = 1;
                }
            }
        } else if (search.equals("city")) {
            for (int i = 0; i < contacts.size(); i++) {
                if(contacts.get(i).getAddress().getCity().equals(searchWord)){
                    System.out.println(contacts.get(i).toString());
                    flag = 1;
                }
            }
        } else if (search.equals("zipCode")) {
            for (int i = 0; i < contacts.size(); i++) {
                if(contacts.get(i).getAddress().getZipCode().equals(searchWord)){
                    System.out.println(contacts.get(i).toString());
                    flag = 1;
                }
            }
        }
//        for (int i = 0; i < contacts.size(); i++) {
//            if(contacts.get(i).getGroup().equals(group)){
//                System.out.println(contacts.get(i).toString());
//                flag = 1;
//            }
//        }
        if(flag == 0) {
            System.out.println("Not found!");
        }
    }
    public void printContact(String contactInfoName){
        int flag = 1;
        for (int i = 0; i < contacts.size(); i++) {
            if(contacts.get(i).getFirstName().toLowerCase().contains(contactInfoName.toLowerCase()) && contacts.get(i).getLastName().toLowerCase().contains(contactInfoName.toLowerCase())){
                System.out.println(flag + contacts.get(i).toString());
                flag++;
            }
        }
        if(flag == 1) {
            System.out.println("Not found!");
        }
    }
    public void showAllContacts(){
        for (int i = 0; i < contacts.size(); i++) {
            System.out.println(contacts.get(i).toString());
        }
    }
}
