package ru.netology;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class PhoneBookTest {

    @Test
    public void addTest() {
        PhoneBook phoneBook = new PhoneBook();
        String name1 = "Kolya";
        String name2 = "Petya";
        String phoneNumber1 = "8 (965) 218 41 23";
        String phoneNumber2 = "8 (955) 214 62 42";
        int counter;

        counter = phoneBook.add(name1, phoneNumber1);
        counter = phoneBook.add(name2, phoneNumber2);

        Assertions.assertEquals(2, counter);
    }

    @Test
    public void addTestSameNames() {
        PhoneBook phoneBook = new PhoneBook();
        String name = "Kolya";
        String phoneNumber = "8 (965) 218 41 23";
        int counter;

        counter = phoneBook.add(name, phoneNumber);
        counter = phoneBook.add(name, phoneNumber);

        Assertions.assertEquals(1, counter);
    }
}
