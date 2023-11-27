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
        if (phoneBook.containsKey(name)){
            return phoneBook.get(name);
        }
        return Collections.emptyList();
    }

    public boolean containsPhoneNumber(String phoneNumber){
        for (List<String> phoneNumbers : phoneBook.values()){
            if (phoneNumbers.contains(phoneNumber)){
                return true;
            }
        }
        return false;
    }
}
