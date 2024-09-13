package section10.exercise44;

import java.util.ArrayList;

public class MobilePhone {

    private String myNumber;
    private ArrayList<Contact> myContacts;

    public MobilePhone(String myNumber) {
        this.myNumber = myNumber;
        this.myContacts = new ArrayList<>();
    }

    public boolean addNewContact(Contact contact) {
        if (findContact(contact) == -1) {
            return myContacts.add(contact);
        }
        return false;
    }

    public boolean updateContact(Contact oldContact, Contact newContact) {
        int index = myContacts.indexOf(oldContact);
        if (index > -1) {
            myContacts.remove(oldContact);
            myContacts.set(index, newContact);
            return true;
        }
        return false;
    }

    public boolean removeContact(Contact contact) {
        return myContacts.remove(contact);
    }

    private int findContact(Contact contact) {
        return findContact(contact.getName());
    }

    private int findContact(String name) {
        for (int i = 0; i < myContacts.size(); i++) {
            if (myContacts.get(i).getName().equals(name)) {
                return i;
            }
        }
        return -1;
    }

    public Contact queryContact(String name) {
        for (Contact contact : myContacts) {
            if (contact.getName().equals(name)) {
                return contact;
            }
        }
        return null;
    }

    public void printContacts() {
        System.out.println("Contact List:");

        for (int i = 0; i < myContacts.size(); i++) {
            System.out.printf("%d. %s -> %s\n", i + 1, myContacts.get(i).getName(), myContacts.get(i).getPhoneNumber());
        }
    }
}
