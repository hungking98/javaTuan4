package Tuan4;

import java.util.TreeSet;

public class Card implements Comparable<Card>{ // the atm
    private int id;
    private String name;
    private  String bank;

    public  Card(int id, String name, String bank){
        this.id = id;
        this.name = name;
        this.bank = bank;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setBank(String bank) {
        this.bank = bank;
    }

    public String getBank() {
        return bank;
    }

    @Override
    public String toString() {
        return "Card{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", bank='" + bank + '\'' +
                '}';
    }

    @Override
    //so sanh theo ten
    public int compareTo(Card o) {
        return getName().compareTo(o.getName());
    }
}
