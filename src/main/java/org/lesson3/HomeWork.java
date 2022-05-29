package org.lesson3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.TreeSet;

public class HomeWork {

    private static class WordsQuantity {
        String name; int quantity;
        WordsQuantity (String name) { this.name = name; }
        public void increaseQuantity () { this.quantity++; }
        public String getName () { return name; }
        @Override public String toString() { return String.format("%s: %d", name, quantity); }
    }

    private static void equalWordsCounter (String[] arr) {
        TreeSet<String> tree = new TreeSet<>(Arrays.asList(arr));
        ArrayList<String> listfromtree = new ArrayList<>(tree);
        ArrayList<String> fulllist = new ArrayList<>(Arrays.asList(arr));
        ArrayList<WordsQuantity> fruitlist = new ArrayList<>();
        for (int i = 0; i < listfromtree.size(); i++) {
            fruitlist.add(new WordsQuantity(listfromtree.get(i)));
            for (int j = 0; j < fulllist.size(); j++) {
                if (fruitlist.get(i).getName().equals(fulllist.get(j)))
                    fruitlist.get(i).increaseQuantity();
            }
        }
        System.out.println(fruitlist);
    }

    public static void main(String[] args) {
        String[] array = {
                "apple", "banana", "strawberry", "cherry",
                "pineapple", "lemon", "peach", "banana",
                "watermelon", "pineapple", "orange", "melon",
                "mandarin", "plum", "peach", "apricot",
                "banana", "melon", "banana"
        };
        TreeSet<String> tree = new TreeSet<>(Arrays.asList(array));
        System.out.println(tree);
        equalWordsCounter(array);

        PhoneBook b = new PhoneBook();
        b.show();
        b.add("Ivanov", "33-11-22");
        b.add("Petrov", "33-15-46");
        b.add("Sidorov", "35-88-17");
        b.add("Ivanov", "31-31-22");
        b.add("Vasechkin", "33-09-14");
        b.add("Sidorov", "32-22-22");
        b.add("Ivanov", "35-55-55");
        b.show();
        b.get("Ivanov");
        b.get("Petrov");
        b.get("Chi");

        List<String> list = new ArrayList<>(Arrays.asList(array));
//        list.contains();

    }
}
