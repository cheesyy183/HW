package task_1;

import java.util.*;

public class Appl1 {
    public static class CollectionComparator implements Comparator<Integer> { // class comparator for sorting collection of integers
        @Override
        public int compare(Integer elem1, Integer elem2) {
            return elem1.compareTo(elem2);
        }
    }

    public static void main(String[] args) {
        final int RAND_ELEMENTS = 10; // amount of random elements in array list
        final int DIFF = 30; // difference of max and min numbers of myCollection
        final int FIRST_BOUNDARY = 5; // first boundary value
        final int LAST_BOUNDARY = 20; // last boundary value

        List<Integer> myCollection = new ArrayList();
        Random rand = new Random();

        // fill a collection "myCollection" by random int numbers

        for (int i = 0; i < RAND_ELEMENTS; i++) {
            myCollection.add(rand.nextInt(DIFF + 1));
        }

        // print myCollection

        System.out.println("\nmyCollection " + myCollection.toString());

        List<Integer> newCollection = new ArrayList();

        //find and save all elements, that are greater than 5

        for (Integer temp : myCollection) {
            if (temp > FIRST_BOUNDARY) {
                newCollection.add(temp);
            }
        }

        // print newCollection

        System.out.println("\nnewCollection > "  + FIRST_BOUNDARY + ": " + newCollection.toString());

        //remove all elements that are greater than 20

        Iterator iterator = newCollection.iterator();


        while (iterator.hasNext()) {
            if ((Integer)iterator.next() > LAST_BOUNDARY) {
                iterator.remove();
            }
        }

        // print newCollection

        System.out.println("\n(newCollection > " + FIRST_BOUNDARY + ") && (newCollection <= " + LAST_BOUNDARY + "): " + newCollection.toString());

        // insert elements 1, -3, -4 in positions 2, 8, 5

        int position1 = 2;
        int position2 = 8;
        int position3 = 5;

        int element1 = 1;
        int element2 = -3;
        int element3 = -4;

        add_element(position1, element1, newCollection);
        add_element(position2, element2, newCollection);
        add_element(position3, element3, newCollection);

        // print newCollection

        System.out.println();
        for (Integer temp : newCollection) {
            System.out.println("Position - " + newCollection.indexOf(temp) + ", value of element - " + temp + ".");
        }

        // sort newCollection

        newCollection.sort(new CollectionComparator());

        // print new Collection

        System.out.println("\nSorted collection: " + newCollection.toString());
    }

    public static void add_element(int position, int element, List<Integer> o) { // method check if position to add element isn't greater then size of collection
        if (o.size() > position) {
            o.add(position, element);
            System.out.println("\nElement " + element + " was added on position " + position + ".");
        }
        else System.out.println("\nElement " + element + " wasn't added on position " + position + ".");
    }
}
