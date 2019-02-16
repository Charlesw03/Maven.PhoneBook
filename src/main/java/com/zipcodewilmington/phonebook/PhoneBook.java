package com.zipcodewilmington.phonebook;

import java.util.*;

/**
 * Created by leon on 1/23/18.
 */
public class PhoneBook {

    private Map<String, Contact> contactList;
    private TreeMap<String, String> treeMap;




    public PhoneBook() {
        treeMap = new TreeMap<String, String>();
        contactList = new HashMap<String, Contact>();
    }

    public void clear() {
        treeMap.clear();
    }

    public void add(String name, String phoneNumber) {
        Contact newContact = new Contact(name, phoneNumber);
        contactList.put(name, newContact);


   }

    public String lookUpPhoneNumber(String name) {
        return treeMap.get(name);
    }

    public void remove(String name){
      treeMap.remove(name);

    }


    public  String reverseLookUp(String phoneNumber) {
            String answer = "";
                for(String name : treeMap.keySet() ) {

                if( treeMap.get(name) == phoneNumber  ){
                    answer = name;
                }
        }
        return answer ;
    }

    public void display (){

        Set<String> nameSet = treeMap.keySet();

            for(String name : nameSet){
               //prints out   name  " " phone number     new line break
                System.out.print(name + " " + treeMap.get(name) + "\n");

                //System.out.print(me.getKey() + ": ");
               // System.out.println(me.getValue());

            }

        }


        public Map<String,Contact> getContactList(){
        return contactList;


        }


    }


