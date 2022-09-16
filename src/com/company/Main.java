package com.company;

import java.util.ArrayList;
import java.util.Iterator;

public class Main {

    public static void main(String[] args) {
//	for(int i = 10; i>=1; i--){
//        System.out.println("wartość i to: " + i);
//    }

//tak sie tworzy listę intów
        ArrayList<Integer> numberList = new ArrayList<>();
        numberList.add(1);
        numberList.add(3);
        numberList.add(7);
        numberList.add(10);
        numberList.add(50);
        System.out.println(numberList);

//for loop
        System.out.println("for loop: ");
        for (int i = 0; i < numberList.size(); i++) {
            System.out.println(numberList.get(i));
        }

// advance for loop
        System.out.println("advance for loop:");
        for (Integer num : numberList) {
            System.out.println(num);
        }
//while
        System.out.println("while: ");
        int count = 0;
        while (numberList.size() > count) {
            System.out.println(numberList.get(count));
            count++;
        }
//Looping Array List using Iterator
        System.out.println("Iterator: ");
        Iterator iter = numberList.iterator();
        while (iter.hasNext()) {
            System.out.println(iter.next());
        }
    }
}
