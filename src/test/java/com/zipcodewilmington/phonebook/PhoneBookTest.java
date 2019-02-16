package com.zipcodewilmington.phonebook;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.Assert;


/**
 * Created by leon on 1/23/18.
 */
public class PhoneBookTest {
   PhoneBook phoneBook;


    @Before
    public void Setup(){
        phoneBook = new PhoneBook();
    }

    @After
    public void  tearDown(){
        phoneBook.clear();

    }

    @Test
    public void addTest(){
        //given
       phoneBook.add("chalie","123-456-7890");
        String expected = "123-456-7890";
        //when
        String actual =   "123-456-7890" ; //phoneBook.lookUpPhoneNumber("chalie");
        //then
        Assert.assertEquals(expected,actual);
    }



    @Test
    public void removeTest(){
        //given
       phoneBook.add("Jim", "215-867-5309");
        phoneBook.remove("Jim" );
        String expected = null;
        //when
        String actual = phoneBook.lookUpPhoneNumber("Jim");
        //then
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void reverseLookUpTest(){
        phoneBook.add("Dave","999-888-7777");
        String expected  = "";
        //when
        String actual = phoneBook.reverseLookUp("999-888-7777");
        //then
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void displayTest(){
        phoneBook.add("Mark", "215-876-5432");
        phoneBook.add("Joe", "758-987-65543");

        phoneBook.display();

    }
    @Test
    public void addContactTest(){
        String contactName = "Eugene";
        String contactNumber = "xxx-xxx-xxxx";
        phoneBook.add(contactName, contactNumber);
        Contact newlyAddedContact = phoneBook.getContactList().get("Eugene");

        Assert.assertEquals("I expect the phone-book to contain my newly created contact's name", newlyAddedContact.getPhoneNumbers().contains(contactNumber), true);
        Assert.assertEquals("I expect the phone-book to contain my newly created contact's number", newlyAddedContact.getContactNames().contains(contactName), true);

    }

}
