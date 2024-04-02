package ru.netology;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;

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
        return phoneBook.entrySet()
                .stream()
                .filter(entry -> (Objects.equals(entry.getValue(), phoneNumber)))
                .map(Map.Entry::getKey)
                .collect(Collectors.joining());
    }

    public String findByName(String name) {
        return phoneBook.get(name);
    }

    public String printAllNames() {
        return null;
    }
}
