package ht_1;

import java.util.HashSet;
import java.util.Set;

public class SetsOperations {
    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet();
        Set<Integer> set2 = new HashSet();
        Set<Integer> union_sets = new HashSet();

        // initialization sets

        set1.add(5);
        set1.add(6);
        set1.add(7);

        set2.add(3);
        set2.add(4);
        set2.add(5);

        // print sets

        System.out.println("Set 1: " + set1.toString());
        System.out.println("Set 2: " + set2.toString());

        // union set1 and set2 in union_sets

        SetsOperations.union(set1, set2, union_sets);

        //print union_sets

        System.out.println("Union sets: " + union_sets.toString());

        Set<Integer> intersect_sets = new HashSet();

        // intersect set1 and set2 in intersect_sets

        SetsOperations.intersect(set1, set2, intersect_sets);

        // print intersect_sets

        System.out.println("Intersect sets: " + intersect_sets.toString());
    }

    public static void union(Set set1, Set set2, Set union_sets) { // method to union set1 and set2 to union_sets
        for (Object element : set1) {
            union_sets.add(element);
        }

        for (Object element : set2) {
            union_sets.add(element);
        }
    }

    public static void intersect(Set set1, Set set2, Set intersect_sets) { // method to intersect set1 and set2 to intersect_sets
        for (Object element : set1) {
            if (set2.contains(element)) {
                intersect_sets.add(element);
            }
        }
    }
}
