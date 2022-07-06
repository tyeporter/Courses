import java.text.ParseException;
import java.io.FileNotFoundException;
import java.io.FileInputStream;
import java.util.Scanner;

public class Main {
    static ContactManager contacts = new ContactManager();

    public static void main(String[] args) {
        try {
            loadContacts("contacts.txt");
            System.out.println("CONTACTS LOADED\n\n");
            System.out.println(contacts);
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }

    /**
     * Name: manageContacts
     *
     * Inside the function:
     *   • 1. Starts a new instance of Scanner;
     *   • 2. In an infinite loop, the user can choose to a) add b) remove a contact c) exit.
     *   •        case a: ask for the name, phone number and birthDate.
     *   •        case b: ask who they'd like to remove.
     *   •        case c: break the loop.
     *   • 3. close Scanner.
     */
    public static void manageContacts() {
        Scanner scan = new Scanner(System.in);
        while (true) {
            System.out.println("Would you like to \n\ta) add another contact\n\tb) remove a contact \n\tc) exit");
            String response = scan.nextLine();

            if (response.equalsIgnoreCase("a")) {
                System.out.print("\tName: ");
                String name = scan.nextLine();

                System.out.print("\tPhone Number: ");
                String phoneNumber = scan.nextLine();

                System.out.print("\tBirth Date: ");
                String birthDate = scan.nextLine();

                try {
                    contacts.addContact(new Contact(name, phoneNumber, birthDate));
                } catch (ParseException e) {
                    System.out.println(e.getMessage());
                } finally {
                    System.out.println("\n\nUPDATED CONTACTS\n\n");
                }
            } else if (response.equalsIgnoreCase("b")) {
                System.out.print("\nWho would you like to remove?: ");
                String contactName = scan.nextLine();

                contacts.removeContact(contactName);
                System.out.println("\n\nUPDATED CONTACTS\n\n");
            } else if (response.equalsIgnoreCase("c")) {
                break;
            }
        }
        scan.close();
    }



    /**
     * Name: loadContacts
     * @param fileName (String)
     * @throws FileNotFoundException
     *
     * Inside the function:
     *   • 1. loads contacts from <fileName>;
     *   • 2. From the manager object, it adds all contacts to the contacts list.
     *        Hint: use scan.next to grab the next String separated by white space.
     */
    public static void loadContacts(String fileName) throws FileNotFoundException {
        FileInputStream fis = new FileInputStream(fileName);
        Scanner scanFile = new Scanner(fis);
        while (scanFile.hasNextLine()) {
            try {
                Contact contact = new Contact(scanFile.next(), scanFile.next(), scanFile.next());
                contacts.addContact(contact);
            } catch (ParseException e) {
                System.out.println(e.getMessage());
            }
        }
        scanFile.close();
    }
}
