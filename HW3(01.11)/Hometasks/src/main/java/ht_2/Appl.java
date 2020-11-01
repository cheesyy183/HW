package ht_2;

import javax.print.DocFlavor;
import java.lang.ref.SoftReference;
import java.util.*;

public class Appl {
    public static void main(String[] args) {
        final String remove_name = "Stepan"; // name that should be remove from the map

        Map<String, String> personMap = new HashMap();

        // initialization personMap(last name, first name)

        personMap.put("Shevchenko", "Petro");
        personMap.put("Boyko", "Stepan");
        personMap.put("Kovalenko", "Igor");
        personMap.put("Tkachenko", "Orest");
        personMap.put("Kravchenko", "Bohdan");
        personMap.put("Shevchyk", "James");
        personMap.put("Ponomarenko", "Stepan");
        personMap.put("Vasulenko", "Mukola");
        personMap.put("Homenko", "Stepan");
        personMap.put("Kyluk", "Roman");

        // printing personMap

        System.out.println();
        for (Map.Entry<String, String> entry : personMap.entrySet()) {
            System.out.println("Last name = " + entry.getKey() + ", first name = " + entry.getValue() + ".");
        }

        // check if there are at least two person with the same firstName among this 10 person


        Object[] temp = personMap.values().toArray();

        boolean checked = false;

        System.out.println();
        for (int i = 0; i < personMap.size() - 1; i++) {
            for (int j = i + 1; j < personMap.size(); j++) {
                if (temp[i] == temp[j]) {
                    System.out.println("There are at least two person with the same firstName among this 10 person.");
                    checked = true;
                    break;
                }
            }
            if (checked) break;
        }
        if (!checked) System.out.println("There aren't persons with the same firstName.");

        // remove from the map person whose firstName is ”Orest”

        Iterator<Map.Entry<String, String>> iterator = personMap.entrySet().iterator();

        while (iterator.hasNext()) {
            Map.Entry<String, String> entry = iterator.next();

            if (entry.getValue().equals(remove_name)) {
                iterator.remove();
            }
        }

        // printing personMap

        System.out.println();
        for (Map.Entry<String, String> entry : personMap.entrySet()) {
            System.out.println("Last name = " + entry.getKey() + ", first name = " + entry.getValue() + ".");
        }
    }
}
