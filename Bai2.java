package Tuan4;

import java.util.Iterator;
import java.util.LinkedList;

public class Bai2 {
    public static void main(String[] args) {
        LinkedList<Student> studentLinkedList = new LinkedList<Student>();
        LinkedList<Student> studentListbuff = new LinkedList<Student>();
        Student s1 = new Student(0,"Hung", 10,"1A");
        Student s2 = new Student(1,"Tuan",12,"2A");
        Student s3 =  new Student(2,"Van",13,"10A2");
        Student s4 =  new Student(3,"Duc",15,"11A2");

        Student s5 =  new Student(7,"Trong",15,"11A2");
        Student s6 =  new Student(10,"Hoang",15,"10A12");


        //add
        studentLinkedList.add(s1);
        studentLinkedList.add(s2);
        studentLinkedList.addFirst(s3);
        studentLinkedList.addLast(s4);

        studentListbuff.add(s5);
        studentListbuff.add(s6);

        //Size
        System.out.println(studentLinkedList.size());
        System.out.println(studentListbuff.size());

        //Get, set

        System.out.println("Lấy phần tử và cập nhật phần tử:");
        System.out.println(studentLinkedList.getFirst());
        System.out.println(studentLinkedList.getLast());

        Student temp = new Student(12,"Kiet", 17,"15a1");
        studentLinkedList.set(2,temp);

        System.out.println("Duyệt:");
        //duyệt để in
        Iterator<Student>  iter = studentLinkedList.iterator();
        while (iter.hasNext()){
            System.out.println(iter.next());
        }

        //Xoa phan tu

        studentLinkedList.remove(1);
        System.out.println("Duyệt lại danh sách sau khi xóa phần tử:");
        for (Student st : studentLinkedList
             ) { System.out.println(st);

        }

        //Xoa phan tu theo Object

        studentLinkedList.remove(s4);
        System.out.println("Duyệt lại danh sách sau khi xóa phần tử:");
        for (Student st : studentLinkedList
        ) { System.out.println(st);

        }

        //Thêm vào danh sách Oj
        System.out.println("Duyet lai danh sách sau khi thêm listStudent");
        studentLinkedList.addAll(studentListbuff);
        for (Student st: studentLinkedList
             ) {System.out.println(st);

        }

        //Lấy chỉ số
        System.out.println("Chỉ số của s5:" + studentLinkedList.indexOf(s5));

        //Xóa danh sách con:
        studentLinkedList.removeAll(studentListbuff);
        System.out.println("Duyet lai danh sách sau khi xóa listStudent con");
        for (Student st: studentLinkedList
        ) {System.out.println(st);

        }

        // xóa cả danh sách
        studentLinkedList.clear();



    }
}
