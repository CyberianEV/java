package org.lesson3;

import java.util.*;

public class PhoneBook {

    Map<String, ArrayList<String>> book;

    PhoneBook() { book = new HashMap<>(); }

    public void add (String surname, String phonenumber) {
        boolean duplicationflag = false;
        for (Map.Entry<String, ArrayList<String>> o : book.entrySet()) {
            if (o.getKey().equals(surname)) {
                o.getValue().add(phonenumber);
                duplicationflag = true;
                break;
            }
        }
        if(!duplicationflag) {
            book.put(surname, new ArrayList<String>(Arrays.asList(phonenumber)));
        }
    }

    public void get(String surname) {
        if (book.get(surname) == null) {
            System.out.format("There is no information about %s in the PhoneBook", surname);
        } else {
            System.out.format("%s: %s", surname, book.get(surname));
        }
    }

    public void show() {
        System.out.println(book);
    }

}
