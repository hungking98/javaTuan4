package Tuan4;

public class Student {
    private int id;
    private String name;
    private int age;
    private String classname;

    public Student(int id, String name, int age, String classname){
        this.id = id;
        this.age = age;
        this.name = name;
        this.classname = classname;

    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setClassname(String classname) {
        this.classname = classname;
    }

    public String getClassname() {
        return classname;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", classname='" + classname + '\'' +
                '}';
    }
}
