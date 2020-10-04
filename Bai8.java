package Tuan4;

import java.util.Comparator;
import java.util.SortedSet;
import java.util.TreeSet;

public class Bai8 {
    //TreeSet with Integer

    public static void main(String[] args) {
        TreeSet<Integer> integerTreeSet = new TreeSet<Integer>();
        integerTreeSet.add(100);
        integerTreeSet.add(100);
        integerTreeSet.add(1);
        integerTreeSet.add(3);
        integerTreeSet.add(2);
        integerTreeSet.add(10);

        for (Integer inter : integerTreeSet){
            System.out.println(inter);

        }

        integerTreeSet.remove(100);
        for (Integer inter : integerTreeSet){
            System.out.println(inter);

        }


        boolean check = integerTreeSet.contains(3);
        System.out.println(check == true ? "Co" : "Khong");

        SortedSet<Integer> integerSortedSet = new TreeSet<Integer>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        });

        integerSortedSet.addAll(integerTreeSet);
        for (Integer st:integerSortedSet
             ) {
            System.out.println(st);   // giam dan

        }


    }
}
