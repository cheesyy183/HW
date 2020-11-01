package task_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Map;
import java.util.TreeMap;

public class Appl2 {
    public static void main(String[] args) throws IOException {
        Map<Integer, String> employeeMap = new TreeMap();

        // initialization employeeMap

        employeeMap.put(123, "Petro");
        employeeMap.put(345, "Stepan");
        employeeMap.put(567, "Igor");
        employeeMap.put(789, "Orest");
        employeeMap.put(912, "Bohdan");
        employeeMap.put(234, "James");
        employeeMap.put(456, "Vasia");

        // printing employeeMap

        System.out.println();
        for (Map.Entry<Integer, String> entry : employeeMap.entrySet()) {
            System.out.println("ID = " + entry.getKey() + ", name = " + entry.getValue() + ".");
        }

        // ask user to enter ID, then find and write corresponding name from employeeMap.
        // if can't find this ID, say about it to user

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println();
        System.out.print("Enter ID to find a name: ");
        Integer user_ID = Integer.parseInt(br.readLine());

        System.out.println();
        if (employeeMap.containsKey(user_ID)) {
            System.out.println("Name with ID " + user_ID + " is " + employeeMap.get(user_ID) + ".");
        }
        else System.out.println("Name with ID " + user_ID +" wasn't found.");

        // ask user to enter name, verify than  map have this name and write corresponding ID.
        // if can't find this name - say about it to user

        System.out.println();
        System.out.print("Enter name to find a ID: ");
        String user_name = br.readLine();

        System.out.println();
        if (employeeMap.containsValue(user_name)) {
            for (Map.Entry<Integer, String> entry : employeeMap.entrySet()) {
                if (user_name.equals(entry.getValue())) {
                    System.out.println("ID with name " + user_name + " is " + entry.getKey() + ".");
                }
            }
        }
        else System.out.println("ID with name " + user_name +" wasn't found.");
    }
}
