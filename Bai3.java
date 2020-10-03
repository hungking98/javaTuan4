package Tuan4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

public class Bai3 {
    // Array List
    public static void main(String[] args) {
        //String
        ArrayList<String> stringArrayList = new ArrayList<String>();
        //add
        stringArrayList.add("B");
        stringArrayList.add("C");
        stringArrayList.add("A");
        stringArrayList.add("M");
        stringArrayList.add("H");
        stringArrayList.add(0,"J");

        //get
        System.out.println(stringArrayList.get(3));
        //set
        stringArrayList.set(3,"N");


        //Duyệt bằng for cho dễ
        for (int i = 0;i<stringArrayList.size();i++){
            System.out.println(stringArrayList.get(i));
        }
        //Duyệt bằng Iterator
        Iterator<String> str = stringArrayList.iterator();
        while (str.hasNext()){
            System.out.println(str.next());
        }

        //Xóa phần tử ở vị trí
        stringArrayList.remove(0);

        //Xóa phần tử theo đối tượng
        stringArrayList.remove("M");
        System.out.println("Duyet lai sau khi xoa phan tu");
        for (int i = 0;i<stringArrayList.size();i++){
            System.out.println(stringArrayList.get(i));
        }

        //Sắp xếp bằng Colection.Sort
        Collections.sort(stringArrayList, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o2.compareTo(o1);
            }
        });

        System.out.println("Duyet lai sau khi sap xep xâu theo kiểu giảm dần");
        for (int i = 0;i<stringArrayList.size();i++){
            System.out.println(stringArrayList.get(i));
        }

        Collections.sort(stringArrayList, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        });

        System.out.println("Duyet lai sau khi sap xep xâu theo kiểu tăng dần");
        for (int i = 0;i<stringArrayList.size();i++){
            System.out.println(stringArrayList.get(i));
        }


        //Tìm kiếm kiểu nhị phân với xâu đã được sắp xếp;

        String xautimkiem = "B";

        int i = Collections.binarySearch(stringArrayList, xautimkiem, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        });

        System.out.println("Vi tri tim thay xau:"+ i);


        // Integer
        ArrayList<Integer> integerArrayList = new ArrayList<Integer>();
        integerArrayList.add(1);
        integerArrayList.add(3);
        integerArrayList.add(5);
        integerArrayList.add(2);
        integerArrayList.add(19);
        integerArrayList.add(20);
        integerArrayList.add(16);

        //Duyệt
        for (Integer temp : integerArrayList){
            System.out.println(temp);
        }

        //Get
        System.out.println(integerArrayList.get(5));
        //Set
        integerArrayList.set(5,70);
        System.out.println("Sau khi set index 5");
        for (Integer temp : integerArrayList){
            System.out.println(temp);
        }

        //remove on inddexxxxx

        integerArrayList.remove(5);

        //Sort giảm dần

        Collections.sort(integerArrayList, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        });

        System.out.println("Duyệt mảng sau khi sort giảm dần:");
        for (Integer temp : integerArrayList){
            System.out.println(temp);
        }

        //Sort tăng dần
        Collections.sort(integerArrayList, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1 - o2;
            }
        });

        //Tìm kiếm nhị phân
        int key = 5;
        int index = Collections.binarySearch(integerArrayList, key, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1.compareTo(o2);
            }
        });

        System.out.println("Vị trí:" + index);

        //clear
        integerArrayList.clear();


    }
}
