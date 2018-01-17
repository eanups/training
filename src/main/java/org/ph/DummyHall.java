package org.ph;

public class DummyHall {

    public static void main(String[] args) {
        System.out.println("Welcome to the real world!");

        DummyRoom room = new DummyRoom();
        System.out.println(room.location); // Protected member (package-private and inheritance access)
        System.out.println(room.name); // Public member (exclusive access)
        System.out.println(room.temperature); // Default member (package-private access)
        //System.out.println(room.area); //Cannot Access private (only-class access)
        System.out.println(room.getArea()); // Default member (package-private access)


    }
}

