package Tuan4;

import java.util.*;

public class Bai9 {
    public static void main(String[] args) {
        TreeSet<Card> cardTreeSet = new TreeSet<Card>();

        //add
        cardTreeSet.add(new Card(12345,"Nguyen Van Tam","VietinBank"));
        cardTreeSet.add(new Card(12345678,"Nguyen Van Tam","Vietin"));
        cardTreeSet.add(new Card(123456,"Nguyen Van Anh","Tech"));
        cardTreeSet.add(new Card(123456789,"Nguyen Van Hanh","BIDV"));
        cardTreeSet.add(new Card(123456780,"Nguyen Van Tai","None"));


        //--> 4 phan tu duy nhat do tieu chi so sanh la name;

        System.out.println(cardTreeSet.size());
        List<Card> cardList = new ArrayList<Card>();
        cardList.addAll(cardTreeSet);
        //in theo list
        System.out.println("In theo list sap xep theo ten");
        for (Card card: cardList
             ) {
            System.out.println(card);

        }
        //tìm kiếm theo  tên:
        Card keyCard = new Card(0000,"Nguyen Van Hanh","MMMM");
        int key = Collections.binarySearch(cardList, keyCard);
        System.out.println("Vị trí trong list:"+ key);



        //Cài lại tiêu chí so sánh
        SortedSet<Card> sortedSet = new TreeSet<Card>(new Comparator<Card>() {
            @Override
            public int compare(Card o1, Card o2) {
                return o1.getId() - o2.getId();
            }
        });

        //sap xep theo id va in ra theo ArrayList
        sortedSet.addAll(cardTreeSet);
        List<Card> newCard = new ArrayList<Card>();

        newCard.addAll(sortedSet);
        System.out.println("In ra theo List, sap xep theo id:");
        for (Card card: newCard
        ) {
            System.out.println(card);

        }

        Card keyCard1 = new Card(123456780,"Nguyen Van Hanh","MMMM");
        int key1 = Collections.binarySearch(newCard, keyCard1, new Comparator<Card>() {
            @Override
            public int compare(Card o1, Card o2) {
                return o1.getId() - o2.getId();
            }
        });
        System.out.println("Vị trí:" + key1);

        //remove
        //clear

        cardTreeSet.clear();
        sortedSet.clear();



    }
}
