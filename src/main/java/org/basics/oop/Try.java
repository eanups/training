package org.basics.oop;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//abstract class Ab {
//    String
//}

public class Try {
    public static void main(String[] args) {

        int[] intList = new int[20];
        intList[4] = 2222;
        System.out.println(intList);
        for (int i=0; i<20; i++)
        {
            System.out.print(intList[i]);
            System.out.print(", ");
        }
        System.out.println();

        List<String> names = new ArrayList<String>();
        names.add("Neo");
        names.add("Trinity");

        System.out.println(names);

        List<Integer> intL = new ArrayList<Integer>();
        intL.add(444);
        System.out.println(intL);
    }
}
