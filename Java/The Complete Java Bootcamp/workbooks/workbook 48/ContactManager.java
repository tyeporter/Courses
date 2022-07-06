import java.util.ArrayList;

public class ContactManager {
    private ArrayList<Contact> contacts;

    public ContactManager() {
        this.contacts = new ArrayList<Contact>();
    }

    public void setContact(int index, Contact contact) {
        this.contacts.set(index, new Contact(contact));
    }

    public Contact getContact(int index) {
        return new Contact(this.contacts.get(index));
    }

    public void addContact(Contact contact) {
        this.contacts.add(new Contact(contact));
    }

    public void removeContact(String contactName) {
        for (int i = 0; i < this.contacts.size(); i++) {
            if (this.contacts.get(i).getName().equalsIgnoreCase(contactName)) {
                this.contacts.remove(i);
                break;
            }
        }
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();

        for (int i = 0; i < this.contacts.size(); i++) {
            builder.append(this.contacts.get(i).toString());
            builder.append("\n");
        }

        return builder.toString();
    }
}
