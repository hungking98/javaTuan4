package Tuan4;

import java.util.Comparator;
import java.util.PriorityQueue;

public class Bai5 {
    public static void main(String[] args) {
        //Book Queue

        PriorityQueue<Book> bookPriorityQueue = new PriorityQueue<Book>();
        // ban đầu thứ tự ưu tiên theo
        //add
        bookPriorityQueue.add(new Book(1,"Sach A","Nguyen Van K"));
        bookPriorityQueue.add(new Book(7,"Sach C","Nguyen Van W"));
        bookPriorityQueue.add(new Book(3,"Sach B","Nguyen Van C"));
        bookPriorityQueue.add(new Book(2,"Sach M","Nguyen Van A"));


        //kiểm tra rỗng

        System.out.println(bookPriorityQueue.isEmpty() == true? "Rỗng" : "Có phần tử trong hàng đợi ưu tiên");

        //remove lấy và loại bỏ phần tử đầu
        while (!bookPriorityQueue.isEmpty()){
            System.out.println(bookPriorityQueue.remove());
        }

        //peek lấy phần từ đầu nhưng không loại bỏ, trả về null nếu không cos
        System.out.println(bookPriorityQueue.peek());

        // Tạo mội danh sách book mới, ưu tiên theo tên tác giả
        PriorityQueue<Book> bq2 = new PriorityQueue<>(new Comparator<Book>() {
            @Override
            public int compare(Book o1, Book o2) {
                return o1.getAuthor().compareTo(o2.getAuthor());
            }
        });

        bq2.add(new Book(1,"Sach A","Nguyen Van K"));
        bq2.add(new Book(7,"Sach C","Nguyen Van W"));
        bq2.add(new Book(3,"Sach B","Nguyen Van C"));
        bq2.add(new Book(2,"Sach M","Nguyen Van A"));

        //remove lấy và loại bỏ phần tử đầu
        while (!bq2.isEmpty()){
            System.out.println(bq2.remove());
        }





    }
}
