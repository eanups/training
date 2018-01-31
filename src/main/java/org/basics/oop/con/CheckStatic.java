package org.basics.oop.con;


public class CheckStatic {
    static int stat = 0;
    int nonStat = 0;

    public static void main(String[] args) {
        CheckStatic c1 = new CheckStatic();
        CheckStatic c2 = new CheckStatic();

        c1.nonStat += 1;
        CheckStatic.stat += 1;
        System.out.println(c1.nonStat);
        System.out.println(c1.stat); // Warns as it is being accessed through an object

        c2.nonStat += 5;
        CheckStatic.stat += 5;
        System.out.println(c2.nonStat);
        System.out.println(c2.stat); // Warns as it is being accessed through an object

        // What is the output ?
        // 1 1 6 5
        // 2 2 6 8
        // 2 2 5 6
        // 1 1 5 6
        // 1 1 6 8

    }

}
