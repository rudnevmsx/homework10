package ru.rudnev.test.java;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add("Иванов", "123-45-67");
        phoneBook.add("Петров", "890-12-34");
        phoneBook.add("Сидоров", "456-78-90");
        phoneBook.add("Козлов", "777-77-77");
        phoneBook.add("Козлов", "177-77-77");
        phoneBook.add("Новикова", "555-55-55");

        System.out.println(phoneBook.find("Козлов"));
        System.out.println(phoneBook.containsPhoneNumber("1777-77-77"));
    }
}