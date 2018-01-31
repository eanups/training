package org.basics.oop.obj;

import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

import java.util.ArrayList;
import java.util.List;

public class ListObj {
    public static void main(String[] args) {

        List<String> names = new ArrayList<String>();
        names.add("Neo");
        names.add("Trinity");

        System.out.println(names);

        List<Integer> intL = new ArrayList<Integer>();
        intL.add(444);
        System.out.println(intL); // Prints out the Array list contents as ArrayList implements toString

        int[] intList = new int[20];
        intList[4] = 2222;
        System.out.println(intList); // Prints out the object reference

        for (int i=0; i<20; i++)
        {
            System.out.print(intList[i]);
            System.out.print(", ");
        }
        System.out.println();

        // Use reflection API to print out array contents
        System.out.println("Int Array List :" + ToStringBuilder.reflectionToString(intList));
        System.out.println("Int Array List :"+ ToStringBuilder.reflectionToString(intList,
                ToStringStyle.SIMPLE_STYLE));

    }
}
