package ru.netology;

import java.util.HashMap;
import java.util.Map;

public class PhoneBook {
    private Map<String, String> phoneBook = new HashMap<>();
    private int counter;

    public int add(String name, String phoneNumber) {
        if (!(phoneBook.containsKey(name))) {
            phoneBook.put(name, phoneNumber);
            counter++;
        }
        return counter;
    }

    public String findByNumber(String phoneNumber) {
        return null;
    }
}
