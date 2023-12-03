package ru.rudnev.test.java;

import java.util.*;

public class PhoneBook {
    private Map<String, List<String>> phoneBook;

    public PhoneBook() {
        phoneBook = new HashMap<>();
    }

    public void add(String name, String phoneNumber){
        if (phoneBook.containsValue(phoneNumber)){
            System.out.println("This phone number already exist in phone book!");
        } else {
         List<String> phoneNumbers = new ArrayList<>();
         phoneNumbers.add(phoneNumber);
         phoneBook.put(name, phoneNumbers);
        }
        System.out.println(phoneBook);
    }

    public List<String> find(String name){
        return phoneBook.getOrDefault(name, new ArrayList<>());
    }

    public boolean containsPhoneNumber(String phoneNumber){
        return phoneBook.values().stream().anyMatch(numbers -> numbers.contains(phoneNumber));
    }
}
