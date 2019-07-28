package com.burgers;

import java.util.ArrayList;
import java.util.Scanner;

public class MobilePhone {
    private ArrayList<Contact> contacts;
    private Scanner sc;

    public MobilePhone() {
        this.contacts = new ArrayList<Contact>();
        this.sc = new Scanner(System.in);
    }

    private void addContact() {
        System.out.println("Please enter a name: ");

        String name = sc.nextLine();
        System.out.println("Please enter a number: ");
        String number = sc.nextLine();

        Contact contact = new Contact(name, number);
        if(contacts.indexOf(contact) <0) {
            contacts.add(contacts.size(), contact);
            System.out.println(name + " has been added");
        }

    }


    private void removeContact() {
        System.out.println("Please enter a name: ");

        String name = sc.nextLine();
        Contact c = new Contact(name);


        removeContact(contacts.indexOf(c));
        System.out.println(name + " has been removed");
    }

    private Contact removeContact(int index ) {
        if(index >= 0 && index < contacts.size()) return contacts.remove(index);
        return null;
    }



    private void updateContact() {

        System.out.println("Please enter a name: ");

        String name = sc.nextLine();
        Contact c = new Contact(name);
        int index = contacts.indexOf(c);


        if(index >= 0) {

            System.out.println("Please enter a new name (hit enter to keep same) ");
            name = sc.nextLine();

            if(name.toLowerCase() != "")c.setName(name);

            System.out.println("Please enter a new number (hit enter to keep same) ");
            String number = sc.nextLine();

            if(number.toLowerCase() != "") c.setNumber(number);

            contacts.set(index, c);
            System.out.println(name + " has been updated");


        } else {
            System.out.println("Could not find the contact " + name);
        }


    }


    private void printContacts() {
        System.out.println();
        System.out.println(this.toString());
    }

    @Override
    public String toString() {

        if(contacts.size() <= 0) return "No Contacts";

       String ret = "";
        int index= 1;

        for(Contact c: contacts) {
            ret+= index + ") "  + c.toString() + "\n";
            index ++;
        }
        return ret ;
    }

    private void findContact() {
        System.out.println("Please enter a name: ");

        String name = sc.nextLine();
        Contact c = new Contact(name);

        c = findContact(contacts.indexOf(c));

        if(c != null) {
            System.out.println("Found " + c.toString());
        } else {
            System.out.println("No existing contact with name " + name);
        }
    }



    private Contact findContact(int index) {
        if(index >= 0 && index < contacts.size()) return contacts.get(index) ;
        return null;
    }





    private void printMenu() {
        System.out.println();
        System.out.print("q- Quit \n" +
                "a - Add Contact \n" +
                "u - Update Contact \n" +
                "r - Remove Contact \n" +
                "f - Find a contact \n" +
                "p - Print contacts \n"
        );
    }


    private boolean determineAction() {
        boolean cont = true;
        String input = sc.nextLine();
        switch (input.toLowerCase()) {
            case  "a": {
                addContact();
                break;
            }
            case "u": {
                updateContact();
               break;
            }
            case "r": {
                removeContact();
                break;
            }

            case "f":{
                findContact();
                break;
            }

            case "p":{
               printContacts();
                break;
            }

            case "q": {

                cont = false;
                printContacts();
                break;
            }

            default: {
                System.out.println("invalid option Please try again");
            }
        }

        return cont;
    }


    public void start() {

        boolean cont = true;

        while (cont) {
            printMenu();
             cont = determineAction();
        }
    }


}



class Contact {
    private String name;
    private  String number;


    public Contact(String name) {
        this.name = name;
        this.number ="";
    }


    public Contact(String name, String number) {
        this.name = name;
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj == null) return false;
        if(this == obj) return true;
        if(! (obj instanceof Contact)) return false;

        Contact c = (Contact) obj;
        return this.name.equals(c.getName()) || this.number.equals(c.getNumber());
    }


    @Override
    public String toString() {
        return "Name: " + name + " Number: " + number;
    }
}





