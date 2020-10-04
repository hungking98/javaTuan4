package Tuan4;

import java.util.Objects;

// test Hash Set/ // Overide euqual va hashcode
public class Car {
    private int id;
    private String carname;
    private int year;

    public Car(int id, String carname, int year){
        this.id = id;
        this.carname = carname;
        this.year = year;

    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setCarname(String carname) {
        this.carname = carname;
    }

    public String getCarname() {
        return carname;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", carname='" + carname + '\'' +
                ", year=" + year +
                '}';
    }

    //overide


    @Override
    public boolean equals(Object o) {
        Car car = (Car) o;
        return id == car.id &&
                year == car.year &&
                Objects.equals(carname, car.carname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, carname, year);
    }
}
