package org.basics.oop.reln;

public abstract class Room {

    final String name = "Abstracto";

    // specific behavior
    public abstract void showCapacity();

    public void turnOnAC() {
        System.out.println("Some junk AC");
    }

    //Overloaded method with variable argument.
    public void turnOnAC(int x) {
        System.out.println("Turn on AC with: " + x);
    }

    // generic behavior
    public void showLights() {
        System.out.println("Lighting the room!");
    }
}

