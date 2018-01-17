package org.basics.oop.acc.other;

import org.basics.oop.acc.DummyRoom;

public class PhDummyRoom extends DummyRoom {


    public void write() {
        return;
    }


    public static void main(String[] args) {
        // Cannot access through packages
        /*DummyRoom confRoom = new DummyRoom();
        System.out.println("PhDummyRoom Loc:" + confRoom.location);*/

        PhDummyRoom phConfRoom = new PhDummyRoom();
        System.out.println("PhDummyRoom Location:" + phConfRoom.location); // protected - through inheritance

        System.out.println("PhDummyRoom Name:" + phConfRoom.name); // public - accessible anywhere

        // System.out.println("PhDummyRoom Area:" + phConfRoom.area); // private - no access
        System.out.println("PhDummyRoom Area:" + phConfRoom.getArea());
        // System.out.println("PhDummyRoom Temperature:" + phConfRoom.temperature); // default - package private only


    }
}
