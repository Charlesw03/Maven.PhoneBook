package com.zipcodewilmington.phonebook;

import java.util.ArrayList;

public class Contact {

   private ArrayList <String> phoneNumbers;
    private ArrayList <String> contactNames;

    public Contact(){
        phoneNumbers = new ArrayList<String>();
        contactNames = new ArrayList<String>();
    }

    public Contact(String initialName, String initialNumber){

        phoneNumbers = new ArrayList<String>();
        contactNames = new ArrayList<String>();


        contactNames.add(initialName);
        phoneNumbers.add(initialNumber);
    }

    public void setContactNames(ArrayList contactNames ){
        this.contactNames = contactNames;
    }

    public void setPhoneNumbers(ArrayList phoneNumbers){
        this.phoneNumbers = phoneNumbers;
    }

    public ArrayList<String> getPhoneNumbers(){
        return phoneNumbers;
    }
    public ArrayList<String> getContactNames(){
        return contactNames;
    }
    public void addContactName(String name){
        contactNames.add(name);
    }

    public void addContactNumber(String number){
        phoneNumbers.add(number);
    }


}
