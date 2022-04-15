package academy.learnprogramming;

import java.util.ArrayList;

public class MobilePhone {
    private String myNumber;
    private ArrayList<Contact> myContacts;

    public MobilePhone(String myNumber) {
        this.myNumber = myNumber;
        this.myContacts = new ArrayList<Contact>();
    }

    public boolean addNewContact(Contact contact) {
        if (findContact(contact)>=0) {
            return false;
        }
        myContacts.add(contact);
        return true;
    }

    public boolean updateContact(Contact oldContact, Contact newContact) {
        int idx = findContact(oldContact);
        if (idx >= 0) {
            this.myContacts.set(idx, newContact);
            return true;
        }
        return false;
    }

    public boolean removeContact(Contact contact) {
        int idx = findContact(contact);
        if (idx >= 0) {
            this.myContacts.remove(idx);
            return true;
        }
        return false;
    }

    private int findContact(Contact contact) {
        return findContact(contact.getName());
    }

    private int findContact(String name) {
        for (int i = 0; i < this.myContacts.size(); ++i) {
            if (this.myContacts.get(i).getName() == name) {
                return i;
            }
        }
        return -1;
    }
    public Contact queryContact(String name) {
        int idx = findContact(name);
        if (idx >= 0) {
            return this.myContacts.get(idx);
        }
        return null;
    }
    public void printContacts(){
        System.out.println("Contact List:");
        for (int i = 0; i < this.myContacts.size(); ++i) {
            System.out.println(i+1+". "+this.myContacts.get(i).getName()+" -> "+this.myContacts.get(i).getPhoneNumber());
        }
    }
}
