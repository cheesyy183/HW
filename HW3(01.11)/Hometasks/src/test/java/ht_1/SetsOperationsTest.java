package ht_1;

import org.junit.Test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static org.junit.Assert.*;

public class SetsOperationsTest {

    @Test
    public void union() {
        System.out.println("union method testing");
        Set<Integer> set1 = new HashSet();
        Set<Integer> set2 = new HashSet();
        Set<Integer> expResult = new HashSet();
        Set<Integer> result = new HashSet();

        set1.add(1);
        set1.add(2);
        set1.add(3);

        set2.add(4);
        set2.add(5);
        set2.add(6);

        expResult.add(1);
        expResult.add(2);
        expResult.add(3);
        expResult.add(4);
        expResult.add(5);
        expResult.add(6);

        SetsOperations.union(set1, set2, result);

        assertEquals(expResult, result);
    }

    @Test
    public void intersect() {
        System.out.println("intersect method testing");
        Set<Integer> set1 = new HashSet();
        Set<Integer> set2 = new HashSet();
        Set<Integer> expResult = new HashSet();
        Set<Integer> result = new HashSet();

        set1.add(1);
        set1.add(2);
        set1.add(3);

        set2.add(2);
        set2.add(3);
        set2.add(6);

        expResult.add(2);
        expResult.add(3);

        SetsOperations.intersect(set1, set2, result);

        assertEquals(expResult, result);
    }
}