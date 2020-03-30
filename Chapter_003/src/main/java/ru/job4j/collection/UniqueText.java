package ru.job4j.collection;

import java.util.HashSet;

public class UniqueText {
    public static boolean isEquals(String originText, String duplicateText) {
        boolean rsl = true;
        String[] origin = originText.split(" ");
        String[] text = duplicateText.split(" ");
        HashSet<String> check = new HashSet<>();
        for (String origin2 : originText.split(" ")) {
            check.add(origin2);
        }
        for (String text2 : duplicateText.split(" ")) {
            if (!check.contains(text2)) {
                rsl = false;
                break;
            }

        }


        // for-each text -> hashSet.contains
        return rsl;
    }
}