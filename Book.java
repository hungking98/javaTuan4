package Tuan4;

public class Book implements Comparable<Book>{
    private int id;
    private String bookname;
    private String author;

    public Book(int id, String bookname, String author){
        this.id = id;
        this.bookname = bookname;
        this.author = author;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setBookname(String bookname) {
        this.bookname = bookname;
    }

    public String getBookname() {
        return bookname;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", bookname='" + bookname + '\'' +
                ", author='" + author + '\'' +
                '}';
    }

    @Override
    public int compareTo(Book o) {
        return this.getBookname().compareTo(o.getBookname());
    }
}
