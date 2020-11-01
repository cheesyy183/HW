package task_1;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import static org.junit.Assert.*;

public class ApplTest {

    @Test
    public void add_element() {
        System.out.println("testing method add_element");

        List<Integer> expCollection = new ArrayList();
        List<Integer> resultCollection = new ArrayList();

        resultCollection.add(5);
        resultCollection.add(9);
        resultCollection.add(12);
        resultCollection.add(-7);
        resultCollection.add(-2);

        int position1 = 3;
        int position2 = 11;
        int position3 = 7;

        int element1 = 1;
        int element2 = -3;
        int element3 = -4;

        Appl1.add_element(position1, element1, resultCollection);
        Appl1.add_element(position2, element2, resultCollection);
        Appl1.add_element(position3, element3, resultCollection);

        expCollection.add(5);
        expCollection.add(9);
        expCollection.add(12);
        expCollection.add(1);
        expCollection.add(-7);
        expCollection.add(-2);

        assertEquals(expCollection, resultCollection);

    }
}