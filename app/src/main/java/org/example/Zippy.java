package org.example;

import java.util.List;
import java.util.ArrayList;

public class Zippy {
    public static <T> List<T> zip(List<T> list1, List<T> list2) {
        List<T> result = new ArrayList<>();

        int i = 0;
        while (i < list1.size() && i < list2.size()) {
            result.add(list1.get(i));
            result.add(list2.get(i));
            i++;
        }

        while (i < list1.size()) {
            result.add(list1.get(i));
            i++;
        }

        while (i < list2.size()) {
            result.add(list2.get(i));
            i++;
        }

        return result;
    }
}