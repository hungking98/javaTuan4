package Tuan4;

import java.util.HashSet;

public class Bai6 {
    public static void main(String[] args) {
        //String HashSet

        HashSet<String> stringHashSet = new HashSet<String>();
        stringHashSet.add("Mot");
        stringHashSet.add("Hai");
        stringHashSet.add("Ba");
        stringHashSet.add("Bon");
        stringHashSet.add("Nam");
        // duplicate??
        stringHashSet.add("Nam");

        //duyet
        for (String str: stringHashSet
             ) {
            System.out.println(str);

        }

        //remove
        stringHashSet.remove("Mot");
        System.out.println("Sau khi xoa:");
        for (String str: stringHashSet
        ) {
            System.out.println(str);

        }

        //size
        System.out.println(stringHashSet.size());

        //contains
        boolean check = stringHashSet.contains("Nam");
        System.out.println(check == true? "Co phan tu nay" : "Khong co phan tu nay");

        //clear
        stringHashSet.clear();

    }
}
