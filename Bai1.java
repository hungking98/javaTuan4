package Tuan4;

import java.util.LinkedList;

public class Bai1 {
    public static <Interger> void main(String[] args) {
        //Linked List String
        LinkedList <String> stringLinkedList = new LinkedList<String>();
        LinkedList<String> buffLink     = new LinkedList<String>();
        //add dũ liệu
        stringLinkedList.add("Tuan");
        stringLinkedList.add(1,"Hung");
        stringLinkedList.add("Tam");
        stringLinkedList.add("Trang");
        stringLinkedList.addFirst("Fist String");
        stringLinkedList.addLast("Last String");
        buffLink.add("Buff1");
        buffLink.add("Buff2");
        System.out.println(stringLinkedList);

        //số phần tử của list:
        System.out.println("So phân tử của list:" + stringLinkedList.size());

        //Truy cập phần tử:
        System.out.println("Phần tử thứ 2 trong lis:"+ stringLinkedList.get(1));

        //Cập nhật giá trị cho phần tử 1:
        stringLinkedList.set(1,"New String");
        System.out.println(stringLinkedList);

        //Xóa phần tử theo chỉ số và theo nội dung String
        stringLinkedList.remove(1);
        System.out.println("SAU XÓA lần 1:" + stringLinkedList);
        //Xoa phần tử có tên là Hùng
        stringLinkedList.remove("Hung");
        System.out.println("SAU XÓA lần 2:" + stringLinkedList);
        stringLinkedList.removeFirst();
        stringLinkedList.removeLast();
        System.out.println("Sau khi xóa đầu và cuối" + stringLinkedList);

        //Kiểm tra phần tử có trong list:

        boolean check = stringLinkedList.contains("Trang");
        if (check) System.out.println("Co tim thay Trang");

        //Tìm kiếm vị trí xuất hiện
        System.out.println("Vi tri xuất hiện sau cùng của Tam:" + stringLinkedList.lastIndexOf("Tam"));
        System.out.println("Vi tri xuất hiện sau cùng của Tuan:" + stringLinkedList.lastIndexOf("Tuan"));

        // Add một list khác vào
        stringLinkedList.addAll(buffLink);

        System.out.println("Sau khi add bufflis:"+stringLinkedList);

        // xóa một danh sách các string trong danh sách con
        stringLinkedList.removeAll(buffLink);
        System.out.println(stringLinkedList);

        // clear list string
        stringLinkedList.clear();
        buffLink.clear();




        // List Integer
        LinkedList<Integer>  intList = new LinkedList<Integer>();
        LinkedList<Integer> intList1 = new LinkedList<Integer>();
        //add dũ liệu
        intList.add(5);
        intList.add(7);
        intList.add(8);
        intList.add(9);
        intList.addFirst(4);
        intList.addLast(10);
        intList1.add(1);intList1.add(2);intList1.add(3);
        System.out.println(intList);
        //số phần tử của list:
        System.out.println("Size:" + intList.size());
        //Truy cập phần tử:
        System.out.println("Lấy các phần tử đầu, cuối và phần tử theo index:");
        System.out.println(intList.getFirst());
        System.out.println(intList.getLast());
        System.out.println(intList.get(2));
        //Cập nhật giá trị cho phần tử
         intList.set(3,100);
         System.out.println(intList);
        //Xóa phần tử
        intList.remove(0);
        intList.removeFirst();
        intList.removeLast();
        intList.remove((Object)100);
        System.out.println(intList);
        //Kiểm tra phần tử có trong list:
        System.out.println(intList.contains(7));
        //Tìm kiếm vị trí xuất hiện
        System.out.println(intList.lastIndexOf(7));
        // Add một list khác vào

        intList.addAll(intList1);
        System.out.println(intList);
        // xóa một danh sách
        intList.removeAll(intList1);
        System.out.println(intList);
        // clear list
        intList.clear();
        System.out.println(intList); // rỗng

        //List Double
        LinkedList<Double> db = new LinkedList<Double>();
        LinkedList<Double> db1 = new LinkedList<Double>();
        //add dũ liệu
        db.add(0.0);
        db.add(1.11);
        db.add(2.24);
        db.add(3.45);
        db.add(-5.6);

        db1.add(10.15);
        db1.add(5.5);
        System.out.println(db);

        //số phần tử của list:
        System.out.println("sizze:" + db.size());
        //Truy cap
        System.out.println(db.getLast());
        System.out.println(db.getFirst());
        System.out.println(db.get(3));

        //Cập nhật giá trị cho phần tử
        db.set(3,10.5);
        //Xóa phần tử
        db.remove(2);
        db.remove((Object)1.11);
        System.out.println("Sau delete:" +  db);

        //Kiểm tra phần tử có trong list:
        System.out.println(db.contains(3.45) == true ? "Có thấy" : "Không thấy");
        //Tìm kiếm vị trí xuất hiện
        System.out.println("Vị trí tìm thấy:" + db.lastIndexOf(0.0));
        // Add một list khác vào
        db.addAll(db1);
        System.out.println(db);
        // xóa một danh sách
        db.removeAll(db1);
        System.out.println(db);
        // clear list
        db.clear();

        //List Float
        LinkedList<Float> fl = new LinkedList<Float>();
        LinkedList<Float> fl1 = new LinkedList<Float>();
        //add
        fl.add(0.5f);
        fl.add(0.6f);
        fl.add(0.7f);
        fl.add(0.8f);
        fl.add(0.9f);

        fl1.add(3.3f);
        fl1.add(4.4f);
        //set, get
        fl.get(1);
        fl.getFirst();
        fl.getLast();

        fl.set(3,5.5f);
        //kiểm tra phần tử tồn tại:
        System.out.println(fl.contains(3.3f) == true ? "Co" : "Khong ton tai");
        // remove
        fl.remove(0);
        fl.removeFirst();

        //add All
        fl.addAll(fl1);
        System.out.println(fl);

        fl.removeAll(fl1);

        //clear;
        fl.clear();
        fl1.clear();


    }

}
