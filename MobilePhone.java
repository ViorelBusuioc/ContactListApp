import java.util.ArrayList;
import java.util.ListIterator;

public class MobilePhone {

    private String myNumber;
    private ArrayList<Contact> myContacts;

    public MobilePhone(String myNumber) {
        this.myNumber = myNumber;
        myContacts = new ArrayList<>();
    }

    public boolean addNewContact(Contact contact) {
        for (Contact existingContact : myContacts) {
            if (existingContact.getName().equals(contact.getName())) {
                return false; // Contact already exists
            }
        }
        myContacts.add(contact);
        return true; // Contact don't exist
    }

    public boolean updateContact(Contact contact, Contact contactToUpdate) {
        ListIterator<Contact> iterator = myContacts.listIterator();
        while (iterator.hasNext()) {
            Contact contactIterator = iterator.next();
            if (contactIterator.getName().equals(contact.getName())) {
                iterator.set(contactToUpdate);
                return true;  // Contact exists and updated
            }
        }
        return false;   // Contact don't exist
    }

    public boolean removeContact(Contact contact) {
        for (Contact existingContact : myContacts) {
            if (existingContact.getName().equals(contact.getName())) {
                myContacts.remove(contact);
                return true; // Contact already exists
            }
        }
        return false; // Contact don't exist
    }

    public void printContacts() {

        System.out.println("Contact List:");
        for (int i = 0; i < myContacts.size(); i++) {
            Contact contact = myContacts.get(i);
            System.out.printf("%d. %s -> %s%n", i + 1, contact.getName(),contact.getPhoneNumber());
        }
    }

    private int findContact(Contact contact) {

        return myContacts.indexOf(contact);
    }

    private int findContact(String contactName) {

        for (Contact existingC : myContacts) {
            if (existingC.getName().equals(contactName)) {
                return myContacts.indexOf(existingC);
            }
        }
        return -1;
    }

    public Contact queryContact(String contactName) {
        for (Contact existingC : myContacts) {
            if (existingC.getName().equals(contactName)) {
                return existingC;
            }
        }
        return null;
    }
}
