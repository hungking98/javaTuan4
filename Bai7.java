package Tuan4;

import java.util.HashSet;

public class Bai7 {
    public static void main(String[] args) {
        HashSet<Car> carHashSet = new HashSet<Car>();
        //add
        carHashSet.add(new Car(1,"VinCar01",2020));
        carHashSet.add(new Car(2,"VinCar02",2021));
        carHashSet.add(new Car(3,"VinCar03",2022));
        carHashSet.add(new Car(4,"VinCar04",2023));
        carHashSet.add(new Car(4,"VinCar04",2025));

        System.out.println("So phan tu:" + carHashSet.size());
        //duyet
        for (Car car: carHashSet
             ) {
            System.out.println(car);
        }
        //add them

        carHashSet.add(new Car(2,"VinCar02",2021));
        System.out.println("So phan tu:" + carHashSet.size());
        for (Car car: carHashSet
        ) {
            System.out.println(car);
        }

        //remove

        carHashSet.remove(new Car(2,"VinCar02",2021));
        System.out.println("So phan tu sau khi xoa:" + carHashSet.size()); // 3

        //contains

        boolean check = carHashSet.contains(new Car(1,"VinCar01",2020));
        System.out.println(check == true? "Co chua phan tu nay": "Khong chua phan tu nay");

        //clear
        carHashSet.clear();
        System.out.println("So phan tu:" + carHashSet.size());


    }
}
