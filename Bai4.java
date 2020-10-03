package Tuan4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Bai4 {
    public static void main(String[] args) {
        //khai báo arraylist kiểu Student;
        ArrayList<Student> studentArrayList = new ArrayList<Student>();

        //add
        studentArrayList.add(new Student(1,"Nguyen Van Anh",16,"2A"));
        studentArrayList.add(new Student(3,"Nguyen Van Manh",22,"7A"));
        studentArrayList.add(new Student(5,"Nguyen Van Tuan",15,"1A"));
        studentArrayList.add(new Student(8,"Nguyen Van Banh",31,"3A"));
        studentArrayList.add(new Student(6,"Nguyen Van Phuong",96,"15A"));
        studentArrayList.add(new Student(20,"Nguyen Van Ninh",69,"20A"));

        //Duyệt (đã over Student.ToString)

        for (Student st: studentArrayList
             ) {
            System.out.println(st);

        }

        //Set, get

        studentArrayList.add(new Student(0,"Nguyen Van Trung",16,"2A"));

        System.out.println("Học sinh đầu danh sách:" +studentArrayList.get(0));

        //Xóa

        studentArrayList.remove(5);

        //Sort theo tên thứ tự tăng dần

        Collections.sort(studentArrayList, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });

        System.out.println("Danh sach theo ten tang dan");
        for (Student st: studentArrayList
        ) {
            System.out.println(st);

        }

        //Sort theo tuổi:
        Collections.sort(studentArrayList, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getAge()- o2.getAge();
            }
        });
        System.out.println("Danh sach theo tuoi tang dan");
        for (Student st: studentArrayList
        ) {
            System.out.println(st);

        }



    }
}
